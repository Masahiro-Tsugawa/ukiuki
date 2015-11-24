package com.internousdev.ukiukiutopia.dto;

    /**
     * 購入履歴のデータを設定・格納するクラス
     * @author K.Kato
     * @version 1.1
     * @since 1.0
     */
public class PurchaseHistoryDTO {
	
	/**
	 * チケット名
	 */
	private String name;
	
	/**
	 * 枚数
	 */
	private int sheets;
	
	/**
	 * 単価
	 */
    private float price;
    
    /**
     * 合計金額
     */
    private float totalAmount;
    
    
    /**
     * チケット名を格納するメソッド
     * @param name チケット名
     */
    public void setName(String name){
		this.name=name;
	}
    
    /**
     * チケット名を取得するメソッド
     * @return name チケット名
     */
	public String getName(){
		return name;
	}
	
	/**
	 * 枚数を格納するメソッド
	 * @param sheets 枚数
	 */
	public void setSheets(int sheets){
		this.sheets=sheets;
	}
	
    /**
     * 枚数を取得するメソッド
     * @return sheets 枚数
     */
	public int getSheets(){
		return sheets;
	}
	
	/**
	 * 単価を格納するメソッド
	 * @param price 単価
	 */
	public void setPrice(float price){
		this.price = price;
	}
    /**
     * 単価を取得するメソッド
     * @return price 単価
     */
	public float getPrice(){
		return price;
	}
	
	/**
	 * 合計金額を格納するメソッド
	 * @param totalAmount 合計金額
	 */
	public void setTotalAmount(float totalAmount){
		this.totalAmount = totalAmount;
	}
    
	/**
	 * 合計金額を取得するメソッド
	 * @return totalAmount 合計金額
	 */
	public float getTotalAmount(){
		return totalAmount;
	}

}
