/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理ページからログアウトする為のアクション
 * @author Mizukoshi Shizuka
 * @since 2015/11/18
 * @version 1.0
 */
public class AdminLogoutAction extends ActionSupport implements SessionAware{

	/***
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 1L;

	/***
	 * 管理者名を保持しているセッションを取得する
	 */
	private Map<String,Object >session;
	/***
	 * ログイン状態変更の結果
	 */
	private String result;
	
	/**
	 * 管理者ページからログアウトするメソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return SUCCESS
	 */
	public String execute() {
		result = ERROR;
		session.clear();
		
		if (session.containsKey("name_key")){
			return result;
		}
		result = SUCCESS;
		return result;
	}
	/**
	 * セッション取得メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * セッション格納メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
