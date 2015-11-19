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
 * 管理ページにて購入情報を表示する為のクラス
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
	/**
	 * MongoDBから取得した購入情報を入れるリスト
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
	 * 購入情報を検索するメソッド
	 * 
	 * @return SUCCESS
	 */
	public String execute() throws Exception {

		StringBuffer sds = new StringBuffer("");
		sds.append(yearS);
		sds.append("/");
		sds.append(monthS);
		sds.append("/");
		sds.append(dateS);

		selectDateS = sds.toString();

		StringBuffer sde = new StringBuffer("");
		sde.append(yearE);
		sde.append("/");
		sde.append(monthE);
		sde.append("/");
		sde.append(dateE);

		selectDateE = sde.toString();

		AdminBoughtDAO dao = new AdminBoughtDAO();
		AdminBoughtDTO dto = new AdminBoughtDTO();
		boolean resultDAO = dao.select(selectDateS, selectDateE, dto);

		if (resultDAO) {
			boughtList = dao.getBoughtList();

			session.put("selectDateS", selectDateS);
			session.put("selectDateE", selectDateE);

			result = SUCCESS;
		}
		return result;
	}

	/**
	 * セッション取得メソッド
	 * 
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納メソッド
	 * 
	 * @param session
	 *            セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

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

}
