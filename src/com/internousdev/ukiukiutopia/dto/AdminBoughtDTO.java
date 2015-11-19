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
	 * 検索開始年
	 */
	private int yearS;
	/***
	 * 検索開始月
	 */
	private int monthS;
	/***
	 * 検索開始日
	 */
	private int dateS;
	/***
	 * 検索開始年月日
	 */
	private String selectDateS;

	/***
	 * 検索終了年
	 */
	private int yearE;
	/***
	 * 検索終了月
	 */
	private int monthE;
	/***
	 * 検索終了日
	 */
	private int dateE;
	/***
	 * 検索終了年月日
	 */
	private String selectDateE;
	
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
	 * 検索開始年情報取得メソッド
	 * 
	 * @return yearS
	 */
	public int getYearS() {
		return yearS;
	}

	/**
	 * 検索開始年情報格納メソッド
	 * 
	 * @param yearS
	 *            検索開始年
	 */
	public void setYearS(int yearS) {
		this.yearS = yearS;
	}

	/**
	 * 検索開始月情報取得メソッド
	 * 
	 * @return monthS
	 */
	public int getMonthS() {
		return monthS;
	}

	/**
	 * 検索開始月情報格納メソッド
	 * 
	 * @param monthS
	 *            検索開始月
	 */
	public void setMonthS(int monthS) {
		this.monthS = monthS;
	}

	/**
	 * 検索開始日情報取得メソッド
	 * 
	 * @return dateS
	 */
	public int getDateS() {
		return dateS;
	}

	/**
	 * 検索開始日情報格納メソッド
	 * 
	 * @param dateS
	 *            検索開始日
	 */
	public void setDateS(int dateS) {
		this.dateS = dateS;
	}

	/**
	 * 検索終了年情報取得メソッド
	 * 
	 * @return yearE
	 */
	public int getYearE() {
		return yearE;
	}

	/**
	 * 検索終了年情報格納メソッド
	 * 
	 * @param yearE 検索終了年
	 */
	public void setYearE(int yearE) {
		this.yearE = yearE;
	}

	/**
	 * 検索終了月情報取得メソッド
	 * @return monthE
	 */
	public int getMonthE() {
		return monthE;
	}

	/**
	 * 検索終了月情報格納メソッド
	 * 
	 * @param monthE
	 *            検索終了月
	 */
	public void setMonthE(int monthE) {
		this.monthE = monthE;
	}

	/**
	 * 検索終了日情報取得メソッド
	 * 
	 * @return dateE
	 */
	public int getDateE() {
		return dateE;
	}

	/**
	 * 検索終了日情報格納メソッド
	 * 
	 * @param dateE
	 *            検索終了日
	 */
	public void setDateE(int dateE) {
		this.dateE = dateE;
	}

	/**
	 * 検索開始年月日情報取得メソッド
	 * 
	 * @return selectDateS
	 */
	public String getSelectDateS() {
		return selectDateS;
	}

	/**
	 * 検索開始年月日情報格納メソッド
	 * 
	 * @param selectDateS
	 *            検索開始年月日
	 */
	public void setSelectDateS(String selectDateS) {
		this.selectDateS = selectDateS;
	}

	/**
	 * 検索終了年月日情報取得メソッド
	 * 
	 * @return selectDateE
	 */
	public String getSelectDateE() {
		return selectDateE;
	}

	/**
	 * 検索終了年月日情報格納メソッド
	 * 
	 * @param selectDateE
	 *            検索終了年月日
	 */
	public void setSelectDateE(String selectDateE) {
		this.selectDateE = selectDateE;
	}

	/**
	 * 注文ID取得メソッド
	 * @return orderId
	 */
	public int getOrderId() {
		return orderId;
	}
	/**
	 *　注文ID格納メソッド
	 * 
	 * @param orderId
	 *            注文ID
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * チケットID取得メソッド
	 * @return ticketId
	 */
	public int getTicketId() {
		return ticketId;
	}
	/**
	 *　チケットID格納メソッド
	 * 
	 * @param ticketId
	 *            チケットID
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	/**
	 * 売上枚数取得メソッド
	 * @return sheets
	 */
	public int getSheets() {
		return sheets;
	}
	/**
	 *　売上枚数格納メソッド
	 * 
	 * @param sheets
	 *            売上枚数
	 */
	public void setSheets(int sheets) {
		this.sheets = sheets;
	}

	/**
	 * 売上合計金額取得メソッド
	 * @return totalAmount
	 */
	public float getTotalAmount() {
		return totalAmount;
	}
	/**
	 *　売上合計金額格納メソッド
	 * 
	 * @param totalAmount
	 *            売上合計金額
	 */
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

}
