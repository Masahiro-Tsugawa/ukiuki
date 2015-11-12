package com.internousdev.ukiukiutopia.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.CreateUserDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserAction extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7016065614706474231L;
	private Map<String, Object> session;
	private String userName1;
	private String userName2;
	private String userPassword;
	private String confirmUserPassword;
	private String userPostalCode;
	private String userAddress1;
	private String userAddress2;
	private String userAddress3;
	private String userEmail;
	private String confirmUserEmail;
	private String userTelNum;
	private String errorMail;

	public String execute() throws SQLException {
		CreateUserDAO dao = new CreateUserDAO();
		String ret = dao.select(userEmail);
		if(ret == "error"){
			  setErrorMail("すでに登録されてるメールアドレスです");
			}
		StringBuilder userName = new StringBuilder();
		userName.append(userName1);
		userName.append(userName2);
		session.put("signUpName", userName.toString());
		session.put("signUpPassword", userPassword);
		session.put("signUpPostalCode", userPostalCode);
		StringBuilder userAddress = new StringBuilder();
		userAddress.append(userAddress1);
		userAddress.append(userAddress2);
		userAddress.append(userAddress3);
		session.put("signUpAddress", userAddress.toString());
		session.put("signUpEmail", userEmail);
		session.put("signUpTelNum", userTelNum);
		return ret;
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

	public String getErrorMail() {
		return errorMail;
	}

	public void setErrorMail(String errorMail) {
		this.errorMail = errorMail;
	}

	public String getUserName1() {
		return userName1;
	}

	public void setUserName1(String userName1) {
		this.userName1 = userName1;
	}

	public String getUserName2() {
		return userName2;
	}

	public void setUserName2(String userName2) {
		this.userName2 = userName2;
	}



}