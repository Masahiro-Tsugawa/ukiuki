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
     * @return rtn
	 */
	public String execute() throws Exception {
		String rtn = ERROR;

		GoogleOauth googleOauth = new GoogleOauth();
		Map<String, String> userMap = googleOauth.getAccessToken(request);

		if (userMap == null) {
			return rtn;
		}

		userMap.get("id");
		LoginOauthDAO dao = new LoginOauthDAO();
		LoginOauthDTO dto = dao.getLoginOauthDTO();
		session.put("OAuthId", dto.getUserId());
		session.put("OAuthName", "google");
		rtn = SUCCESS;
		return rtn;
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
	 * セッション取得メソッド
	 * 
	 * @return session
	 * 				セッション
	 */
	public Map<String, Object> getSession() {
		return session;
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