/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AdminLogoutAction extends ActionSupport implements SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<String,Object >session;

	private String result;
	
	//method
	public String execute() {
		result = ERROR;
		session.clear();
		
		//sessionが残っていたらエラーを返す
		if (session.containsKey("name_key")){
			return result;
		}
		result = SUCCESS;
		return result;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
