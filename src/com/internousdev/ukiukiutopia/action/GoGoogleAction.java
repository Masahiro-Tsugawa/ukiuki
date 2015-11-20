package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.util.GoogleOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 *  GoGoogleAction Googleでログインする為のクラス
 * @author A.Masui
 * @version 1.1　
 * @since 1.0　
 *
 */
public class GoGoogleAction extends ActionSupport implements ServletResponseAware, ServletRequestAware, SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1524555947613444860L;

	/**
	 * セッション情報
	 */
	private Map<String, Object> session;

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
	 * @throws Exception 例外処理
	 * @return String
	 */
	public String execute() throws Exception {
		GoogleOauth googleOauth = new GoogleOauth();
		if (!googleOauth.getRequestToken(request, response)) {
			return ERROR;
		}
		return SUCCESS;
	}
	/**
	 * セッション格納メソッド
	 * @param session セッションマップ
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * セッション取得メソッド
	 * @return sessionMap セッションマップ情報
	 */
	public Map<String, Object> getSession() {
		return session;
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