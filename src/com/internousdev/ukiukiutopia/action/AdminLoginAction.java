package com.internousdev.ukiukiutopia.action;


import com.opensymphony.xwork2.ActionSupport;


import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ukiukiutopia.dao.AdminLoginDAO;
import com.internousdev.ukiukiutopia.dto.AdminLoginDTO;

/**
 * 管理ページにてログインする為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminLoginAction extends ActionSupport implements SessionAware {

	/**
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 3147941456730448070L;
	/***
	 * 管理者名
	 */
	private String name;
	/***
	 * 管理者パスワード
	 */
	private String password;
	/***
	 * 管理者名を保持してブラウザに表示するためにセッションを用意
	 */
	private Map<String, Object> session;
	
	/**
	 * 管理者ページにログインするメソッド
	 * @return result SUCCESS：ユーザー名とパスワード合致＆ログイン状態を変更成功
	 */
	public String execute() {

		String result = ERROR;

		if (name.equals("")) {
			addActionError("ユーザー名を入力してください");
			return result;
		}
		if (password.equals("")) {
			addActionError("パスワードを入力してください");
			return result;
		}

		AdminLoginDAO dao = new AdminLoginDAO();
		AdminLoginDTO dto = new AdminLoginDTO();
		int count = dao.select(name, password, dto);
		
		if (dao.getIsLogin()) {
			addActionError("既にログインしているユーザーです");
			return result;
		}
		
		int id = dto.getId();

		count += dao.update(id);

		if (count < 2) {
			addActionError("ユーザー名もしくはパスワードが違います");
			return result;
		}

		session.put("id", id);
		session.put("name_key", dto.getName());

		result = SUCCESS;

		return result;

	}

	/**
	 * 管理者名取得するメソッド
	 * @return name 管理者名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 管理者名格納するメソッド
	 * @param name 管理者名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 管理者パスワード取得するメソッド
	 * @return password 管理者パスワード
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 管理者パスワード格納するメソッド
	 * @param password 管理者パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * セッション格納するメソッド
	 * @param session 管理者名を格納する
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}