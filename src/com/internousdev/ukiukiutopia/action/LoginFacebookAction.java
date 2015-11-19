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
 * @author A.Masui
 * @version 1.1　
 * @since 1.0　
 *FaceBookから情報を取得し、sessionに格納する為のクラス
 */
public class LoginFacebookAction extends ActionSupport implements SessionAware,
		ServletResponseAware, ServletRequestAware {

	/**
	 * シリアルバージョンIDの生成
	 */
	private static final long serialVersionUID = 7463433040601990718L;

	/**
	 * ネットワークネーム
	 */
	static final String NETWORK_NAME = "Facebook";

	/**
	 * レスポンス
	 */
	private HttpServletRequest request;

	/**
	 * リクエスト
	 */
	private HttpServletResponse response;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	public String execute() throws Exception {
		System.out.println("tet");
		String rtn = ERROR;
		FacebookOauth oauth = new FacebookOauth();
		Map<String, String> userMap = oauth.getAccessToken(request, response);
		
		if (userMap == null) {
			return rtn;
		}
		System.out.println(userMap.get("id"));
		String uniqueId = userMap.get("id");
		String userName = userMap.get("name");
		System.out.println("id = " + uniqueId);
		System.out.println("name = " + userName);
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
		System.out.println("");
		dao.select(uniqueId, NETWORK_NAME);
		LoginOauthDTO dto = dao.getLoginOauthDTO();
		session.put("loginId", dto.getUserId());
		session.put("loginName", dto.getUserName());
		rtn = SUCCESS;
		return rtn;
		
	}
	
	/**

	/**
	 * リクエスト格納メソッド
	 * @param request リクエスト
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * レスポンス格納メソッド
	 * @param response レスポンス
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	/**
	 * セッション取得メソッド
	 * @return sessionMap セッションマップ
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納メソッド
	 * @param sessionMap セッションマップ
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}