package com.internousdev.ukiukiutopia.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.internousdev.ukiukiutopia.util.FacebookOauth;
import com.opensymphony.xwork2.ActionSupport;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;

public class GoFacebookAction extends ActionSupport implements ServletResponseAware, ServletRequestAware {

	/**
	 * 生成されたシリアルナンバー
	 */
	private static final long serialVersionUID = 8410788671527276072L;

	/**
	 * リクエスト
	 */
	private HttpServletRequest request;

	/**
	 * レスポンス
	 */
	private HttpServletResponse response;

	public String execute() throws Exception {
		FacebookOauth oauth = new com.internousdev.ukiukiutopia.util.FacebookOauth();
		oauth.getRequestToken(request, response);
		return SUCCESS;
	}

	public void getToken(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Facebook facebook = new FacebookFactory().getInstance();
		request.getSession().setAttribute("facebook", facebook);
		facebook.setOAuthAppId("433419566868372", "e0b2de4f10d8f4ebcbeb69984a68452d");
		String accessTokenString = "433419566868372|e0b2de4f10d8f4ebcbeb69984a68452d";
		AccessToken at = new AccessToken(accessTokenString);
		facebook.setOAuthAccessToken(at);
		StringBuffer callbackURL = request.getRequestURL();
		int index = callbackURL.lastIndexOf("/");
		callbackURL.replace(index, callbackURL.length(), "").append("/my_page.jsp");
		response.sendRedirect(facebook.getOAuthAuthorizationURL(callbackURL.toString()));
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

}
