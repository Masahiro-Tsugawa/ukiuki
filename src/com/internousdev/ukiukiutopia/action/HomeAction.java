package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.HomeDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * データーベースからid,name,emailの情報を取得、sessionに格納する為のクラス
 * @author A.Masui
 * @version 1.1　
 * @since 1.0　
 */
public class HomeAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 4082942802275159738L;
	/**
	 * メールアドレス
	 */
	private String email;
	/**
	 * パスワード
	 */
	private String password;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	/**
	 * エラーメッセージ
	 */
	private String idError;
	
	/**
	 * データーベースからid,name,emailをsessionに格納するメソッド
	 * @return result データーベースからid,name,emailをsessionに格納できたか否か
	 */
	public String execute(){
		
		String result = ERROR;
		HomeDAO dao = new HomeDAO();
		
		if(dao.select(email,password)){
			session.put("userId", dao.getId());
			session.put("loginName", dao.getName());
			session.put("userEmail", email);
			result = SUCCESS;
			return result;
		}
		
		setIdError(getText("home.mistaken"));
		return result;
	}

	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}	

	/**
	 * エラーメッセージ取得メソッド
	 * @return idError エラーメッセージ
	 */
	public String getIdError() {
		return idError;
	}

	/**
	 * エラーメッセージ格納メソッド
	 * @param idError エラーメッセージ
	 */
	public void setIdError(String idError) {
		this.idError = idError;
	}

	/**
	 * メールアドレス取得メソッド
	 * @return email メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレス格納メソッド
	 * @param email メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * パスワード取得メソッド
	 * @return password パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワード格納メソッド
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
