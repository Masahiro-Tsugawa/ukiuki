package com.internousdev.ukiukiutopia.action;
/**
 * 
 */

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import com.internousdev.ukiukiutopia.dao.AdminUserUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AdminUserUpdateAction extends ActionSupport implements SessionAware {

	private String purposeEmail = null;
	private String updateEmail = null;
	private String updatePassword = null;
	private String updateName = null;
	private String updateTelNum = null;
	private String updatePostalCode = null;
	private String updateAddress = null;
	private String updateRenewDate = null;

	String up = null;
	public String result = ERROR;
	private Map<String, Object> session;

	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {

		purposeEmail = (String) session.get("email");

		DateTime dt = new DateTime();
		updateRenewDate = dt.toString(DateTimeFormat.mediumDateTime());

		AdminUserUpdateDAO dao = new AdminUserUpdateDAO();

		int up = dao.update(purposeEmail, updateEmail, updatePassword, updateName, updateTelNum, updatePostalCode,
				updateAddress, updateRenewDate);

		if (up > 0) {
			result = SUCCESS;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getUpdateEmail() {
		return updateEmail;
	}

	public void setUpdateEmail(String updateEmail) {
		this.updateEmail = updateEmail;
	}

	public String getUpdatePassword() {
		return updatePassword;
	}

	public void setUpdatePassword(String updatePassword) {
		this.updatePassword = updatePassword;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public String getUpdateTelNum() {
		return updateTelNum;
	}

	public void setUpdateTelNum(String updateTelNum) {
		this.updateTelNum = updateTelNum;
	}

	public String getUpdatePostalCode() {
		return updatePostalCode;
	}

	public void setUpdatePostalCode(String updatePostalCode) {
		this.updatePostalCode = updatePostalCode;
	}

	public String getUpdateAddress() {
		return updateAddress;
	}

	public void setUpdateAddress(String updateAddress) {
		this.updateAddress = updateAddress;
	}

	public String getUpdateRenewDate() {
		return updateRenewDate;
	}

	public void setUpdateRenewDate(String updateRenewDate) {
		this.updateRenewDate = updateRenewDate;
	}
}
