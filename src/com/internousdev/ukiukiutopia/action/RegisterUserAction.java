package com.internousdev.ukiukiutopia.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ukiukiutopia.dao.RegisterUserDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザー情報の為のクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 */
public class RegisterUserAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
    
	/**
	 * 個人情報の表示
	 * メールアドレスの表示
	 * パスワードの表示
	 * ユーザー名の表示
	 * 電話番号の表示
	 * 郵便番号の表示
	 * 住所の表示
	 */
	private Map<String, Object> session;
	private String email;
	private String password;
	private String name;
	private String telNum;
	private String posCode;
	private String address;
    
	
	/**
	 * 個人情報を取得するメソッド
	 * @return result　インサート完了の戻り値
	 */
	public String execute() throws Exception {
		String result = ERROR;
		int count;

		email = (String) session.get("signUpEmail");
		password = (String) session.get("signUpPassword");
		name = (String) session.get("signUpName");
		telNum = (String) session.get("signUpTelNum");
		posCode = (String) session.get("signUpPostalCode");
		address = (String) session.get("signUpAddress");

		RegisterUserDAO dao = new RegisterUserDAO();

		count = dao.insert(email, password, name, telNum, posCode, address);

		session.clear();

		session.put("userName",name);

		if (count > 0) {
			result = SUCCESS;
		}

		return result;

	}
    
	
	/**
	 * 個人情報を設定するメソッド
	 * @param session 個人情報の格納
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}