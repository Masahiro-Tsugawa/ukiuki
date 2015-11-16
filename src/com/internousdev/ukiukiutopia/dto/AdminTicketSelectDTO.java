/**
 * 
 */
package com.internousdev.ukiukiutopia.dto;

/**
 * @author internous
 *
 */
public class AdminTicketSelectDTO {
	private int id;
	private String name;
	private float price;
	private String ticketType;
	private boolean isSale;
	private String ticketInfo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public boolean getIsSale() {
		return isSale;
	}
	public void setIsSale(boolean isSale) {
		this.isSale = isSale;
	}
	public String getTicketInfo() {
		return ticketInfo;
	}
	public void setTicketInfo(String ticketInfo) {
		this.ticketInfo = ticketInfo;
	}
}
