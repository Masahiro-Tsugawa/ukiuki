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

	private Map<String, Object> session;
	private String email;
	private String password;
	private String name;
	private String telNum;
	private String posCode;
	private String address;

	public String execute() throws Exception {
		String result = ERROR;
		int count;

		email = (String) session.get("signUpEmail");
		password = (String) session.get("signUpPassword");
		name = (String) session.get("signUpName");
		telNum = (String) session.get("signUpTelNum");
		posCode = (String) session.get("signUpPostalCode");
		address = (String) session.get("signUpAddress");
		
		session.clear();

		RegisterUserDAO dao = new RegisterUserDAO();

		count = dao.insert(email, password, name, telNum, posCode, address);

		if (count > 0) {
			dao.select(email);
			session.put("userId", dao.getId());
			session.put("loginName", name);
			session.put("userEmail", email);
			result = SUCCESS;
		}

		return result;

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}