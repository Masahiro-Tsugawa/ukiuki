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
	private int fromYear;
	/***
	 * 検索開始月
	 */
	private int fromMonth;
	/***
	 * 検索開始日
	 */
	private int fromDate;
	/***
	 * 検索開始年月日
	 */
	private String startDate;

	/***
	 * 検索終了年
	 */
	private int toYear;
	/***
	 * 検索終了月
	 */
	private int toMonth;
	/***
	 * 検索終了日
	 */
	private int toDate;
	/***
	 * 検索終了年月日
	 */
	private String endDate;
	
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
	 * @return 検索開始年
	 */
	public int getFromYear() {
		return fromYear;
	}

	/**
	 * 検索開始年情報格納メソッド
	 * 
	 * @param fromYear
	 */
	public void setFromYear(int fromYear) {
		this.fromYear = fromYear;
	}

	/**
	 * 検索開始月情報取得メソッド
	 * 
	 * @return 検索開始月
	 */
	public int getFromMonth() {
		return fromMonth;
	}

	/**
	 * 検索開始月情報格納メソッド
	 * 
	 * @param fromMonth
	 */
	public void setFromMonth(int fromMonth) {
		this.fromMonth = fromMonth;
	}

	/**
	 * 検索開始日情報取得メソッド
	 * 
	 * @return 検索開始日
	 */
	public int getFromDate() {
		return fromDate;
	}

	/**
	 * 検索開始日情報格納メソッド
	 * 
	 * @param fromDate
	 */
	public void setFromDate(int fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * 検索終了年情報取得メソッド
	 * 
	 * @return 検索終了年
	 */
	public int getToYear() {
		return toYear;
	}

	/**
	 * 検索終了年情報格納メソッド
	 * 
	 * @param toYear
	 */
	public void setToYear(int toYear) {
		this.toYear = toYear;
	}

	/**
	 * 検索終了月情報取得メソッド
	 * @return 検索終了月
	 */
	public int getToMonth() {
		return toMonth;
	}

	/**
	 * 検索終了月情報格納メソッド
	 * 
	 * @param toMonth
	 */
	public void setToMonth(int toMonth) {
		this.toMonth = toMonth;
	}

	/**
	 * 検索終了日情報取得メソッド
	 * 
	 * @return 検索終了日
	 */
	public int gettoDate() {
		return toDate;
	}

	/**
	 * 検索終了日情報格納メソッド
	 * 
	 * @param toDate
	 */
	public void settoDate(int toDate) {
		this.toDate = toDate;
	}

	/**
	 * 検索開始年月日情報取得メソッド
	 * 
	 * @return 検索開始年月日
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * 検索開始年月日情報格納メソッド
	 * 
	 * @param startDate
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * 検索終了年月日情報取得メソッド
	 * 
	 * @return 検索終了年月日
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * 検索終了年月日情報格納メソッド
	 * 
	 * @param endDate
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * 注文ID取得メソッド
	 * @return 注文ID
	 */
	public int getOrderId() {
		return orderId;
	}
	/**
	 *　注文ID格納メソッド
	 * 
	 * @param orderId
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * チケットID取得メソッド
	 * @return チケットID
	 */
	public int getTicketId() {
		return ticketId;
	}
	/**
	 *　チケットID格納メソッド
	 * 
	 * @param ticketId
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	/**
	 * 売上枚数取得メソッド
	 * @return 売上枚数
	 */
	public int getSheets() {
		return sheets;
	}
	/**
	 *　売上枚数格納メソッド
	 * 
	 * @param sheets
	 */
	public void setSheets(int sheets) {
		this.sheets = sheets;
	}

	/**
	 * 売上合計金額取得メソッド
	 * @return 売上合計金額
	 */
	public float getTotalAmount() {
		return totalAmount;
	}
	/**
	 *　売上合計金額格納メソッド
	 * 
	 * @param totalAmount
	 */
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

}
