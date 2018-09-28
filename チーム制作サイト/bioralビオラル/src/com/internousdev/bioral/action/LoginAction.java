package com.internousdev.bioral.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bioral.dao.CartInfoDAO;
import com.internousdev.bioral.dao.DestinationInfoDAO;
import com.internousdev.bioral.dao.MCategoryDAO;
import com.internousdev.bioral.dao.UserInfoDAO;
import com.internousdev.bioral.dto.DestinationInfoDTO;
import com.internousdev.bioral.dto.MCategoryDTO;
import com.internousdev.bioral.dto.UserInfoDTO;
import com.internousdev.bioral.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private String categoryId;
	private String loginId;
	private String password;

	private boolean savedLoginId;

	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();

	private List<String> loginIdErrorMessageList = new ArrayList<String>();
	private List<String> passwordErrorMessageList = new ArrayList<String>();
	List<String> nonExistsErrorMessageList = new ArrayList<String>();

	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;

		// session.loginId→session.keepLoginIdに変更
		if (savedLoginId == true) {
			session.put("savedLoginId", true);
			session.put("keepLoginId", loginId);
		} else {
			session.put("savedLoginId", false);
			session.remove("keepLoginId");
		}

		// エラーメッセージ判定
		InputChecker inputChecker = new InputChecker();
		loginIdErrorMessageList = inputChecker.doCheck("ログインID", loginId, 1, 8, true, false, false, true, false, false,
				false, false);
		passwordErrorMessageList = inputChecker.doCheck("パスワード", password, 1, 16, true, false, false, true, false,
				false, false, false);
		UserInfoDAO userInfoDAO = new UserInfoDAO();

		if (loginIdErrorMessageList.size() == 0 && passwordErrorMessageList.size() == 0) {
			if (!(userInfoDAO.isExistsUserInfo(loginId, password))) {
				nonExistsErrorMessageList.add("入力されたパスワードが異なります。");
			}
		}

		// エラーメッセージが空でない時、メッセージ表示 + loginedを0に
		if (loginIdErrorMessageList.size() != 0 || passwordErrorMessageList.size() != 0
				|| nonExistsErrorMessageList.size() != 0) {
			session.put("loginIdErrorMessageList", loginIdErrorMessageList);
			session.put("passwordErrorMessageList", passwordErrorMessageList);
			// session追加（nonExistsErrorMessageList）
			session.put("nonExistsErrorMessageList", nonExistsErrorMessageList);
			session.put("logined", 0);
		}

		if (!session.containsKey("mCategoryList")) {
			MCategoryDAO mCategoryDAO = new MCategoryDAO();
			mCategoryDtoList = mCategoryDAO.getMCategoryList();
			session.put("mCategoryDtoList", mCategoryDtoList);
		}

		// インスタンス化を上に移動（エラーメッセージ関連）
		if (userInfoDAO.isExistsUserInfo(loginId, password)) {
			if (userInfoDAO.login(loginId, password) > 0) {
				UserInfoDTO userInfoDTO = userInfoDAO.getUserInfo(loginId, password);
				session.put("loginId", userInfoDTO.getUserId());
				// session.keeploginId追加
				// ログイン、ログアウト機能とそれ以外でuser_idのsessionを分ける
				session.put("keepLoginId", userInfoDTO.getUserId());
				// statusをsession.putする。(管理者ページ判定用)
				session.put("status", userInfoDTO.getStatus());

				int count = 0;
				CartInfoDAO cartInfoDAO = new CartInfoDAO();
				count = cartInfoDAO.linkToLoginId(String.valueOf(session.get("tempUserId")), loginId);

				// 判定(admin>settlement>success)
				// statusが1の時、管理者画面へ
				if (session.get("status").equals("1")) {
					result = "admin";
					session.put("logined", 1);
				} else if (count > 0) {
					DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();
					try {
						List<DestinationInfoDTO> destinationInfoDtoList = new ArrayList<DestinationInfoDTO>();
						System.out.println(String.valueOf(session.get("loginId")));
						System.out.println(String.valueOf(session.get("keepLoginId")));
						System.out.println(loginId);
						destinationInfoDtoList = destinationInfoDAO.getDestinationInfo(loginId);
						Iterator<DestinationInfoDTO> iterator = destinationInfoDtoList.iterator();
						if (!(iterator.hasNext())) {
							destinationInfoDtoList = null;
						}
						session.put("destinationInfoDtoList", destinationInfoDtoList);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					result = "settlement";
					session.put("logined", 1);
				} else {
					result = SUCCESS;
					session.put("logined", 1);
				}
			}
		}
		return result;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isSavedLoginId() {
		return savedLoginId;
	}

	public void setSavedLoginId(boolean savedLoginId) {
		this.savedLoginId = savedLoginId;
	}

	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryDtoList;
	}

	public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
		this.mCategoryDtoList = mCategoryDtoList;
	}

	public List<String> getLoginIdErrorMessageList() {
		return loginIdErrorMessageList;
	}

	public void setLoginIdErrorMessageList(List<String> loginIdErrorMessageList) {
		this.loginIdErrorMessageList = loginIdErrorMessageList;
	}

	public List<String> getPasswordErrorMessageList() {
		return passwordErrorMessageList;
	}

	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList) {
		this.passwordErrorMessageList = passwordErrorMessageList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
