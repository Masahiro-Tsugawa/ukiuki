package com.internousdev.ukiukiutopia.action;

import java.sql.SQLException;
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

	
	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	private Map<String, Object> session;
	private String idError;

	public String execute() throws SQLException {
		HomeDAO dao = new HomeDAO();
		String ret = dao.select(email,password);
		session.put("userId", dao.getId());
		session.put("loginName", dao.getName());
		session.put("userEmail", email);
		
		if(ret == "error"){
			setIdError(getText("home.mistaken"));
		}
		return ret;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}	
	
	

	
	/**
	 *  ユーザーemail取得メソッド
	 * @return ユーザーのemail
	 */
	public String getEmail() {
		return email;
	}

	/**
	 *  顧客email取得メソッド
	 * @param email 顧客のemail
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 *  顧客password取得メソッド
	 * @return password 顧客のpassword
	 */
	public String getPassword() {
		return password;
	}

	/**
	 *  顧客password取得メソッド
	 * @param password 顧客のpassword
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * idError取得メソッド
	 * @return idError ID,Passwordの入力間違い
	 */
	public String getIdError() {
		return idError;
	}

	/**
	 * idError取得メソッド
	 * @param idError ID,Passwordの入力間違い
	 */
	public void setIdError(String idError) {
		this.idError = idError;
	}

}
