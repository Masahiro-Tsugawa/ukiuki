package com.internousdev.ukiukiutopia.action;
/**
 * 
 */


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.AdminUserUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AdminUserUpdateAction extends ActionSupport implements SessionAware{

	private String purposeEmail;
	
	private String updateemail;
	private String updatepassword;
	private String updatename;
	private String updatetelnum;
	private String updatepostalcode;
	private String updateaddress;
	private String updaterenewdate;
	
	String up=null;
	public String result=ERROR;
	private Map<String, Object> session;
	
	private static final long serialVersionUID = 1L;

		public String execute() throws Exception {


		AdminUserUpdateDAO dao = new AdminUserUpdateDAO();
		
		String purposeEmail = (String) session.get("email");
		System.out.println(purposeEmail);
		
		int up = dao.update(purposeEmail,updateemail,updatepassword,updatename,updatetelnum,updatepostalcode,updateaddress,updaterenewdate);

		if(up > 0){
			result = SUCCESS;
		}
		return result;
		}

		public String getUpdateEmail(){
			return updateemail;
		}
		public void setUpdateEmail(String updateemail){
			this.updateemail=updateemail;
		}
		public String getUpdatePassword(){
			return updatepassword;
		}
		public void setUpdatePassword(String updatepassword){
			this.updatepassword=updatepassword;
		}
		public String getUpdateName(){
			return updatename;
		}
		public void setUpdateName(String updatename){
			this.updatename=updatename;
		}
		public String getUpdateTelnum(){
			return updatetelnum;
		}
		public void setUpdateTelnum(String updatetelnum){
			this.updatetelnum=updatetelnum;
		}
		public String getUpdatePostalcode(){
			return updatepostalcode;
		}
		public void setUpdatePostalcode(String updatepostalcode){
			this.updatepostalcode=updatepostalcode;
		}
		public String getUpdateAddress(){
			return updateaddress;
		}
		public void setUpdateAddress(String updateaddress){
			this.updateaddress=updateaddress;
		}
		public String getUpdateRenewdate(){
			return updaterenewdate;
		}
		public void setUpdateRenewdate(String updaterenewdate){
			this.updaterenewdate=updaterenewdate;
		}
		
	
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getPurposeEmail() {
		return purposeEmail;
	}

	public void setPurposeEmail(String purposeEmail) {
		this.purposeEmail = purposeEmail;
	}

}
