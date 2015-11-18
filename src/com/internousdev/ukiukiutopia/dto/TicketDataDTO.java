package com.internousdev.ukiukiutopia.dto;

/**
 * 購入可能なチケットの情報を格納する為のクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 *
 */
public class TicketDataDTO {
	
	private int id;
	private String name;
	private int price;
	private String type;
	private String info;
	private int sheets;
	private int subTotal;
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setInfo(String info){
		this.info = info;
	}
	
	public String getInfo(){
		return this.info;
	}
	
	public void setSheets(int sheets){
		this.sheets = sheets;
	}
	
	public int getSheets(){
		return this.sheets;
	}
	
	public void setSubTotal(int subTotal){
		this.subTotal = subTotal;
	}
	
	public int getSubTotal(){
		return this.subTotal;
	}

}
