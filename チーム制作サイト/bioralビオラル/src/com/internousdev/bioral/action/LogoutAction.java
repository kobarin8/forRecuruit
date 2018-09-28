package com.internousdev.bioral.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bioral.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	private String categoryId;
	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;
		UserInfoDAO userInfoDAO = new UserInfoDAO();

		// session.clear();する前に、keepLoginId(loginIdから変更)とsavedLoginIdをsession.
		// getで取得しておく。
		String loginId = String.valueOf(session.get("keepLoginId"));
		boolean savedLoginId = Boolean.valueOf(String.valueOf(session.get("savedLoginId")));

		int count = userInfoDAO.logout(loginId);
		System.out.println(count);
		if (count > 0) {
			session.clear();
			// session.getでキープしておいた値をsession.putで入れ直す。→keepLoginId(loginIdから変更)保存時、
			// ログイン画面でloginId表示＆loginID保存にチェックが入る
			session.put("savedLoginId", savedLoginId);
			session.put("keepLoginId", loginId);
			result = SUCCESS;
		} else {
			// 強制ログアウト(sessionが切れた時、強制的にログアウトする。)
			int forcedLogout = userInfoDAO.forcedLogout();
			System.out.println(forcedLogout);
			System.out.println("接続が切れました。");
			session.clear();
		}
		return result;
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
