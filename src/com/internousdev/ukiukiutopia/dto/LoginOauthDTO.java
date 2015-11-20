package com.internousdev.ukiukiutopia.dto;

/**
 * @author A.Masui
 * @version 1.1　
 * @since 1.0　
 * DBの情報を取得、格納する為のクラス
 */
public class LoginOauthDTO {

	/**
	 * 名前
	 */
	private String userName;

	/**
	 * ユーザーID
	 */
	private String userId;
	/**
	 * OAuthから取得した名前
	 * 
	 */
	private String userEmail;

	/**
	 * 顧客名取得メソッド
	 * 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 顧客名格納メソッド
	 * 
	 * @param userName
	 *            名前
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * OAUthからEmailを取得するメソッド
	 * 
	 * @return userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * OAUthから取得したEmailの格納メソッド
	 * @param userEmail 
	 * 
	 *
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * ユーザーID取得メソッド
	 * 
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザーID格納メソッド
	 * 
	 * @param userId
	 *            ユーザーID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
}