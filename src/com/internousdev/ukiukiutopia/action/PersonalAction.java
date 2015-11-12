package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.dao.PersonalInformationDAO;
import com.internousdev.ukiukiutopia.dto.PersonalInformationDTO;

import com.opensymphony.xwork2.ActionSupport;

public class PersonalAction extends ActionSupport{

	public List<PersonalInformationDTO> PersonalList = new ArrayList<PersonalInformationDTO>();
	public String result = ERROR;

	public String execute() throws Exception {

	PersonalInformationDAO dao = new PersonalInformationDAO();
	boolean resultDAO = dao.select();
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

}
