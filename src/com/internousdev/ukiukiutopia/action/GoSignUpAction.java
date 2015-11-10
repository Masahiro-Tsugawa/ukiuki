package com.internousdev.ukiukiutopia.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoSignUpAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private String userName;
	private String userPassword;
	private String userPostalCode;
	private String userAdress1;
	private String userAdress2;
	private String userAdress3;
	private String userEmail;
	private String userTelNum;

	public String execute() throws Exception {
		session.put("userName", userName);
		session.put("userPassword", userPassword);
		session.put("userPostalCode", userPostalCode);
		StringBuilder userAdress = new StringBuilder();
		userAdress.append(userAdress1);
		userAdress.append(userAdress2);
		userAdress.append(userAdress3);
		session.put("userAdress", userAdress);
		session.put("userEmail", userEmail);
		session.put("userTelNum", userTelNum);
		return "success";
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserTelNum() {
		return userTelNum;
	}

	public void setUserTelNum(String userTelnum) {
		this.userTelNum = userTelnum;
	}

	public String getUserPostalCode() {
		return userPostalCode;
	}

	public void setUserPostalCode(String userPostalCode) {
		this.userPostalCode = userPostalCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserAdress1() {
		return userAdress1;
	}

	public void setUserAdress1(String userAdress1) {
		this.userAdress1 = userAdress1;
	}

	public String getUserAdress2() {
		return userAdress2;
	}

	public void setUserAdress2(String userAdress2) {
		this.userAdress2 = userAdress2;
	}

	public String getUserAdress3() {
		return userAdress3;
	}

	public void setUserAdress3(String userAdress3) {
		this.userAdress3 = userAdress3;
	}

	public void setSession(Map<String, Object> session) {
		this.session= session;
	}

}