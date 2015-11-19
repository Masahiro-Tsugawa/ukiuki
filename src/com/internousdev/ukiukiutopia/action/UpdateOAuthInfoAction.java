package com.internousdev.ukiukiutopia.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.RegisterUserDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class UpdateOAuthInfoAction extends ActionSupport implements SessionAware {
	
	private static final long serialVersionUID = 5032385507019540641L;
	private Map<String, Object> session;
	
	private String OAuthEmail;
	
	public String execute() throws SQLException{
		
		String result = SUCCESS;
		
		String OAuthId = (String) session.get("OAuthId");
		String OAuthName = (String) session.get("OAuthName");
		
		RegisterUserDAO dao = new RegisterUserDAO();
		if(!dao.update(OAuthId, OAuthName, OAuthEmail)){
			session.remove("OAuthId");
			session.remove("OAuthName");
			result = ERROR;
			return result;
		}
		
		session.remove("OAuthId");
		session.remove("OAuthName");
		
		if(!dao.select(OAuthEmail)){
			result = ERROR;
			return result;
		}
		
		session.put("userId", dao.getId());
		session.put("loginName", dao.getName());
		session.put("userEmail", OAuthEmail);

		return result;
	}
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * @return OAuthEmail
	 */
	public String getOAuthEmail() {
		return OAuthEmail;
	}

	/**
	 * @param OAuthEmail
	 */
	public void setOAuthEmail(String OAuthEmail) {
		this.OAuthEmail = OAuthEmail;
	}

}
