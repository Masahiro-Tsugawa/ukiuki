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
	/**
	 * MongoDBからチケット注文情報を入れるリスト
	 */
	public List<AdminBoughtDTO> boughtList = new ArrayList<AdminBoughtDTO>();
	/**
	 * 実行結果
	 */
	public String result = ERROR;
	/**
	 * 検索日を入れるためにセッションを用意
	 */
	private Map<String, Object> session;

	/**
	 * チケット注文情報を検索するメソッド
	 * 
	 * @return チケット注文情報の有無
	 */
	public String execute() throws Exception {

		StringBuffer sds = new StringBuffer("");
		sds.append(fromYear);
		sds.append("/");
		sds.append(fromMonth);
		sds.append("/");
		sds.append(fromDate);

		startDate = sds.toString();

		StringBuffer sde = new StringBuffer("");
		sde.append(toYear);
		sde.append("/");
		sde.append(toMonth);
		sde.append("/");
		sde.append(toDate);

		endDate = sde.toString();

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
	 * セッション取得メソッド
	 * 
	 * @return 検索した販売期間の開始年月日と終了年月日
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納メソッド
	 * 
	 * @param 検索した販売期間の開始年月日と終了年月日
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 検索開始年情報取得メソッド
	 * 
	 * @return 検索した販売期間の開始年
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
	 * @return 検索した販売期間の開始月
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
	 * @return 検索した販売期間の開始日
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
	 * @return 検索した販売期間の終了年
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
	 * @return 検索した販売期間の終了月
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
	 * @return 検索した販売期間の終了日
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
	 * @return startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * 検索開始年月日情報格納メソッド
	 * 
	 * @param startDate
	 *            検索開始年月日
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * 検索終了年月日情報取得メソッド
	 * 
	 * @return endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * 検索終了年月日情報格納メソッド
	 * 
	 * @param endDate
	 *            検索終了年月日
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
