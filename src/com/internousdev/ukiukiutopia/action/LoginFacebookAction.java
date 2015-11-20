package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ukiukiutopia.dao.LoginOauthDAO;
import com.internousdev.ukiukiutopia.dto.LoginOauthDTO;
import com.internousdev.ukiukiutopia.util.FacebookOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 *  FaceBookから情報を取得し、sessionに格納する為のクラス
 * @author A.Masui
 * @version 1.1
 * @since 1.0
 */
public class LoginFacebookAction extends ActionSupport
		implements SessionAware, ServletResponseAware, ServletRequestAware {

	/**
	 * シリアルバージョンIDの生成
	 */
	private static final long serialVersionUID = 7463433040601990718L;

	/**
	 * ネットワークネーム
	 */
	static final String NETWORK_NAME = "Facebook";

	/**
	 * レスポンス情報
	 */
	private HttpServletRequest request;

	/**
	 * リクエスト情報
	 */
	private HttpServletResponse response;

	/**
	 * セッション情報
	 */
	private Map<String, Object> session;

	/**
	 * Facebook認証の実行メソッド
	 * @return rtn
	 */
	public String execute() throws Exception {
		String rtn = ERROR;
		FacebookOauth oauth = new FacebookOauth();
		Map<String, String> userMap = oauth.getAccessToken(request, response);

		if (userMap == null) {
			return rtn;
		}
		String uniqueId = userMap.get("id");
		LoginOauthDAO dao = new LoginOauthDAO();
		if (dao.select(uniqueId, NETWORK_NAME)) {
			LoginOauthDTO dto = dao.getDTO();
			session.put("OAuthId", dto.getUserId());
			session.put("OAuthName", dto.getUserName());
			session.put("OAuthEmail", dto.getUserEmail());
			rtn = SUCCESS;
			return rtn;
		}

		session.put("OAuthId", userMap.get("id"));
		session.put("OAuthName", "Facebook");
		rtn = SUCCESS;
		return rtn;
	}

	/**
	 * 
	 * /** リクエスト格納メソッド
	 * 
	 * @param request リクエスト
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * レスポンス格納メソッド
	 * 
	 * @param response レスポンス
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	/**
	 * セッション取得メソッド
	 * 
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納メソッド
	 * 
	 * @param session セッション
	 *            
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}