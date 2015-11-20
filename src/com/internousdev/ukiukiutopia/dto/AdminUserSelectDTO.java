package com.internousdev.ukiukiutopia.dto;
/**
 * 
 */

/**
 * DBから選択したユーザー情報を取得・格納する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminUserSelectDTO {
	
	/***
	 * 変更したいメールアドレス
	 */
	private String email;
	/***
	 * 変更したいパスワード
	 */
	private String password;
	/***
	 * 変更したいユーザー名
	 */
	private String name;
	/***
	 * 変更したい電話番号
	 */
	private String telNum;
	/***
	 * 変更したい郵便番号
	 */
	private String postalCode;
	/***
	 * 変更したい住所
	 */
	private String address;
	/***
	 * 変更したい更新日
	 */
	private String renewDate;
	
	/**
	 * 変更メールアドレス格納メソッド
	 * 
	 * @param email
	 */
	public void setEmail(String email){
		this.email = email;
	}
	/**
	 * 変更メールアドレス取得メソッド
	 * @return 変更メールアドレス 
	 */
	public String getEmail(){
		return email;
	}
	
	/**
	 * 変更パスワード格納メソッド
	 * 
	 * @param password 変更パスワード
	 */
	public void setPassword(String password){
		this.password = password;
	}
	/**
	 * 変更パスワード取得メソッド
	 * @return 変更パスワード
	 */
	public String getPassword(){
		return password;
	}

	/**
	 * 変更ユーザー名格納メソッド
	 * 
	 * @param name 変更ユーザー名
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * 変更ユーザー名取得メソッド
	 * @return 変更ユーザー名
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 変更電話番号格納メソッド
	 * 
	 * @param telNum 変更電話番号
	 */
	public void setTelNum(String telNum){
		this.telNum = telNum;
	}
	/**
	 * 変更電話番号取得メソッド
	 * @return 変更電話番号
	 */
	public String getTelNum(){
		return telNum;
	}
	
	/**
	 * 変更郵便番号格納メソッド
	 * 
	 * @param postalCode 変更郵便番号
	 */
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	/**
	 * 変更郵便番号取得メソッド
	 * @return 変更郵便番号
	 */
	public String getPostalCode(){
		return postalCode;
	}

	/**
	 * 変更住所格納メソッド
	 * 
	 * @param address 変更住所
	 */
	public void setAddress(String address){
		this.address = address;
	}
	/**
	 * 変更住所取得メソッド
	 * @return 変更住所
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
	 * @return 更新日
	 */
	public String getRenewDate(){
		return renewDate;
	}

}
