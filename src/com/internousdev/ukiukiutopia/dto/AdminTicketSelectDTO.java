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
	private String tickettype;
	private boolean issale;
	private String renewdate;
	
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
	public String getTickettype() {
		return tickettype;
	}
	public void setTickettype(String tickettype) {
		this.tickettype = tickettype;
	}
	public boolean isIssale() {
		return issale;
	}
	public void setIssale(boolean issale) {
		this.issale = issale;
	}
	public String getRenewdate() {
		return renewdate;
	}
	public void setRenewdate(String renewdate) {
		this.renewdate = renewdate;
	}
	
	

}
