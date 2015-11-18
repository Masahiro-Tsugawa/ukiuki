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
 * 管理ページにて購入情報を表示する為のアクション
 * @author Mizukoshi Shizuka
 * @since 2015/11/18
 * @version 1.0
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
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return SUCCESS
	 */
	public String execute() throws Exception {

	selectDate1=(String) (getYear1()+"/"+getMonth1()+"/"+getDate1());
	selectDate2=(String) (getYear2()+"/"+getMonth2()+"/"+getDate2());

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
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 検索開始年情報取得メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return year1
	 */
	public int getYear1() {
		return year1;
	}
	/**
	 * 検索開始年情報格納メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @param year1 検索開始年
	 */
	public void setYear1(int year1) {
		this.year1 = year1;
	}
	
	/**
	 * 検索開始月情報取得メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return month1
	 */
	public int getMonth1() {
		return month1;
	}
	/**
	 * 検索開始月情報格納メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @param month1 検索開始月
	 */
	public void setMonth1(int month1) {
		this.month1 = month1;
	}

	/**
	 * 検索開始日情報取得メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return date1
	 */
	public int getDate1() {
		return date1;
	}
	/**
	 * 検索開始日情報格納メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @param date1 検索開始日
	 */
	public void setDate1(int date1) {
		this.date1 = date1;
	}

	/**
	 * 検索終了年情報取得メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return year2
	 */
	public int getYear2() {
		return year2;
	}
	/**
	 * 検索終了年情報格納メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @param year2 検索終了年
	 */
	public void setYear2(int year2) {
		this.year2 = year2;
	}

	/**
	 * 検索終了月情報取得メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return month2
	 */
	public int getMonth2() {
		return month2;
	}
	/**
	 * 検索終了月情報格納メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @param month2 検索終了月
	 */
	public void setMonth2(int month2) {
		this.month2 = month2;
	}
	/**
	 * 検索終了日情報取得メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return date2
	 */
	public int getDate2() {
		return date2;
	}
	/**
	 * 検索終了日情報格納メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @param date2 検索終了日
	 */
	public void setDate2(int date2) {
		this.date2 = date2;
	}
	
	/**
	 * 検索開始年月日情報取得メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return selectDate1
	 */
	public String getSelectDate1() {
		return selectDate1;
	}
	/**
	 * 検索開始年月日情報格納メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @param selectDate1 検索開始年月日
	 */
	public void setSelectDate1(String selectDate1) {
		this.selectDate1 = selectDate1;
	}

	/**
	 * 検索終了年月日情報取得メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return selectDate2
	 */
	public String getSelectDate2() {
		return selectDate2;
	}
	/**
	 * 検索終了年月日情報格納メソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @param selectDate2 検索終了年月日
	 */
	public void setSelectDate2(String selectDate2) {
		this.selectDate2 = selectDate2;
	}

}
