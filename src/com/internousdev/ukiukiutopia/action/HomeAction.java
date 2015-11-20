package com.internousdev.ukiukiutopia.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.HomeDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author A.Masui
 * @version 1.1　
 * @since 1.0　
 * @author データーベースからid,name,emailの情報を取得、sessionに格納する為のクラス
 * 
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
	 *  ユーザーemail取得メソッド
	 * @param email ユーザーのemail
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 *  ユーザーpassword取得メソッド
	 * @return password ユーザーのpassword
	 */
	public String getPassword() {
		return password;
	}

	/**
	 *  ユーザーpassword取得メソッド
	 * @param password ユーザーのpassword
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 *  ユーザーidError取得メソッド
	 * @return idError 
	 * ID,Passwordの入力間違い
	 */
	public String getIdError() {
		return idError;
	}

	/**
	 *  ユーザーidError取得メソッド
	 * @param idError ユーザーidError
	 * ID,Passwordの入力間違い
	 */
	public void setIdError(String idError) {
		this.idError = idError;
	}

}
