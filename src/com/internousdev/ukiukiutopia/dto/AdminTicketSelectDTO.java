/**
 * 
 */
package com.internousdev.ukiukiutopia.dto;

/**
 * DBから全チケット情報を取得・格納する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminTicketSelectDTO {
	/***
	 * チケットID
	 */
	private int id;
	/***
	 * チケット名
	 */
	private String name;
	/***
	 * 値段
	 */
	private float price;
	/***
	 * チケット種類
	 */
	private String ticketType;
	/***
	 * 販売状態
	 */
	private boolean isSale;
	/***
	 * 表示状態
	 */
	private boolean isShow;
	/***
	 * チケット詳細
	 */
	private String ticketInfo;
	/***
	 * 更新日
	 */
	private String renewDate;
	
	/**
	 * チケットID取得メソッド
	 * 
	 * @return id チケットID
	 */
	public int getId() {
		return id;
	}
	/**
	 * チケットID格納メソッド
	 * 
	 * @param id チケットID
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * チケット名取得メソッド
	 * 
	 * @return name チケット名
	 */
	public String getName() {
		return name;
	}
	/**
	 * チケット名格納メソッド
	 * 
	 * @param name チケット名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 値段取得メソッド
	 * 
	 * @return price 値段
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * 値段格納メソッド
	 * 
	 * @param price 値段
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * チケット種類取得メソッド
	 * 
	 * @return ticketType チケット種類
	 */
	public String getTicketType() {
		return ticketType;
	}
	/**
	 * チケット種類格納メソッド
	 * 
	 * @param ticketType チケット種類
	 */
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	/**
	 * 販売状態取得メソッド
	 * 
	 * @return isSale 販売状態
	 */
	public boolean getIsSale() {
		return isSale;
	}
	/**
	 * 販売状態格納メソッド
	 * 
	 * @param isSale 販売状態
	 */
	public void setIsSale(boolean isSale) {
		this.isSale = isSale;
	}

	/**
	 * 表示状態取得メソッド
	 * 
	 * @return isShow 表示状態
	 */
	public boolean getIsShow() {
		return isShow;
	}
	/**
	 * 表示状態格納メソッド
	 * 
	 * @param isShow 表示状態
	 */
	public void setIsShow(boolean isShow) {
		this.isShow = isShow;
	}
	/**
	 * チケット詳細取得メソッド
	 * 
	 * @return ticketInfo チケット詳細
	 */
	public String getTicketInfo() {
		return ticketInfo;
	}
	/**
	 * チケット詳細格納メソッド
	 * 
	 * @param ticketInfo チケット詳細
	 */
	public void setTicketInfo(String ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

	/**
	 * 更新日取得メソッド
	 * 
	 * @return renewDate 更新日
	 */
	public String getRenewDate() {
		return renewDate;
	}
	/**
	 * 更新日格納メソッド
	 * 
	 * @param renewDate 更新日
	 */
	public void setRenewDate(String renewDate) {
		this.renewDate = renewDate;
	}
}
