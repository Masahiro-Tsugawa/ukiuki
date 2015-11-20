package com.internousdev.ukiukiutopia.dto;

/**
 * 購入するチケットの情報を取得、格納する為のクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 */
public class TicketDataDTO {
	
	/**
	 * 購入するチケットのID
	 */
	private int id;
	/**
	 * 購入するチケット名
	 */
	private String name;
	/**
	 * 購入するチケットの価格
	 */
	private int price;
	/**
	 * 購入するチケットの種類
	 */
	private String type;
	/**
	 * 購入するチケットの説明
	 */
	private String info;
	/**
	 * 購入するチケットの枚数
	 */
	private int sheets;
	/**
	 * 購入するチケットの合計金額
	 */
	private int subTotal;
	
	
	/**
	 * 購入するチケットのID格納メソッド
	 * @param id 購入するチケットのID
	 */
	public void setId(int id){
		this.id = id;
	}
	
	/**
	 * 購入するチケットのID取得メソッド
	 * @return id 購入するチケットのID
	 */
	public int getId(){
		return id;
	}
	
	/**
	 * 購入するチケット名格納メソッド
	 * @param name 購入するチケット名
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * 購入するチケット名取得メソッド
	 * @return name 購入するチケット名
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 購入するチケットの価格格納メソッド
	 * @param price 購入するチケットの価格
	 */
	public void setPrice(int price){
		this.price = price;
	}
	
	/**
	 * 購入するチケットの価格取得メソッド
	 * @return price 購入するチケットの価格
	 */
	public int getPrice(){
		return price;
	}
	
	/**
	 * 購入するチケットの種類格納メソッド
	 * @param type 購入するチケットの種類
	 */
	public void setType(String type){
		this.type = type;
	}
	
	/**
	 * 購入するチケットの種類取得メソッド
	 * @return type 購入するチケットの種類
	 */
	public String getType(){
		return type;
	}
	
	/**
	 * 購入するチケットの説明格納メソッド
	 * @param info 購入するチケットの説明
	 */
	public void setInfo(String info){
		this.info = info;
	}
	
	/**
	 * 購入するチケットの説明取得メソッド
	 * @return info 購入するチケットの説明
	 */
	public String getInfo(){
		return info;
	}
	
	/**
	 * 購入するチケットの枚数格納メソッド
	 * @param sheets 購入するチケットの枚数
	 */
	public void setSheets(int sheets){
		this.sheets = sheets;
	}
	
	/**
	 * 購入するチケットの枚数取得メソッド
	 * @return sheets 購入するチケットの枚数
	 */
	public int getSheets(){
		return sheets;
	}
	
	/**
	 * 購入するチケットの合計金額格納メソッド
	 * @param subTotal 購入するチケットの合計金額
	 */
	public void setSubTotal(int subTotal){
		this.subTotal = subTotal;
	}
	
	/**
	 * 購入するチケットの合計金額取得メソッド
	 * @return subTotal 購入するチケットの合計金額
	 */
	public int getSubTotal(){
		return subTotal;
	}

}
