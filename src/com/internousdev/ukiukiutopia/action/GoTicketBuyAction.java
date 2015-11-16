package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.TicketDataDAO;
import com.internousdev.ukiukiutopia.dto.TicketDataDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoTicketBuyAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> session;
	public List<TicketDataDTO> useList = new ArrayList<TicketDataDTO>();
	public String result = "error";
	
	public String execute() throws Exception {
		
		int sheets = 10;
		int subTotal = 16000;
		
		TicketDataDAO dao = new TicketDataDAO();
		boolean resultDAO = dao.select(sheets,subTotal);
		System.out.println("resultDAO="+resultDAO);
		System.out.println("SelectActionに復帰");
		if(resultDAO){
			useList.addAll(dao.getUseTicketList());
			
			result = "success";
		}
		
		session.put("buyUseTicket", useList);
		
		return result;
	}
	
	public void setSession(Map<String, Object> session) {
		this.session= session;
	}
	
	
}