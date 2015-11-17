/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.AdminTicketSelectDAO;
import com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AdminTicketSelectAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	public List<AdminTicketSelectDTO> ticketList = new ArrayList<AdminTicketSelectDTO>();
	public String result = ERROR;

	public String execute() throws Exception {


	AdminTicketSelectDAO dao = new AdminTicketSelectDAO();
	AdminTicketSelectDTO dto = new AdminTicketSelectDTO();
	boolean resultDAO = dao.select();
	System.out.println("resultDAO="+resultDAO);

	if(resultDAO){
		System.out.println("if文");
		ticketList = dao.getTicketList();
		dto = ticketList.get(0);
		
		System.out.println(dto.getId());
		
//		ticketList.addAll(dao.getTicketList());
		result = SUCCESS;
	}
	return result;
	}

}

