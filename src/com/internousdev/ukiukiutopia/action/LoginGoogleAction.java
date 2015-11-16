package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.LoginOauthDAO;
import com.internousdev.ukiukiutopia.dto.LoginOauthDTO;
import com.internousdev.ukiukiutopia.util.GoogleOauth;
import com.opensymphony.xwork2.ActionSupport;

public class LoginGoogleAction extends ActionSupport implements
ServletRequestAware, SessionAware {

	/**
	 * 生成されたシリアルナンバー
	 */
	private static final long serialVersionUID = 4405462117636579678L;
	
	/**
	 * ネットワークネーム
	 */
	static final String NETWORK_NAME = "google";

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * リクエスト
	 */
	private HttpServletRequest request;

	public String execute() throws Exception{
		String rtn = ERROR;
		
		GoogleOauth googleOauth = new GoogleOauth();
		Map<String, String> userMap = googleOauth.getAccessToken(request);
		
		if (userMap == null) {
			return rtn;
		}
		
		String uniqueId = userMap.get("id");
		String userName = userMap.get("name");
		LoginOauthDAO dao = new LoginOauthDAO();
		if (dao.select(uniqueId, NETWORK_NAME)) {
			LoginOauthDTO dto = dao.getLoginOauthDTO();
			session.put("loginId", dto.getUserId());
			session.put("loginName", dto.getUserName());
			rtn = SUCCESS;
			return rtn;
		}
		
		boolean result = dao.insert(uniqueId, userName, NETWORK_NAME);
		if (!result) {
			return rtn;
		}
		
		dao.select(uniqueId, NETWORK_NAME);
		LoginOauthDTO dto = dao.getLoginOauthDTO();
		session.put("loginId", dto.getUserId());
		session.put("loginName", dto.getUserName());
		rtn = SUCCESS;
		return rtn;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}