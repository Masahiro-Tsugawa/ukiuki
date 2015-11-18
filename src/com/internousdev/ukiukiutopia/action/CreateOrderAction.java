package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.internousdev.ukiukiutopia.dao.BuyTicketDataDAO;
import com.internousdev.ukiukiutopia.dto.BuyTicketDataDTO;
import com.internousdev.util.CreditCard;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CreateOrderAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;
	private String result = "error";

	private List<Integer> useId;
	private List<Integer> useSheets;
	private List<Integer> optionId;
	private List<Integer> optionSheets;

	private List<BuyTicketDataDTO> buyUseTicket = new ArrayList<BuyTicketDataDTO>();
	private List<BuyTicketDataDTO> buyOptionTicket = new ArrayList<BuyTicketDataDTO>();

	private String payInfo;
	private String creditNum;
	private String creditMonth;
	private String creditYear;
	private String secureCode;

	public String execute() throws Exception {

		boolean resultDAO = false;

		BuyTicketDataDAO dao = new BuyTicketDataDAO();

		for (int i = 0; i < (int) session.get("useListSize"); i++) {
			if (useSheets.get(i) != 0) {
				resultDAO = dao.setBuyUseTicketList(useId.get(i), useSheets.get(i));
			}
		}

		for (int i = 0; i < (int) session.get("optionListSize"); i++) {
			if (optionSheets.get(i) != 0) {
				resultDAO = dao.setBuyOptionTicketList(optionId.get(i), optionSheets.get(i));
			}
		}

		if (resultDAO) {
			buyUseTicket.addAll(dao.getBuyUseTicketList());
			session.put("buyUseTicket", buyUseTicket);
			buyOptionTicket.addAll(dao.getBuyOptionTicketList());
			session.put("buyOptionTicket", buyOptionTicket);
			session.put("buyTotal", dao.getTotalAmount());
			result = "success";
		}else{
			session.put("errorMessege", "すべてのチケットの購入枚数が0枚になっています");
			return result;
		}

		session.put("buyPayInfo", payInfo);
		
		if (payInfo.equals("クレジットカード払い")) {
			CreditCard credit = new CreditCard();
			if (credit.isExists(creditNum)) {
				String creditDate = creditMonth + "/" + creditYear;
				credit.insert(creditNum, creditDate, secureCode, (int) session.get("userId"));
				session.put("buyCardToken", credit.getToken());
				session.put("buyCardNumber", credit.getCardNumber());
			}else{
				result = "error";
				session.put("errorMessege", "クレジットカードの入力情報に誤りがあります");
				return result;
			}
		}
		
		session.remove("errorMessege");

		return result;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<Integer> getUseId() {
		return this.useId;
	}

	public void setUseId(List<Integer> useId) {
		this.useId = useId;
	}

	public List<Integer> getUseSheets() {
		return this.useSheets;
	}

	public void setUseSheets(List<Integer> useSheets) {
		this.useSheets = useSheets;
	}

	public List<Integer> getOptionId() {
		return this.optionId;
	}

	public void setOptionId(List<Integer> optionId) {
		this.optionId = optionId;
	}

	public List<Integer> getOptionSheets() {
		return this.optionSheets;
	}

	public void setOptionSheets(List<Integer> optionSheets) {
		this.optionSheets = optionSheets;
	}

	public String getPayInfo() {
		return payInfo;
	}

	public void setPayInfo(String payInfo) {
		this.payInfo = payInfo;
	}

	public String getCreditNum() {
		return creditNum;
	}

	public void setCreditNum(String creditNum) {
		this.creditNum = creditNum;
	}

	public String getCreditMonth() {
		return creditMonth;
	}

	public void setCreditMonth(String creditMonth) {
		this.creditMonth = creditMonth;
	}

	public String getCreditYear() {
		return creditYear;
	}

	public void setCreditYear(String creditYear) {
		this.creditYear = creditYear;
	}

	public String getSecureCode() {
		return secureCode;
	}

	public void setSecureCode(String secureCode) {
		this.secureCode = secureCode;
	}

}
