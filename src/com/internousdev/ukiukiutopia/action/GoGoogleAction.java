package com.internousdev.ukiukiutopia.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.internousdev.ukiukiutopia.util.GoogleOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 *  GoGoogleAction Googleでログインする為のクラス
 * @author A.Masui
 * @version 1.1　
 * @since 1.0　
 *
 */
public class GoGoogleAction extends ActionSupport implements ServletResponseAware, ServletRequestAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1524555947613444860L;

	/**
	 * レスポンス情報
	 */
	private HttpServletResponse response;

	/**
	 * リクエスト情報
	 */
	private HttpServletRequest request;
	/**
	 * GoogleからリクエストTokenを取得メソッド
	 * @return result GoogleからリクエストTokenを取得できたか否か
	 */
	public String execute() {
		String result = SUCCESS;
		GoogleOauth googleOauth = new GoogleOauth();
		if (!googleOauth.getRequestToken(request, response)) {
			result = ERROR;
		}
		return result;
	}

	/**
	 * レスポンス格納メソッド
	 * @param response レスポンス情報
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	/**
	 * リクエスト格納メソッド
	 * @param request リクエスト情報　
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}