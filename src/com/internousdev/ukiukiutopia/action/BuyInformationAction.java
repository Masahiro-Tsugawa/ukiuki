package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dto.BuyCompreteDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyInformationAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private ArrayList<BuyCompreteDTO> use = new ArrayList<BuyCompreteDTO>();
	private ArrayList<BuyCompreteDTO> option = new ArrayList<BuyCompreteDTO>();

	public String execute() {
		use = (ArrayList<BuyCompreteDTO>) session.get("buyUseTicket");
		option = (ArrayList<BuyCompreteDTO>) session.get("buyOptionTicket");
		
		return "success";
	}

	public ArrayList<BuyCompreteDTO> getUseList() {
		return use;
	}

	public ArrayList<BuyCompreteDTO> getOptionList() {
		return option;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
}
