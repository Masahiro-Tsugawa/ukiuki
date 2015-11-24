/**
 * 
 */
package com.internousdev.ukiukiutopia.dto;

/**
 * DBからチケット購入情報を取得・格納する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminBoughtDTO {
	
	/***
	 * 注文ID
	 */
	private int orderId;
	/***
	 * チケットID
	 */
	private int ticketId;
	/***
	 * 売上枚数
	 */
	private int sheets;
	/***
	 * 売上合計金額
	 */
	private float totalAmount;

	
	/**
	 * 注文ID取得メソッド
	 * @return orderId 注文ID
	 */
	public int getOrderId() {
		return orderId;
	}
	/**
	 *　注文ID格納メソッド
	 * 
	 * @param orderId 注文ID
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * チケットID取得メソッド
	 * @return ticketId チケットID
	 */
	public int getTicketId() {
		return ticketId;
	}
	/**
	 *　チケットID格納メソッド
	 * 
	 * @param ticketId チケットID
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	/**
	 * 売上枚数取得メソッド
	 * @return sheets 売上枚数
	 */
	public int getSheets() {
		return sheets;
	}
	/**
	 *　売上枚数格納メソッド
	 * 
	 * @param sheets 売上枚数
	 */
	public void setSheets(int sheets) {
		this.sheets = sheets;
	}

	/**
	 * 売上合計金額取得メソッド
	 * @return totalAmount 売上合計金額
	 */
	public float getTotalAmount() {
		return totalAmount;
	}
	/**
	 *　売上合計金額格納メソッド
	 * 
	 * @param totalAmount 売上合計金額
	 */
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

}
