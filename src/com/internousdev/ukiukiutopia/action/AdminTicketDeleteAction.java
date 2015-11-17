/**
 * 
 */
package com.internousdev.ukiukiutopia.action;


import com.internousdev.ukiukiutopia.dao.AdminTicketDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AdminTicketDeleteAction extends ActionSupport {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int deleteId;
	int count;
	public String result=ERROR;

		public String execute() throws Exception {

		AdminTicketDeleteDAO dao = new AdminTicketDeleteDAO();
		
		deleteId = getDeleteId();
		
		count = dao.delete(deleteId);
		
		System.out.println(count);

		if(count>0){
			System.out.println("if文");
			result = SUCCESS;
		}
		return result;
		}
		
		public int getDeleteId() {
			return deleteId;
		}

		public void setDeleteId(int deleteId) {
			this.deleteId = deleteId;
		}

	}
