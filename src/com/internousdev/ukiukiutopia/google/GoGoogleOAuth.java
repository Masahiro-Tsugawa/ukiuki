package com.internousdev.ukiukiutopia.google;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * GoogleOAuth Google認証を提供をするクラス
 * @author Nagata Shigeru
 * @since 2015/09/17
 * @version 1.0
 */
public class GoGoogleOAuth extends ActionSupport{

	/**
	 * 生成されたシリアルナンバー
	 */
	private static final long serialVersionUID = 5689221696833606174L;

	/**
	 * スコープのURL
	 */
	private static final String SCOPE = "https://www.googleapis.com/auth/userinfo.profile";

	/**
	 * 空のトークン
	 */
	private static final Token EMPTY_TOKEN = null;

	/**
	 * リクエストトークンを取得するメソッド
	 * @author Nagata Shigeru
     * @since 2015/09/17
	 * @param request リクエスト
	 * @param response レスポンス
	 * @return boolean
	 */
	public boolean RequestToken(HttpServletRequest request,HttpServletResponse response){

		try{
			String apiKey = "42056507966-0pf52q6nrt5l30eqijjm30h1jm8l19vh.apps.googleusercontent.com";
			String apiSecret = "IcSSbPEavOsH8H2WcACPpNeB";
			String callbackUrl = "http://localhost:8080/ukiukiutopia/LoginGoogoleAction.action";

			OAuthService service = new ServiceBuilder()
			.provider(GoogleApi.class)
			.apiKey(apiKey)
			.apiSecret(apiSecret)
			.callback(callbackUrl)
			.scope(SCOPE)
			.build();

			@SuppressWarnings("unused")
			Token accessToken = new Token("ACCESS_TOKEN", "REFRESH_TOKEN");
			String authorizationUrl = service.getAuthorizationUrl(EMPTY_TOKEN);
			HttpSession session = request.getSession();
			session.setAttribute("SERVICE", service);
			response.sendRedirect(authorizationUrl); 
		}catch(Exception e){
			return false;
		}
		return true;
	}

}