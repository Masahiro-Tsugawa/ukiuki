/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.dao.AdminUserSelectDAO;
import com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AdminUserSelectAction extends ActionSupport{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
		public List<AdminUserSelectDTO> userList = new ArrayList<AdminUserSelectDTO>();
		public String result = ERROR;

		public String execute() throws Exception {


		AdminUserSelectDAO dao = new AdminUserSelectDAO();
		boolean resultDAO = dao.select();
		System.out.println("resultDAO="+resultDAO);

		if(resultDAO){
			System.out.println("if文に入ってる");
			userList.addAll(dao.getUserList());
			result = SUCCESS;
		}
		return result;
		}

	}
