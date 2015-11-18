package com.internousdev.ukiukiutopia.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONValue;

import com.opensymphony.xwork2.ActionSupport;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;

/**
 * @author A.Masui
 * @version 1.1　
 * @since 1.0　
 *
 */
public class FacebookOauth extends ActionSupport {

	/**
	 * 生成されたシリアルナンバー
	 */
	private static final long serialVersionUID = -564268116563098912L;

	/**
	 * App ID
	 */
	private static final String APP_ID = "433419566868372";

	/**
	 * レスポンスURL
	 */
	private static final String APP_SECRET = "e0b2de4f10d8f4ebcbeb69984a68452d";

	/**
	 * コールバックパス
	 */
	private static final String CALLBACK_PATH = "/my_page.jsp";

	/**
	 * @param request リクエスト
	 * @param response レスポンス
	 * @throws ServletException　　
	 * @throws IOException　例外
	 */
	public void getRequestToken(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Facebook facebook = new FacebookFactory().getInstance();
		request.getSession().setAttribute("facebook", facebook);
		facebook.setOAuthAppId(APP_ID, APP_SECRET);
		String accessTokenString = APP_ID + "|" + APP_SECRET;
		AccessToken at = new AccessToken(accessTokenString);
		facebook.setOAuthAccessToken(at);
		StringBuffer callbackURL = request.getRequestURL();
		int index = callbackURL.lastIndexOf("/");
		callbackURL.replace(index, callbackURL.length(), "").append(CALLBACK_PATH);
		response.sendRedirect(facebook.getOAuthAuthorizationURL(callbackURL.toString()));
	}

	/**
	 * @param request リクエスト
	 * @param response レスポンス
	 * @return　response レスポンス
	 * @throws ServletException
	 * @throws Exception　例外
	 */
	public Map<String, String> getAccessToken(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, Exception {
		final String callbackURL = request.getRequestURL().toString();
		final String code = request.getParameter("code");
		if (code == null) {
			response.sendRedirect(request.getContextPath() + "/login");
		}
		final String accessTokenURL = "https://graph.facebook.com/oauth/access_token?client_id=" + APP_ID
				+ "&redirect_uri=" + URLEncoder.encode(callbackURL, "UTF-8") + "&client_secret=" + APP_SECRET + "&code="
				+ URLEncoder.encode(code, "UTF-8");
		final String accessTokenResult = httpRequest(new URL(accessTokenURL));
		String accessToken = null;
		String[] pairs = accessTokenResult.split("&");
		for (String pair : pairs) {
			String[] kv = pair.split("=");
			if (kv.length != 2) {
				throw new RuntimeException("Unexpected auth response");
			} else {
				if (kv[0].equals("access_token")) {
					accessToken = kv[1];
				}
			}
		}
		final String apiURL = "https://graph.facebook.com/me?access_token=" + URLEncoder.encode(accessToken, "UTF-8");
		final String apiResult = httpRequest(new URL(apiURL));
		@SuppressWarnings("unchecked")
		Map<String, String> userMap = (Map<String, String>) JSONValue.parse(apiResult);
		return userMap;
	}

	private String httpRequest(URL url) throws IOException {
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setUseCaches(false);
		conn.setRequestMethod("GET");
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line = null;
		String response = "";
		while ((line = reader.readLine()) != null) {
			response += line;
		}
		reader.close();
		conn.disconnect();
		return response;
	}

}