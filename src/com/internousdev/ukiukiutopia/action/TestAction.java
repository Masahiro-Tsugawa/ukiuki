package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.TicketDataDAO;
import com.internousdev.ukiukiutopia.dto.BuyCompreteDTO;
import com.internousdev.ukiukiutopia.dto.TicketDataDTO;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private ArrayList<BuyCompreteDTO> use = new ArrayList<BuyCompreteDTO>();
	private ArrayList<BuyCompreteDTO> option = new ArrayList<BuyCompreteDTO>();

	public List<TicketDataDTO> useList = new ArrayList<TicketDataDTO>();

	public String execute() throws Exception {
		String test = "7547";
		//String test = null;
		String total = "8000";
		use.add(null);
		option.add(null);
		

		session.put("buyUseTicket", use);
		session.put("buyOptionTicket", option);
		session.put("buyCardNumber", test);
		session.put("buyTotal", total);
		session.put("userEmail", "test@test.com");
		session.put("buyCordToken", "aaaaaaaaa");
		session.put("buyCordNumber", "aaaa");
		session.put("userName","ナマタメ　マサヒロ");
		
		int sheets = 10;
		int subTotal = 16000;
		
		TicketDataDAO dao = new TicketDataDAO();
		boolean resultDAO = dao.select(sheets,subTotal);
		System.out.println("resultDAO="+resultDAO);
		System.out.println("SelectActionに復帰");
		if(resultDAO){
			useList.addAll(dao.getUseTicketList());
			
		}
		
		session.put("buyUseTicket", useList);

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}