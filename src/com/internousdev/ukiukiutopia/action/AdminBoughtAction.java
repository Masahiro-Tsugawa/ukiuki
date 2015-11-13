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
public class AdminBoughtAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	
	private String selectdate1;
	private String selectdate2;
	public List<AdminBoughtDTO> boughtList = new ArrayList<AdminBoughtDTO>();
	public String result = ERROR;
	private Map<String, Object> session;

	public String execute() throws Exception {


	AdminBoughtDAO dao = new AdminBoughtDAO();
	AdminBoughtDTO dto = new AdminBoughtDTO();
	boolean resultDAO = dao.select(selectdate1,selectdate2,dto);
	System.out.println(resultDAO);

	if(resultDAO ){
		System.out.println("if文");
		boughtList = dao.getBoughtList();
		dto = boughtList.get(0);
		System.out.println(selectdate1 + selectdate2);
		session.put("selectdate1", dto.getSelectdate1());
		session.put("selectdate2", dto.getSelectdate2());
		
		boughtList.addAll(dao.getBoughtList());
		result = SUCCESS;
	}
	return result;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
