package com.internousdev.ukiukiutopia.dto;

    /**
     * 購入履歴のデータを設定・格納するクラス
     * @author K.Kato
     * @version 1.1
     * @since 1.0
     */
public class PurchaseHistoryDTO {
	
	/**
	 * チケット名を表示
	 */
	private String name;
	
	/**
	 * 枚数を表示
	 */
	private int sheets;
	
	/**
	 * 単価を表示
	 */
    private float price;
    
    /**
     * 合計金額を表示
     */
    private float totalAmount;
    
    
    /**
     * チケット名を設定するメソッド
     * @param name
     */
    public void setName(String name){
		this.name=name;
	}
    
    /**
     * チケット名を格納するメソッド
     * @return　name
     */
	public String getName(){
		return name;
	}
	
	/**
	 * 枚数を設定するメソッド
	 * @param sheets
	 */
	public void setSheets(int sheets){
		this.sheets=sheets;
	}
	
    /**
     * 枚数を格納するメソッド
     * @return　sheets
     */
	public int getSheets(){
		return sheets;
	}
	
	/**
	 * 単価を設定するメソッド
	 * @param price
	 */
	public void setPrice(float price){
		this.price = price;
	}
    /**
     * 単価を格納するメソッド
     * @return　price
     */
	public float getPrice(){
		return price;
	}
	
	/**
	 * 合計金額を設定するメソッド
	 * @param totalAmount
	 */
	public void setTotalAmount(float totalAmount){
		this.totalAmount = totalAmount;
	}
    
	/**
	 * 合計金額を格納するメソッド
	 * @return　totalAmount
	 */
	public float getTotalAmount(){
		return totalAmount;
	}

}
