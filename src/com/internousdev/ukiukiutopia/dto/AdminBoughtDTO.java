/**
 * 
 */
package com.internousdev.ukiukiutopia.dto;

/**
 * @author internous
 *
 */
public class AdminBoughtDTO {
	
	private int year1;
	private int month1;
	private int date1;
	private String selectdate1;
	
	private int year2;
	private int month2;
	private int date2;
	private String selectdate2;
	
	private int orderid;
	private int ticketid;
	private int sheets;
	private float totalamount;
	private String registereddate;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getSheets() {
		return sheets;
	}
	public void setSheets(int sheets) {
		this.sheets = sheets;
	}
	public float getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(float totalamount) {
		this.totalamount = totalamount;
	}
	public String getRegistereddate() {
		return registereddate;
	}
	public void setRegistereddate(String registereddate) {
		this.registereddate = registereddate;
	}
	public String getSelectdate1() {
		return selectdate1;
	}
	public void setSelectdate1(String selectdate1) {
		this.selectdate1 = year1 + "/" + month1 + "/" + date1;
	}
	public String getSelectdate2() {
		return selectdate2;
	}
	public void setSelectdate2(String selectdate2) {
		this.selectdate2 = year2 + "/" + month2 + "/" + date2;
	}

}
