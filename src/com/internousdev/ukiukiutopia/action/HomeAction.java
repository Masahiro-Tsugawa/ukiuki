package com.internousdev.ukiukiutopia.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.HomeDAO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
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
			setIdError(getText("mistaken"));
		}
		System.out.println(session.get("userId"));
		System.out.println(session.get("loginName"));
		System.out.println(session.get("userEmail"));
		return ret;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}	
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdError() {
		return idError;
	}

	public void setIdError(String idError) {
		this.idError = idError;
	}

}
