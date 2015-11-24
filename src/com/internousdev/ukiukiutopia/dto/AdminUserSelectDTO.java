package com.internousdev.ukiukiutopia.dto;

/**
 * DBから選択したユーザー情報を取得・格納する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminUserSelectDTO {
	
	/***
	 * メールアドレス
	 */
	private String email;
	/***
	 * パスワード
	 */
	private String password;
	/***
	 * ユーザー名
	 */
	private String name;
	/***
	 * 電話番号
	 */
	private String telNum;
	/***
	 * 郵便番号
	 */
	private String postalCode;
	/***
	 * 住所
	 */
	private String address;
	/***
	 * 更新日
	 */
	private String renewDate;
	
	/**
	 * メールアドレス格納メソッド
	 * 
	 * @param email メールアドレス
	 */
	public void setEmail(String email){
		this.email = email;
	}
	/**
	 * メールアドレス取得メソッド
	 * @return email メールアドレス 
	 */
	public String getEmail(){
		return email;
	}
	
	/**
	 * パスワード格納メソッド
	 * 
	 * @param password パスワード
	 */
	public void setPassword(String password){
		this.password = password;
	}
	/**
	 * パスワード取得メソッド
	 * @return password パスワード
	 */
	public String getPassword(){
		return password;
	}

	/**
	 * ユーザー名格納メソッド
	 * 
	 * @param name ユーザー名
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * ユーザー名取得メソッド
	 * @return name ユーザー名
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 電話番号格納メソッド
	 * 
	 * @param telNum 電話番号
	 */
	public void setTelNum(String telNum){
		this.telNum = telNum;
	}
	/**
	 * 電話番号取得メソッド
	 * @return telNum 電話番号
	 */
	public String getTelNum(){
		return telNum;
	}
	
	/**
	 * 郵便番号格納メソッド
	 * 
	 * @param postalCode 郵便番号
	 */
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	/**
	 * 郵便番号取得メソッド
	 * @return postalCode 郵便番号
	 */
	public String getPostalCode(){
		return postalCode;
	}

	/**
	 * 住所格納メソッド
	 * 
	 * @param address 住所
	 */
	public void setAddress(String address){
		this.address = address;
	}
	/**
	 * 住所取得メソッド
	 * @return address 住所
	 */
	public String getAddress(){
		return address;
	}

	/**
	 * 更新日格納メソッド
	 * 
	 * @param renewDate 更新日
	 */
	public void setRenewDate(String renewDate){
		this.renewDate = renewDate;
	}
	/**
	 * 更新日取得メソッド
	 * @return renewDate 更新日
	 */
	public String getRenewDate(){
		return renewDate;
	}

}
