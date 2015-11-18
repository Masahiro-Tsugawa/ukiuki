package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.CreditDataDAO;
import com.internousdev.ukiukiutopia.dao.TicketDataDAO;
import com.internousdev.ukiukiutopia.dto.BuyTicketDataDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 購入画面に表示する情報をリストなどに格納する為のクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 *
 */

public class GoTicketBuyAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;
	private List<BuyTicketDataDTO> useList = new ArrayList<BuyTicketDataDTO>();
	private List<BuyTicketDataDTO> optionList = new ArrayList<BuyTicketDataDTO>();
	private HashMap<Integer, String> sheetsList = new HashMap<Integer, String>();
	private HashMap<String, String> monthList = new HashMap<String, String>();
	private HashMap<String, String> yearList = new HashMap<String, String>();
	private List<String> payInfoList = new ArrayList<String>();
	private String result = "error";
	private String radio = "現地払い";
	private String userCreditToken;
	private String userCreditNum;

	public String execute() throws Exception {
		
		session.put("userEmail", "test@test.com");

		TicketDataDAO dao = new TicketDataDAO();
		boolean resultDAO = dao.setTicketList();
		System.out.println("resultDAO=" + resultDAO);
		System.out.println("SelectActionに復帰");
		if (resultDAO) {
			useList.addAll(dao.getUseTicketList());
			session.put("useListSize", useList.size());
			optionList.addAll(dao.getOptionTicketList());
			session.put("optionListSize", optionList.size());
			result = "success";
		}
		
		CreditDataDAO creditDao = new CreditDataDAO();
		creditDao.select((String)session.get("userEmail"));
		List<String> creditList = creditDao.getCreditData();
		userCreditToken = creditList.get(0);
		userCreditNum = creditList.get(1);

		for (int i = 0; i < 31; i++) {
			sheetsList.put(i, String.valueOf(i));
		}

		monthList.put("01","1月");
		monthList.put("02","2月");
		monthList.put("03","3月");
		monthList.put("04","4月");
		monthList.put("05","5月");
		monthList.put("06","6月");
		monthList.put("07","7月");
		monthList.put("08","8月");
		monthList.put("09","9月");
		monthList.put("10","10月");
		monthList.put("11","11月");
		monthList.put("12","12月");

		yearList.put("15","2015年");
		yearList.put("16","2016年");
		yearList.put("17","2017年");
		yearList.put("18","2018年");
		yearList.put("19","2019年");
		yearList.put("20","2020年");
		yearList.put("21","2021年");
		yearList.put("22","2022年");
		yearList.put("23","2023年");
		yearList.put("24","2024年");

		payInfoList.add("現地払い");
		payInfoList.add("クレジットカード払い");

		return result;
	}

	/**
	 * @return
	 */
	public List<String> getPayInfoList() {
		return payInfoList;
	}

	/**
	 * @param payInfoList
	 */
	public void setPayInfoList(List<String> payInfoList) {
		this.payInfoList = payInfoList;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * @return
	 */
	public List<BuyTicketDataDTO> getUseList() {
		return useList;
	}

	/**
	 * @param useList
	 */
	public void setUseList(List<BuyTicketDataDTO> useList) {
		this.useList = useList;
	}

	/**
	 * @return
	 */
	public List<BuyTicketDataDTO> getOptionList() {
		return optionList;
	}

	/**
	 * @param optionList
	 */
	public void setOptionList(List<BuyTicketDataDTO> optionList) {
		this.optionList = optionList;
	}

	/**
	 * @return
	 */
	public HashMap<Integer, String> getSheetsList() {
		return sheetsList;
	}

	/**
	 * @param sheetsList
	 */
	public void setSheetsList(HashMap<Integer, String> sheetsList) {
		this.sheetsList = sheetsList;
	}

	/**
	 * @return
	 */
	public HashMap<String, String> getMonthList() {
		return monthList;
	}

	/**
	 * @param monthList
	 */
	public void setMonthList(HashMap<String, String> monthList) {
		this.monthList = monthList;
	}

	/**
	 * @return
	 */
	public HashMap<String, String> getYearList() {
		return yearList;
	}

	/**
	 * @param yearList
	 */
	public void setYearList(HashMap<String, String> yearList) {
		this.yearList = yearList;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public String getUserCreditToken() {
		return userCreditToken;
	}

	public void setUSERCreditToken(String userCreditToken) {
		this.userCreditToken = userCreditToken;
	}

	public String getUserCreditNum() {
		return userCreditNum;
	}

	public void setUserCreditNum(String userCreditNum) {
		this.userCreditNum = userCreditNum;
	}

}