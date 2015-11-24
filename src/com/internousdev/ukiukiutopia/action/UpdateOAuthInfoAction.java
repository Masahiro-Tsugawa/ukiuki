package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.RegisterUserDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * OAuth認証で取得したIDをデータベースに格納する為のクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 */
public class UpdateOAuthInfoAction extends ActionSupport implements SessionAware {
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 5032385507019540641L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	/**
	 * 初回のOAuth認証後に入力するメールアドレス
	 */
	private String OAuthEmail;
	
	/**
	 * OAuth認証で取得したIDをデータベースに格納するメソッド
	 * @return result すべての処理が完了したか否か
	 */
	public String execute(){
		
		String result = SUCCESS;
		
		String OAuthId = (String) session.get("OAuthId");
		String OAuthName = (String) session.get("OAuthName");
		
		RegisterUserDAO dao = new RegisterUserDAO();
		if(!dao.update(OAuthId, OAuthName, OAuthEmail)){
			result = ERROR;
			return result;
		}
		
		if(!dao.select(OAuthEmail)){
			System.out.println("違うよ");
			result = ERROR;
			return result;
		}
		
		session.remove("OAuthId");
		session.remove("OAuthName");
		
		session.put("userId", dao.getId());
		session.put("loginName", dao.getName());
		session.put("userEmail", OAuthEmail);

		return result;
	}
	
	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * OAuth認証後に入力するメールアドレス取得メソッド
	 * @return OAuthEmail　OAuth認証後に入力するメールアドレス
	 */
	public String getOAuthEmail() {
		return OAuthEmail;
	}

	/**
	 * OAuth認証後に入力するメールアドレス格納メソッド
	 * @param OAuthEmail OAuth認証後に入力するメールアドレス
	 */
	public void setOAuthEmail(String OAuthEmail) {
		this.OAuthEmail = OAuthEmail;
	}

}
