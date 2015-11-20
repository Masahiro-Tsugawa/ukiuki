/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.AdminLogoutDAO;
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
	/**
	 * 管理者ID
	 */
	int id;
	/***
	 * ログイン状態変更の結果
	 */
	private String result = ERROR;
	
	/***
	 * ログアウトできなかった際のエラーメッセージ
	 */
	private String errorLogout;
	
	/**
	 * 管理者ページからログアウトするメソッド
	 * @return ログアウト成功の可否
	 */
	public String execute() {
		
		AdminLogoutDAO dao = new AdminLogoutDAO();
		int id = (int) session.get("id");
		int rscount = dao.update(id);
		
		if(rscount<0){
			setErrorLogout("ログアウトに失敗しました");
			return result;
		}
		
		session.clear();
		
		if (session.containsKey("name_key")){
			setErrorLogout("ログアウトに失敗しました");
			return result;
		}
		if (rscount<1) {
			addActionError("ログアウトに失敗しました");
			result = ERROR;
			return result;
		}
		result = SUCCESS;
		return result;
	}


	/**
	 * 管理者ID取得メソッド
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 管理者ID格納メソッド
	 * 
	 * @param id
	 *         管理者ID
	 */
	public void setId(int id) {
		this.id = id;
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
