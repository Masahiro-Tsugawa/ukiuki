package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class TestAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;

	public String execute() {
		String test = "7547";
		session.put("buyCardNumber",test);
		return SUCCESS;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}