package com.internousdev.bioral.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bioral.dao.MCategoryDAO;
import com.internousdev.bioral.dao.UserInfoDAO;
import com.internousdev.bioral.dto.MCategoryDTO;
import com.internousdev.bioral.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserCompleteAction extends ActionSupport implements SessionAware {

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String sex;
	private String email;
	private String loginId;
	private String password;
	private String categoryId;
	private Map<String, Object> session;

	// LoginActionから
	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();

	public String execute() {
		String result = ERROR;
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		int count = userInfoDAO.createUser(familyName, firstName, familyNameKana, firstNameKana, sex, email, loginId,
				password);
		if (count > 0) {
			System.out.println("登録されたユーザー数は" + count + "人です。");
		}
		// LoginActionから-------------------------------------------------
		if (!session.containsKey("mCategoryList")) {
			MCategoryDAO mCategoryDAO = new MCategoryDAO();
			mCategoryDtoList = mCategoryDAO.getMCategoryList();
			session.put("mCategoryDtoList", mCategoryDtoList);
		}

		if (userInfoDAO.isExistsUserInfo(loginId, password)) {
			if (userInfoDAO.login(loginId, password) > 0) {
				UserInfoDTO userInfoDTO = userInfoDAO.getUserInfo(loginId, password);
				session.put("loginId", userInfoDTO.getUserId());
				// session.keeploginId追加
				// →ログイン、ログアウト機能とそれ以外でuser_idのsessionを分けるため。
				session.put("keepLoginId", userInfoDTO.getUserId());
				// statusをsession.putする。(管理者ページ判定用)
				session.put("status", userInfoDTO.getStatus());

				result = SUCCESS;
			}
			session.put("logined", 1);
		}
		// ----------------------------------------------------------------

		return result;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
