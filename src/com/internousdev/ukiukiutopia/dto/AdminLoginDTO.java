package com.internousdev.ukiukiutopia.dto;
/**
 * 
 */


/**
 * DBからログインしようとしているユーザーの情報を取得、格納する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminLoginDTO {

	/***
	 * 管理者のID
	 */
	private int id;
	/***
	 * 管理者のユーザー名
	 */
	private String name;

	/***
	 * 管理者のパスワード
	 */
	private String password;

	/***
	 * ログイン状態
	 */
	private boolean isLogin;

	/**
	 * ユーザー名取得メソッド
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * ユーザー名格納メソッド
	 * 
	 * @param name
	 *           ユーザー名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * パスワード取得メソッド
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワード格納メソッド
	 * 
	 * @param password
	 *         パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * ログイン状態取得メソッド
	 * 
	 * @return isLogin
	 */
	public boolean getIsLogin() {
		return isLogin;
	}

	/**
	 * ログイン状態格納メソッド
	 * 
	 * @param isLogin
	 *         ログイン状態
	 */
	public void setIsLogin(boolean isLogin) {
		this.isLogin = isLogin;
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


}
