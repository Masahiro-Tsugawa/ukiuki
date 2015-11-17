package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.PersonalInformationDAO;
import com.internousdev.ukiukiutopia.dto.PersonalInformationDTO;
import com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class GoMyPageAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 5755890205879217612L;
	
	private Map<String, Object> session;
	
	private List<PurchaseHistoryDTO> historylList = new ArrayList<PurchaseHistoryDTO>();
	private String result = ERROR;
	
	private String name;
	private String telNum;
	private String email;
	private String postalCode;
	private String address;
	

	public String execute() throws Exception{
		System.out.println("test");
		System.out.println(session.put("userId", 1));
		String emailAddress = (String)session.get("userEmail");
		if (emailAddress == null) {
			System.out.println("あれ？？？");
			System.out.println(emailAddress);
			return ERROR;
		}
		System.out.println("PersonalI始");
		PersonalInformationDAO pd = new PersonalInformationDAO();
		System.out.println("PersonalInformationDAOの検索開始");
		boolean resultDAO = pd.select(emailAddress);
		System.out.println("resultDAO="+resultDAO);
		System.out.println("PersonalNameDAO.selectからPersonalActionに復帰");
		System.out.println(resultDAO);
		if (!resultDAO) {
			return ERROR;
		}
		
		PersonalInformationDTO personal = pd.getPersonal();
		name = personal.getName();
		telNum = personal.getTelNum();
		email = personal.getEmail();
		postalCode = personal.getPostalCode();
		address = personal.getAddress();
		
		session.put("userID", 1);
		int id = (int)session.get("userID");
		
		PersonalInformationDAO hd = new PersonalInformationDAO();
		boolean historyDAO = hd.selectHistory(id);
		if (!historyDAO) {
			return ERROR;
		}
		
		historylList.addAll(hd.getHistorylList());
		System.out.println(historylList);
		System.out.println("kato");
		result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<PurchaseHistoryDTO> getHistorylList() {
		return historylList;
	}

	public void setHistorylList(List<PurchaseHistoryDTO> historylList) {
		this.historylList = historylList;
	}
	
}