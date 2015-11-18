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

	/***
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 1L;
	/***
	 * 検索開始年
	 */
	private int year1;
	/***
	 * 検索開始月
	 */
	private int month1;
	/***
	 * 検索開始日
	 */
	private int date1;
	/***
	 * 検索開始年月日
	 */
	private String selectDate1;
	
	/***
	 * 検索終了年
	 */
	private int year2;
	/***
	 * 検索終了月
	 */
	private int month2;
	/***
	 * 検索終了日
	 */
	private int date2;
	/***
	 * 検索終了年月日
	 */
	private String selectDate2;
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
	 * @return SUCCESS
	 */
	public String execute() throws Exception {
		
	StringBuffer sd1 = new StringBuffer("");
	sd1.append(year1);
	sd1.append(month1);
	sd1.append(date1);
	
	selectDate1 = sd1.toString();
	
	StringBuffer sd2 = new StringBuffer("");
	sd2.append(year2);
	sd2.append(month2);
	sd2.append(date2);
	
	selectDate2 = sd2.toString();

	AdminBoughtDAO dao = new AdminBoughtDAO();
	AdminBoughtDTO dto = new AdminBoughtDTO();
	boolean resultDAO = dao.select(selectDate1,selectDate2,dto);
	
	if(resultDAO ){
		boughtList = dao.getBoughtList();

		session.put("selectDate1", selectDate1);
		session.put("selectDate2", selectDate2);

		result = SUCCESS;
	}
	return result;
	}
	
	/**
	 * セッション取得メソッド
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 検索開始年情報取得メソッド
	 * @return year1
	 */
	public int getYear1() {
		return year1;
	}
	/**
	 * 検索開始年情報格納メソッド
	 * @param year1 検索開始年
	 */
	public void setYear1(int year1) {
		this.year1 = year1;
	}
	
	/**
	 * 検索開始月情報取得メソッド
	 * @return month1
	 */
	public int getMonth1() {
		return month1;
	}
	/**
	 * 検索開始月情報格納メソッド
	 * @param month1 検索開始月
	 */
	public void setMonth1(int month1) {
		this.month1 = month1;
	}

	/**
	 * 検索開始日情報取得メソッド
	 * @return date1
	 */
	public int getDate1() {
		return date1;
	}
	/**
	 * 検索開始日情報格納メソッド
	 * @param date1 検索開始日
	 */
	public void setDate1(int date1) {
		this.date1 = date1;
	}

	/**
	 * 検索終了年情報取得メソッド
	 * @return year2
	 */
	public int getYear2() {
		return year2;
	}
	/**
	 * 検索終了年情報格納メソッド
	 * @param year2 検索終了年
	 */
	public void setYear2(int year2) {
		this.year2 = year2;
	}

	/**
	 * 検索終了月情報取得メソッド
	 * @return month2
	 */
	public int getMonth2() {
		return month2;
	}
	/**
	 * 検索終了月情報格納メソッド
	 * @param month2 検索終了月
	 */
	public void setMonth2(int month2) {
		this.month2 = month2;
	}
	/**
	 * 検索終了日情報取得メソッド
	 * @return date2
	 */
	public int getDate2() {
		return date2;
	}
	/**
	 * 検索終了日情報格納メソッド
	 * @param date2 検索終了日
	 */
	public void setDate2(int date2) {
		this.date2 = date2;
	}
	
	/**
	 * 検索開始年月日情報取得メソッド
	 * @return selectDate1
	 */
	public String getSelectDate1() {
		return selectDate1;
	}
	/**
	 * 検索開始年月日情報格納メソッド
	 * @param selectDate1 検索開始年月日
	 */
	public void setSelectDate1(String selectDate1) {
		this.selectDate1 = selectDate1;
	}

	/**
	 * 検索終了年月日情報取得メソッド
	 * @return selectDate2
	 */
	public String getSelectDate2() {
		return selectDate2;
	}
	/**
	 * 検索終了年月日情報格納メソッド
	 * @param selectDate2 検索終了年月日
	 */
	public void setSelectDate2(String selectDate2) {
		this.selectDate2 = selectDate2;
	}

}
