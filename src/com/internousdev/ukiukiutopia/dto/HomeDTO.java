package com.internousdev.ukiukiutopia.dto;

/**
 * 顧客情報を格納する為のクラス
 * @author A.Masui
 * @version 1.1　
 * @since 1.0　
 */
public class HomeDTO{

	/**
	 * 名前
	 */
	private String userName;

	/**
	 * 顧客ID
	 */
	private int userId;

	/**
	 * ログインID
	 */
	private String loginId;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * 電話番号
	 */
	private String telNumber;

	/**
	 * 郵便番号
	 */
	private String postal;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * 固有ID
	 */
	private String uniqueId;

	/**
	 * 顧客名取得メソッド
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 顧客名格納メソッド
	 * @param userName 名前
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 顧客ID取得メソッド
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * 顧客ID格納メソッド
	 * @param userId 顧客ID
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * ログインID取得メソッド
	 * @return loginId
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * ログインID格納メソッド
	 * @param loginId ログインID
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * パスワード取得メソッド
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワード格納メソッド
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * メールアドレス取得メソッド
	 * @return eMail
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレス格納メソッド
	 * @param email メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 *電話番号取得メソッド
	 * @return telNumber
	 */
	public String getTelNumber() {
		return telNumber;
	}

	/**
	 * 電話番号格納メソッド
	 * @param telNumber 電話番号
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	/**
	 * 郵便番号取得メソッド
	 * @return postal
	 */
	public String getPostal() {
		return postal;
	}

	/**
	 * 郵便番号格納メソッド
	 * @param postal 郵便番号
	 */
	public void setPostal(String postal) {
		this.postal = postal;
	}

	/**
	 * 住所取得メソッド
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 住所格納メソッド
	 * @param address 住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 固有ID取得メソッド
	 * @return uniqueId
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * 固有ID格納メソッド
	 * @param uniqueId 固有ID
	 */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
}