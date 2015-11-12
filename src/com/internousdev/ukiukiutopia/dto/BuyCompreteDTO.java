package com.internousdev.ukiukiutopia.dto;

public class BuyCompreteDTO {

	private String ticketName;
	private int sheets;
	private int price;
	private int subtotal;
	private String ticketType;
	private int ticketId;

	public String getTicketName() {
		return ticketName;
	}

	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}

	public int getSheets() {
		return sheets;
	}

	public void setSheets(int sheets) {
		this.sheets = sheets;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

}
