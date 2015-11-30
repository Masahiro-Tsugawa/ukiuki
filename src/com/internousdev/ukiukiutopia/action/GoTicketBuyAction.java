package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.CreditDataDAO;
import com.internousdev.ukiukiutopia.dao.PersonalInformationDAO;
import com.internousdev.ukiukiutopia.dao.TicketDataDAO;
import com.internousdev.ukiukiutopia.dto.TicketDataDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 購入画面に表示する情報をリストなどに格納する為のクラス
 * @author N.Minami
 * @version 1.1
 * @since 1.0
 */
public class GoTicketBuyAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -5128915827823380053L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	/**
	 * 購入可能な施設利用チケットのリスト
	 */
	private List<TicketDataDTO> useList = new ArrayList<TicketDataDTO>();
	/**
	 * 購入可能なオプションチケットのリスト
	 */
	private List<TicketDataDTO> optionList = new ArrayList<TicketDataDTO>();
	/**
	 * 購入枚数選択用のリスト
	 */
	private TreeMap<Integer, String> sheetsList = new TreeMap<Integer, String>();
	/**
	 * クレジットカードの有効期限の月選択用のリスト
	 */
	private TreeMap<String, String> monthList = new TreeMap<String, String>();
	/**
	 * クレジットカードの有効期限の年選択用のリスト
	 */
	private TreeMap<String, String> yearList = new TreeMap<String, String>();
	/**
	 * 支払い方法選択用のリスト
	 */
	private List<String> payInfoList = new ArrayList<String>();
	/**
	 * 支払い方法選択の初期値
	 */
	private String radio = "現地払い";
	/**
	 * ログインしている会員のクレジットカードトークン
	 */
	private String userCreditToken;
	/**
	 * ログインしている会員の下4桁のクレジットカード番号
	 */
	private String userCreditNum;

	/**
	 * 購入画面に表示する情報をリストなどに格納するメソッド
	 * @return result すべての処理が完了したか否か
	 */
	public String execute() {

		String result = ERROR;
		
		String emailAddress = (String) session.get("userEmail");
		if (emailAddress == null) {
			result="notLogin";
			return result;
		}

		PersonalInformationDAO pIDao = new PersonalInformationDAO();
		if (!pIDao.select(emailAddress)) {
			result="notLogin";
			return result;
		}

		TicketDataDAO dao = new TicketDataDAO();
		boolean resultDAO = dao.createTicketList();
		if (resultDAO) {
			useList.addAll(dao.getUseTicketList());
			session.put("useListSize", useList.size());
			optionList.addAll(dao.getOptionTicketList());
			session.put("optionListSize", optionList.size());
			result = SUCCESS;
		}

		CreditDataDAO creditDao = new CreditDataDAO();
		if (creditDao.select((String) session.get("userEmail"))) {
			List<String> creditList = creditDao.getCreditData();
			userCreditToken = creditList.get(0);
			userCreditNum = creditList.get(1);
			session.put("userCreditToken", userCreditToken);
			session.put("userCreditNum", userCreditNum);
		}

		for (int i = 0; i < 31; i++) {
			sheetsList.put(i, String.valueOf(i));
		}

		monthList.put("01", "1月");
		monthList.put("02", "2月");
		monthList.put("03", "3月");
		monthList.put("04", "4月");
		monthList.put("05", "5月");
		monthList.put("06", "6月");
		monthList.put("07", "7月");
		monthList.put("08", "8月");
		monthList.put("09", "9月");
		monthList.put("10", "10月");
		monthList.put("11", "11月");
		monthList.put("12", "12月");

		yearList.put("15", "2015年");
		yearList.put("16", "2016年");
		yearList.put("17", "2017年");
		yearList.put("18", "2018年");
		yearList.put("19", "2019年");
		yearList.put("20", "2020年");
		yearList.put("21", "2021年");
		yearList.put("22", "2022年");
		yearList.put("23", "2023年");
		yearList.put("24", "2024年");

		payInfoList.add("現地払い");
		payInfoList.add("クレジットカード払い");

		return result;
	}

	/**
	 * 支払い方法リスト取得メソッド
	 * @return payInfoList 支払い方法リストの情報
	 */
	public List<String> getPayInfoList() {
		return payInfoList;
	}

	/**
	 * 支払い方法リスト格納メソッド
	 * @param payInfoList 支払い方法リスト
	 */
	public void setPayInfoList(List<String> payInfoList) {
		this.payInfoList = payInfoList;
	}

	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 購入可能な施設利用チケットのリスト取得メソッド
	 * @return useList 購入可能な施設利用チケットのリスト
	 */
	public List<TicketDataDTO> getUseList() {
		return useList;
	}

	/**
	 * 購入可能な施設利用チケットのリスト格納メソッド
	 * @param useList 購入可能な施設利用チケットのリスト
	 */
	public void setUseList(List<TicketDataDTO> useList) {
		this.useList = useList;
	}

	/**
	 * 購入可能なオプションチケットのリスト取得メソッド
	 * @return optionList 購入可能なオプションチケットのリスト
	 */
	public List<TicketDataDTO> getOptionList() {
		return optionList;
	}

	/**
	 * 購入可能なオプションチケットのリスト格納メソッド
	 * @param optionList 購入可能なオプションチケットのリスト
	 */
	public void setOptionList(List<TicketDataDTO> optionList) {
		this.optionList = optionList;
	}

	/**
	 * 購入枚数選択用のリスト取得メソッド
	 * @return sheetsList 購入枚数選択用のリスト
	 */
	public TreeMap<Integer, String> getSheetsList() {
		return sheetsList;
	}

	/**
	 * 購入枚数選択用のリスト取得格納メソッド
	 * @param sheetsList 購入枚数選択用のリスト
	 */
	public void setSheetsList(TreeMap<Integer, String> sheetsList) {
		this.sheetsList = sheetsList;
	}

	/**
	 * クレジットカードの有効期限の月選択用のリスト取得メソッド
	 * @return monthList クレジットカードの有効期限の月選択用のリスト
	 */
	public TreeMap<String, String> getMonthList() {
		return monthList;
	}

	/**
	 * クレジットカードの有効期限の月選択用のリスト取得格納メソッド
	 * @param monthList クレジットカードの有効期限の月選択用のリスト
	 */
	public void setMonthList(TreeMap<String, String> monthList) {
		this.monthList = monthList;
	}

	/**
	 * クレジットカードの有効期限の年選択用のリスト取得メソッド
	 * @return yearList クレジットカードの有効期限の年選択用のリスト
	 */
	public TreeMap<String, String> getYearList() {
		return yearList;
	}

	/**
	 * クレジットカードの有効期限の年選択用のリスト格納メソッド
	 * @param yearList クレジットカードの有効期限の年選択用のリスト
	 */
	public void setYearList(TreeMap<String, String> yearList) {
		this.yearList = yearList;
	}

	/**
	 * 支払い方法選択の初期値取得メソッド
	 * @return radio 支払い方法選択の初期値
	 */
	public String getRadio() {
		return radio;
	}

	/**
	 * 支払い方法選択の初期値格納メソッド
	 * @param radio 支払い方法選択の初期値
	 */
	public void setRadio(String radio) {
		this.radio = radio;
	}

	/**
	 * ログインしている会員のクレジットカードトークン取得メソッド
	 * @return userCreditToken ログインしている会員のクレジットカードトークン
	 */
	public String getUserCreditToken() {
		return userCreditToken;
	}

	/**
	 * ログインしている会員のクレジットカードトークン格納メソッド
	 * @param userCreditToken ログインしている会員のクレジットカードトークン
	 */
	public void setUSERCreditToken(String userCreditToken) {
		this.userCreditToken = userCreditToken;
	}

	/**
	 * ログインしている会員の下4桁のクレジットカード番号取得メソッド
	 * @return userCreditNum ログインしている会員の下4桁のクレジットカード番号
	 */
	public String getUserCreditNum() {
		return userCreditNum;
	}

	/**
	 * ログインしている会員の下4桁のクレジットカード番号格納メソッド
	 * @param userCreditNum ログインしている会員の下4桁のクレジットカード番号
	 */
	public void setUserCreditNum(String userCreditNum) {
		this.userCreditNum = userCreditNum;
	}

}