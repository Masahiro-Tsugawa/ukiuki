package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.Map;

import com.internousdev.ukiukiutopia.dto.BuyCompreteDTO;

public class BuyInformationAction {

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
}
