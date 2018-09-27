package com.internousdev.sampleweb.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb.dao.MCategoryDAO;
import com.internousdev.sampleweb.dto.MCategoryDTO;
import com.internousdev.sampleweb.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;
//----------------------------------------------------------------------------------------------------------------------------------------------
public class HomeAction extends ActionSupport implements SessionAware{
//----------------------------------------------------------------------------------------------------------------------------------------------
	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
	private String categoryId;
	private Map<String, Object> session;
//----------------------------------------------------------------------------------------------------------------------------------------------
	public String execute() {

		if
		 (!(session.containsKey("loginId")) && !(session.containsKey("tempUserId")))			//loginIdとtempUserIdが両方存在しなければtrue
		 {
			 CommonUtility commonUtility = new CommonUtility();											//インスタンス化
			 session.put("tempUserId", commonUtility.getRamdomValue());							//セッション変数化かつ、メソッド実行

		 }

		if
		(!session.containsKey("logined"))																				//ログイン判定sessionが存在しなければtrue
		{session.put("logined", 0);}																						//セッション変数に0を代入し、未ログイン化する

		if
		(!session.containsKey("mCategoryList"))																	//カテゴリリストの生成 カテゴリリストが存在していなければtrue
		{
			MCategoryDAO mCategoryDao = new MCategoryDAO();										//インスタンス化
			mCategoryDtoList = mCategoryDao.getMCategoryList();										//空リスト作成、メソッド実行
			session.put("mCategoryDtoList", mCategoryDtoList);											//セッション変数化
		}



		return SUCCESS;
	}

//----------------------------------------------------------------------------------------------------------------------------------------------

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryDtoList;
	}
	public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
		this.mCategoryDtoList = mCategoryDtoList;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}