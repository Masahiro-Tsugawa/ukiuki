package com.internousdev.ukiukiutopia.dto;

/**
 *　Oauthでログインするための情報を取得、格納する為のクラス
 * @author A.Masui
 * @version 1.1　
 * @since 1.0　
 * 
 */
public class LoginOauthDTO {

	/**
	 * 名前
	 */
	private String userName;

	/**
	 * 顧客ID
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
	 * 顧客ID取得メソッド
	 * 
	 * @return userId
	 * 				顧客ID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 顧客ID格納メソッド
	 * 
	 * @param userId
	 *            顧客ID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
}