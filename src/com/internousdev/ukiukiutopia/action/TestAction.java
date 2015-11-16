package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dto.BuyCompreteDTO;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private ArrayList<BuyCompreteDTO> use = new ArrayList<BuyCompreteDTO>();
	private ArrayList<BuyCompreteDTO> option = new ArrayList<BuyCompreteDTO>();

	public String execute() {
		String test = "7547";
		//String test = null;
		String total = "8000";
		use.add(null);
		option.add(null);
		//option.add(int, "テストチケット");
		session.put("buyUseTicket", use);
		session.put("buyOptionTicket", option);
		session.put("buyCardNumber", test);
		session.put("buyTotal", total);

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}