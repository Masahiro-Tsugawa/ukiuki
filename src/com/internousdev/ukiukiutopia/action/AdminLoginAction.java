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
	int id;
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

		AdminLoginDAO daoS = new AdminLoginDAO();
		AdminLoginDTO dtoS = new AdminLoginDTO();
		int rscountS = daoS.select(name, password, dtoS);
		id=dtoS.getId();

		AdminLoginDAO daoU = new AdminLoginDAO();
		int rscountU = daoU.update(id);

		int rscount = rscountS + rscountU;
		System.out.println(rscount);
				
		if (rscount<1) {
			addActionError("ユーザー名もしくはパスワードが違います");
		}
		else if (1<rscount | rscount<2) {
			addActionError("すでにログインしているユーザーです");
		}
			session.put("name_key", dtoS.getName());
			result=SUCCESS;

		
		return result;

	}

	/**
	 * ID取得メソッド
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * ID格納メソッド
	 * 
	 * @param id
	 *         ログイン状態
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 管理者名取得するメソッド
	 * @return name
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
	 * @return password
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
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納するメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * ログイン状態取得するメソッド
	 * @return isLogin
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