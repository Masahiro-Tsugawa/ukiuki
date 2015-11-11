package com.internousdev.ukiukiutopia.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ukiukiutopia.dao.AdminLoginDAO;
import com.internousdev.ukiukiutopia.dto.AdminLoginDTO;

/**
 * @author internous
 *
 */
public class AdminLoginAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private String name;
	private String password;
	private boolean isLogin;
	private Map<String, Object> session;

	public String execute() throws SQLException {
		System.out.println("bbbb");
		if (name == null || name.equals(" ")) {
			addActionError("ユーザー名を入力してください");
			return ERROR;
		}
		if (password == null || password.equals(" ")) {
			addActionError("パスワードを入力してください");
			return ERROR;
		}

		AdminLoginDAO dao = new AdminLoginDAO();
		AdminLoginDTO dto = new AdminLoginDTO();
		String ret = dao.select(name, password, dto);

		if (ret == "error") {
			addActionError("ユーザー名もしくはパスワードが違います");
		}else if (dto.getIsLogin() == true) {
			addActionError("すでにログインしているユーザーです");
		}else{
			session.put("name_key", dto.getName());
			System.out.println(dto.getName());
		}

		
		return ret;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public boolean getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}
}