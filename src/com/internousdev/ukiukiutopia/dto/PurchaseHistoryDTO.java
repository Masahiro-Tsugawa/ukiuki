package com.internousdev.ukiukiutopia.dto;

public class PurchaseHistoryDTO {
	
	private String name;
	private int sheets;
    private float price;
    private float total_amount;
    //チケット名
    public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}
	
	//枚数
	public void setSheets(int sheets){
		this.sheets=sheets;
	}

	public int getSheets(){
		return sheets;
	}
	
	//単価
	public void setPrice(float price){
		this.price = price;
	}

	public float getPrice(){
		return price;
	}
	
	//合計金額
	public void setTotal_amount(float total_amount){
		this.total_amount = total_amount;
	}

	public float getTotal_amount(){
		return total_amount;
	}

}
