/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.AdminBoughtDAO;
import com.internousdev.ukiukiutopia.dto.AdminBoughtDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理ページにてチケット注文情報を表示する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminBoughtAction extends ActionSupport implements SessionAware {

	/**
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 314691105289038532L;
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

	/**
	 * MongoDBからチケット注文情報を入れるリスト
	 */
	public List<AdminBoughtDTO> boughtList = new ArrayList<AdminBoughtDTO>();

	/**
	 * 検索日を入れるためにセッションを用意
	 */
	private Map<String, Object> session;

	/**
	 * チケット注文情報を検索するメソッド
	 * 
	 * @return result チケット注文情報の有無
	 */
	public String execute() {
		
		String result = ERROR;

		StringBuffer sbStartDate = new StringBuffer("");
		sbStartDate.append(fromYear);
		sbStartDate.append("/");
		sbStartDate.append(fromMonth);
		sbStartDate.append("/");
		sbStartDate.append(fromDate);

		String startDate = sbStartDate.toString();

		StringBuffer sbEndDate = new StringBuffer("");
		sbEndDate.append(toYear);
		sbEndDate.append("/");
		sbEndDate.append(toMonth);
		sbEndDate.append("/");
		sbEndDate.append(toDate);

		String endDate = sbEndDate.toString();

		AdminBoughtDAO dao = new AdminBoughtDAO();
		AdminBoughtDTO dto = new AdminBoughtDTO();
		boolean resultDAO = dao.select(startDate, endDate, dto);

		if (resultDAO) {
			boughtList = dao.getBoughtList();

			session.put("startDate", startDate);
			session.put("endDate", endDate);

			result = SUCCESS;
		}
		return result;
	}

	/**
	 * セッション格納メソッド
	 * 
	 * @param session 検索した販売期間の開始年月日と終了年月日
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 検索開始年情報取得メソッド
	 * 
	 * @return fromYear 検索した販売期間の開始年
	 */
	public int getFromYear() {
		return fromYear;
	}

	/**
	 * 検索開始年情報格納メソッド
	 * 
	 * @param fromYear 検索開始年
	 */
	public void setFromYear(int fromYear) {
		this.fromYear = fromYear;
	}

	/**
	 * 検索開始月情報取得メソッド
	 * 
	 * @return fromMonth 検索した販売期間の開始月
	 */
	public int getFromMonth() {
		return fromMonth;
	}

	/**
	 * 検索開始月情報格納メソッド
	 * 
	 * @param fromMonth 検索開始月
	 */
	public void setFromMonth(int fromMonth) {
		this.fromMonth = fromMonth;
	}

	/**
	 * 検索開始日情報取得メソッド
	 * 
	 * @return fromDate 検索した販売期間の開始日
	 */
	public int getFromDate() {
		return fromDate;
	}

	/**
	 * 検索開始日情報格納メソッド
	 * 
	 * @param fromDate 検索開始日
	 */
	public void setFromDate(int fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * 検索終了年情報取得メソッド
	 * 
	 * @return toYear 検索した販売期間の終了年
	 */
	public int getToYear() {
		return toYear;
	}

	/**
	 * 検索終了年情報格納メソッド
	 * 
	 * @param toYear 検索終了年
	 */
	public void setToYear(int toYear) {
		this.toYear = toYear;
	}

	/**
	 * 検索終了月情報取得メソッド
	 * @return toMonth 検索した販売期間の終了月
	 */
	public int getToMonth() {
		return toMonth;
	}

	/**
	 * 検索終了月情報格納メソッド
	 * 
	 * @param toMonth 検索終了月
	 */
	public void setToMonth(int toMonth) {
		this.toMonth = toMonth;
	}

	/**
	 * 検索終了日情報取得メソッド
	 * 
	 * @return toDate 検索した販売期間の終了日
	 */
	public int getToDate() {
		return toDate;
	}

	/**
	 * 検索終了日情報格納メソッド
	 * 
	 * @param toDate 検索終了日
	 */
	public void setToDate(int toDate) {
		this.toDate = toDate;
	}

}
