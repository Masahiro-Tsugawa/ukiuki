package com.internousdev.ukiukiutopia.action;
/**
 * 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.AdminUserSelectDAO;
import com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AdminUserSelectAction extends ActionSupport implements SessionAware{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
		public List<AdminUserSelectDTO> userList = new ArrayList<AdminUserSelectDTO>();
		public String result = ERROR;
		private Map<String, Object> session;
		private String selectEmail;

		public String execute() throws Exception {
			
			if (selectEmail == null || selectEmail.equals(" ")) {
				System.out.println(selectEmail);
				result = ERROR;
				addActionError("ユーザーIDが違います");
				return result;
			}else{

		AdminUserSelectDAO dao = new AdminUserSelectDAO();
		AdminUserSelectDTO dto = new AdminUserSelectDTO();
		boolean resultDAO = dao.select(selectEmail);
		
		if(resultDAO){
			userList = dao.getUserList();
			
     		dto = userList.get(0);
			session.put("sessionEmail", selectEmail);
			System.out.println("sessionEmail");
//			
//			userList.addAll(dao.getUserList());
			result = SUCCESS;
		}
		return result;
		}
		}

		@Override
		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

		public String getSelectEmail() {
			return selectEmail;
		}

		public void setSelectEmail(String selectEmail) {
			this.selectEmail = selectEmail;
		}


	}
