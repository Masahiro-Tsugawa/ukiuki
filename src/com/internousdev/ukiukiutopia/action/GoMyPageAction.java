package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.PersonalInformationDAO;
import com.internousdev.ukiukiutopia.dto.PersonalInformationDTO;
import com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoMyPageAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 5755890205879217612L;
	
	private Map<String, Object> session;
	public List<PersonalInformationDTO> PersonalList = new ArrayList<PersonalInformationDTO>();
	public List<PurchaseHistoryDTO> HistorylList = new ArrayList<PurchaseHistoryDTO>();
	public String result = ERROR;

	public String execute() throws Exception{
		int userId = (int) session.get("userId");
		String emailAddress = (String)session.get("userEmail");
		if (emailAddress == null) {
			return ERROR;
		}
		PersonalInformationDAO dao = new PersonalInformationDAO();
		System.out.println("PersonalInformationDAOの検索開始");
		boolean resultDAO = dao.select(emailAddress);
		System.out.println("resultDAO="+resultDAO);
		System.out.println("PersonalNameDAO.selectからPersonalActionに復帰");
		if (!resultDAO) {
			return ERROR;
		}
		
		
		System.out.println("if文に入ってる");
		PersonalList.addAll(dao.getPersonalList());
		
		System.out.println("PersonalList"+PersonalList);
		
		userId = 1;
		resultDAO = dao.selectHistory(userId);
		if (!resultDAO){
			return ERROR;
		}
		
		HistorylList.addAll(dao.getHistorylList());
		result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}