package com.internousdev.ukiukiutopia.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ukiukiutopia.dao.RegisterUserDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規登録画面で入力されたユーザーの個人情報をデータベースに格納する為のクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 */
public class RegisterUserAction extends ActionSupport implements SessionAware {
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1L;  
	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 新規登録画面で入力されたユーザーの個人情報をデータベースに格納するメソッド
	 * @return result　データベースに格納できたか否か
	 */
	public String execute(){
		String result = ERROR;

		String email = (String) session.get("signUpEmail");
		String password = (String) session.get("signUpPassword");
		String name = (String) session.get("signUpName");
		String telNum = (String) session.get("signUpTelNum");
		String posCode = (String) session.get("signUpPostalCode");
		String address = (String) session.get("signUpAddress");

		RegisterUserDAO dao = new RegisterUserDAO();

		int count = dao.insert(email, password, name, telNum, posCode, address);

		if (count > 0) {
			if (dao.select(email)) {
				session.clear();
				session.put("userId", dao.getId());
				session.put("loginName", name);
				session.put("userEmail", email);
				result = SUCCESS;
			}
		}

		return result;

	}
    
	
	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}