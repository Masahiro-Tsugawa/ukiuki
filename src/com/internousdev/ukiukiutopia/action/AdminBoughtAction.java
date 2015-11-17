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
 * @author internous
 *
 */
public class AdminBoughtAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	
	private int year1;
	private int month1;
	private int date1;
	private String selectDate1;
	
	private int year2;
	private int month2;
	private int date2;
	private String selectDate2;
	public List<AdminBoughtDTO> boughtList = new ArrayList<AdminBoughtDTO>();
	public String result = ERROR;
	private Map<String, Object> session;

	public String execute() throws Exception {

	selectDate1=(String) (getYear1()+"/"+getMonth1()+"/"+getDate1());
	selectDate2=(String) (getYear2()+"/"+getMonth2()+"/"+getDate2());

	AdminBoughtDAO dao = new AdminBoughtDAO();
	AdminBoughtDTO dto = new AdminBoughtDTO();
	boolean resultDAO = dao.select(selectDate1,selectDate2,dto);
	System.out.println(resultDAO);

	if(resultDAO ){
		System.out.println("if文");
		boughtList = dao.getBoughtList();
//		dto = boughtList.get(0);
		
		session.put("selectDate1", selectDate1);
		session.put("selectDate2", selectDate2);
		
//		boughtList.addAll(dao.getBoughtList());
		result = SUCCESS;
	}
	return result;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public int getDate1() {
		return date1;
	}
	public void setDate1(int date1) {
		this.date1 = date1;
	}
	public int getDate2() {
		return date2;
	}
	public void setDate2(int date2) {
		this.date2 = date2;
	}
	public int getMonth1() {
		return month1;
	}
	public void setMonth1(int month1) {
		this.month1 = month1;
	}
	public int getMonth2() {
		return month2;
	}
	public void setMonth2(int month2) {
		this.month2 = month2;
	}
	public int getYear1() {
		return year1;
	}
	public void setYear1(int year1) {
		this.year1 = year1;
	}

	public int getYear2() {
		return year2;
	}

	public void setYear2(int year2) {
		this.year2 = year2;
	}
	
	public String getSelectDate1() {
		return selectDate1;
	}

	public void setSelectDate1(String selectDate1) {
		this.selectDate1 = selectDate1;
	}
	public String getSelectDate2() {
		return selectDate2;
	}

	public void setSelectDate2(String selectDate2) {
		this.selectDate2 = selectDate2;
	}

}
