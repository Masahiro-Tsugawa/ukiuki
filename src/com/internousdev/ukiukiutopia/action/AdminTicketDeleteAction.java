/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.AdminTicketDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AdminTicketDeleteAction extends ActionSupport implements SessionAware {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String delid;
	int count;
	public String result=ERROR;
	private Map<String, Object> session;

		public String execute() throws Exception {

		AdminTicketDeleteDAO dao = new AdminTicketDeleteDAO();
		
		int delid = (int) session.get("id");
		System.out.println(session.get("id"));
		count = dao.delete(delid);
		
		System.out.println(count);

		if(count>0){
			System.out.println("if文");
			result = SUCCESS;
		}
		session.remove(delid);
		return result;
		}
		
		public String getDelid() {
			return delid;
		}

		public void setDelid(String delid) {
			this.delid = delid;
		}
		
		public Map<String, Object> getSession() {
			return session;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

	}
