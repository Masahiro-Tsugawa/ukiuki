package com.internousdev.ukiukiutopia.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private String userName;
	private String userPassword;
	private String confirmUserPassword;
	private String userPostalCode;
	private String userAddress1;
	private String userAddress2;
	private String userAddress3;
	private String userEmail;
	private String confirmUserEmail;
	private String userTelNum;

	public String execute() throws SQLException {
		session.put("signUpName", userName);
		session.put("signUpPassword", userPassword);
		session.put("signUpPostalCode", userPostalCode);
		StringBuilder userAddress = new StringBuilder();
		userAddress.append(userAddress1);
		userAddress.append(userAddress2);
		userAddress.append(userAddress3);
		session.put("signUpAddress", userAddress);
		session.put("signUpEmail", userEmail);
		session.put("signUpTelNum", userTelNum);
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
	
	public String getConfirmUserPassword() {
		return confirmUserPassword;
	}

	public void setConfirmUserPassword(String confirmUserPassword) {
		this.confirmUserPassword = confirmUserPassword;
	}

	public String getUserAddress1() {
		return userAddress1;
	}

	public void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}

	public String getUserAddress2() {
		return userAddress2;
	}

	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}

	public String getUserAddress3() {
		return userAddress3;
	}

	public void setUserAddress3(String userAddress3) {
		this.userAddress3 = userAddress3;
	}

	public void setSession(Map<String, Object> session) {
		this.session= session;
	}

	public String getConfirmUserEmail() {
		return confirmUserEmail;
	}

	public void setConfirmUserEmail(String confirmUserEmail) {
		this.confirmUserEmail = confirmUserEmail;
	}



}