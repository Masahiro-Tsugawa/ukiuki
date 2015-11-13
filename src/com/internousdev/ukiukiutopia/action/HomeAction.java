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
	private String id;
	private String password;
	private Map<String, Object> session;
	private String idError;

	public String execute() throws SQLException {
		System.out.println("a");
		HomeDAO dao = new HomeDAO();
		System.out.println("b");
		String ret = dao.select(id, password);
		System.out.println("c");
		session.put("loginName", dao.getAdmin_name());
		System.out.println("d");
		session.put("userEmail", id);
		System.out.println("e");
		if(ret == "error"){
			setIdError("IDまたはパスワードが間違っています");
		}
		System.out.println(id);
		System.out.println(password);
		return ret;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
		System.out.println("f");
	}	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		System.out.println("g");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("h");
	}

	public String getIdError() {
		return idError;
	}

	public void setIdError(String idError) {
		this.idError = idError;
	}

}
