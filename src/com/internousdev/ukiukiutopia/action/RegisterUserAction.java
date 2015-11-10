package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.RegisterUserDAO;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterUserAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;
	private String userEmail;
	private String userPassword;
	private String userName;
	private String userTelNum;
	private String userPosCode;
	private String userAddress;
	int count;
	public String action = ERROR;

	public String execute() throws Exception {
		System.out.println("■reguserActiont内");

		userEmail = (String) session.get("signUpEmail");
		userPassword = (String) session.get("signUpPassword");
		userName = (String) session.get("signUpName");
		userTelNum = (String) session.get("signUpTelNum");
		userPosCode = (String) session.get("signUpPostalCode");
		userAddress = (String) session.get("signUpAddress");

		RegisterUserDAO dao = new RegisterUserDAO();

		System.out.println("■reguserDAOに突入");
		count = dao.insert(userEmail, userPassword, userName, userTelNum, userPosCode, userAddress);

		if (count > 0) {
			action = SUCCESS;
		}

		return action;

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
