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
	private String selectDate1;
	
	private int year2;
	private int month2;
	private int date2;
	private String selectDate2;
	
	private int orderId;
	private int ticketId;
	private int sheets;
	private float totalAmount;

	public int getYear1() {
		return year1;
	}
	public void setYear1(int year1) {
		this.year1 = year1;
	}
	public int getMonth1() {
		return month1;
	}
	public void setMonth1(int month1) {
		this.month1 = month1;
	}
	public int getDate1() {
		return date1;
	}
	public void setDate1(int date1) {
		this.date1 = date1;
	}
	public String getSelectDate1() {
		return selectDate1;
	}
	public void setSelectDate1(String selectDate1) {
		this.selectDate1 = selectDate1;
	}
	public int getYear2() {
		return year2;
	}
	public void setYear2(int year2) {
		this.year2 = year2;
	}
	public int getMonth2() {
		return month2;
	}
	public void setMonth2(int month2) {
		this.month2 = month2;
	}
	public int getDate2() {
		return date2;
	}
	public void setDate2(int date2) {
		this.date2 = date2;
	}
	public String getSelectDate2() {
		return selectDate2;
	}
	public void setSelectDate2(String selectDate2) {
		this.selectDate2 = selectDate2;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getSheets() {
		return sheets;
	}
	public void setSheets(int sheets) {
		this.sheets = sheets;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

}
