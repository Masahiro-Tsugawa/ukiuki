package com.internousdev.ukiukiutopia.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.AdminUserDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AdminUserDeleteAction extends ActionSupport implements SessionAware {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String delmail;
	int count;
	public String result=ERROR;
	private Map<String, Object> session;

		public String execute() throws Exception {

		AdminUserDeleteDAO dao = new AdminUserDeleteDAO();
		
		String delmail = (String) session.get("email");
		System.out.println(session.get("email"));
		count = dao.delete(delmail);
		
		System.out.println(count);

		if(count>0){
			System.out.println("if文");
			result = SUCCESS;
		}
		return result;
		}
		
		public String getDelmail() {
			return delmail;
		}

		public void setDelmail(String delmail) {
			this.delmail = delmail;
		}
		
		public Map<String, Object> getSession() {
			return session;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

	}
