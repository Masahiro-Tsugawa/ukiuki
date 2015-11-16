package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.PersonalInformationDAO;
import com.internousdev.ukiukiutopia.dto.PersonalInformationDTO;

import com.opensymphony.xwork2.ActionSupport;

public class PersonalAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8436693321966479475L;
	
	private Map<String, Object> session;
	public List<PersonalInformationDTO> PersonalList = new ArrayList<PersonalInformationDTO>();
	public String result = ERROR;

	public String execute() throws Exception {

		PersonalInformationDAO dao = new PersonalInformationDAO();
		String emailAddress = (String)session.get("userEmail");
		System.out.println("PersonalInformationDAOの検索開始");
		boolean resultDAO = dao.select(emailAddress);
		System.out.println("resultDAO="+resultDAO);
		System.out.println("PersonalNameDAO.selectからPersonalActionに復帰");
		
		if(resultDAO){
			System.out.println("if文に入ってる");
			PersonalList.addAll(dao.getPersonalList());
			result = SUCCESS;
			System.out.println("PersonalList"+PersonalList);
		}
		return result;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
