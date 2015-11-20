package com.internousdev.ukiukiutopia.action;


import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
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
	/**
	 * 管理者ID
	 */
	private int id;
	/***
	 * 管理者名
	 */
	private String name;
	/***
	 * 管理者パスワード
	 */
	private String password;
	/***
	 * ログイン状態
	 */
	private boolean isLogin;
	/***
	 * 管理者名を保持してブラウザに表示するためにセッションを用意
	 */
	private Map<String, Object> session;
	
	/***
	 * 実行結果
	 */
	private String result;
	
	/**
	 * 管理者ページにログインするメソッド
	 * @return result SUCCESS：ユーザー名とパスワード合致＆ログイン状態を変更成功
	 */
	public String execute() throws SQLException {
		if (name.equals("")) {
			addActionError("ユーザー名を入力してください");
			return ERROR;
		}
		if (password.equals("")) {
			addActionError("パスワードを入力してください");
			return ERROR;
		}

		AdminLoginDAO daoSelect = new AdminLoginDAO();
		AdminLoginDTO dtoSelect = new AdminLoginDTO();
		int rscountSelect = daoSelect.select(name, password, dtoSelect);
		id=dtoSelect.getId();
		session.put("id", id);

		AdminLoginDAO daoUpdate = new AdminLoginDAO();
		int rscountUpdate = daoUpdate.update(id);

		int rscount = rscountSelect + rscountUpdate;
				
		if (rscount<1) {
			addActionError("ユーザー名もしくはパスワードが違います");
			result = ERROR;
			return result;
		}
		
			session.put("name_key", dtoSelect.getName());
			
			result=SUCCESS;

		
		return result;

	}

	/**
	 * ID取得メソッド
	 * 
	 * @return ユーザーID
	 */
	public int getId() {
		return id;
	}
	/**
	 * ID格納メソッド
	 * 
	 * @param id ユーザーID
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 管理者名取得するメソッド
	 * @return 管理者名
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
	 * @return 管理者パスワード
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
	 * セッション取得するメソッド
	 * @return 管理者名
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納するメソッド
	 * @param session 管理者名を格納する
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * ログイン状態取得するメソッド
	 * @return isLogin ログイン状態
	 */
	public boolean getIsLogin() {
		return isLogin;
	}
	/**
	 * ログイン状態格納するメソッド
	 * @param isLogin ログイン状態
	 */
	public void setIsLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}
}