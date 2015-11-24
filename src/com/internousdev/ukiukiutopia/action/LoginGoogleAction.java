package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.LoginOauthDAO;
import com.internousdev.ukiukiutopia.dto.LoginOauthDTO;
import com.internousdev.ukiukiutopia.util.GoogleOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 *  LoginGoogleAction Googleでログインする為のクラス
 * @author A.Masui
 * @version 1.1
 * @since 1.0 
 */
public class LoginGoogleAction extends ActionSupport implements ServletRequestAware, SessionAware {

	/**
	 * 生成されたシリアルナンバー
	 */
	private static final long serialVersionUID = 4405462117636579678L;

	/**
	 * ネットワークネーム
	 */
	static final String NETWORK_NAME = "google";

	/**
	 * セッション情報
	 */
	private Map<String, Object> session;

	/**
	 * リクエスト情報
	 */
	private HttpServletRequest request;
	/**
	 * Google認証の実行メソッド
     * @return result Google認証ができたか否か
	 */
	public String execute() {
		String result = ERROR;

		GoogleOauth googleOauth = new GoogleOauth();
		Map<String, String> userMap = googleOauth.getAccessToken(request);

		if (userMap == null) {
			return result;
		}
		
		String uniqueId = userMap.get("id");
		LoginOauthDAO dao = new LoginOauthDAO();
		if (dao.select(uniqueId, NETWORK_NAME)) {
			LoginOauthDTO dto = dao.getDTO();
			session.put("userId", dto.getUserId());
			session.put("loginName", dto.getUserName());
			session.put("userEmail", dto.getUserEmail());
			result = SUCCESS;
			return result;
		}
		session.put("OAuthId", userMap.get("id"));
		session.put("OAuthName", NETWORK_NAME);
		result = SUCCESS;
		return result;
	}

	/**
	 * セッション格納メソッド
	 * 
	 * @param session
	 *            セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * リクエスト格納メソッド
	 * 
	 * @param request
	 *            リクエスト
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}