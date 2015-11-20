/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理ページからログアウトする為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminLogoutAction extends ActionSupport implements SessionAware{

	/**
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 8936223776548902089L;
	/***
	 * 管理者名を保持しているセッションを取得する
	 */
	private Map<String,Object >session;
	/***
	 * ログイン状態変更の結果
	 */
	private String result;
	
	/***
	 * ログアウトできなかった際のエラーメッセージ
	 */
	private String errorLogout;
	
	/**
	 * 管理者ページからログアウトするメソッド
	 * @return SUCCESS
	 */
	public String execute() {
		result = ERROR;
		session.clear();
		
		if (session.containsKey("name_key")){
			setErrorLogout("ログアウトに失敗しました");
			return result;
		}
		result = SUCCESS;
		return result;
	}

	/**
	 * エラーメッセージを取得するメソッド
	 * @return errorLogout
	 */
	public String getErrorLogout(){
		return errorLogout;
	}
	/**
	 * エラーメッセージを格納するメソッド
	 * @param errorLogout エラーメッセージ
	 */
	public void setErrorLogout(String errorLogout) {
		this.errorLogout = errorLogout;
	}
	
	/**
	 * セッション取得するメソッド
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * セッション格納するメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
