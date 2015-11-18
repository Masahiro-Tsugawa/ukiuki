package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.util.GoogleOauth;
import com.opensymphony.xwork2.ActionSupport;

public class GoGoogleAction extends ActionSupport implements ServletResponseAware, ServletRequestAware, SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1524555947613444860L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * レスポンス
	 */
	private HttpServletResponse response;

	/**
	 * リクエスト
	 */
	private HttpServletRequest request;

	public String execute() throws Exception {
		GoogleOauth googleOauth = new GoogleOauth();
		if (!googleOauth.getRequestToken(request, response)) {
			return ERROR;
		}
		return SUCCESS;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}