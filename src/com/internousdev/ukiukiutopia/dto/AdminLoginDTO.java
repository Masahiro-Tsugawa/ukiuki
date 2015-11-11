/**
 * 
 */
package com.internousdev.ukiukiutopia.dto;

/**
 * @author internous
 *
 */
public class AdminLoginDTO {

	// 管理者のユーザー名
	private String name;

	// 管理者パスワード
	private String password;

	// ログイン状態
	private boolean isLogin;

	//管理者のユーザー名を取得するメソッド
	public String getName() {
		return name;
	}

	//ユーザー名を格納するメソッド
	public void setName(String name) {
		this.name = name;
	}

	//管理者のパスワードを取得するメソッド
	public String getPassword() {
		return password;
	}

	//パスワードを格納するメソッド
	public void setPassword(String password) {
		this.password = password;
	}

	//ログイン状態を取得するメソッド
	public boolean getIsLogin() {
		return isLogin;
	}

	//ログイン状態を格納するメソッド
	public void setIsLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

}
