package com.internousdev.ukiukiutopia.action;

import com.internousdev.ukiukiutopia.dao.BuyCompleteDAO;

public class BuyInsertAction {

	private int userId;
	private String registeredDate;
	private int ticketId;
	private String ticketName;
	private int sheets;
	private int price;
	private int subtotal;
	private int orderId;

	public String execute() throws Exception {
		BuyCompleteDAO dao=new BuyCompleteDAO();
		
		
		
		
		
		return "success";

	}
}
