package com.internousdev.ukiukiutopia.dto;

    /**
     * 個人情報のデータを設定・格納するクラス
     * @author K.Kato
     * @version 1.1
     * @since 1.0
     */
public class PersonalInformationDTO {
    
	/**
	 * ID
	 */
	private int id;
	
	/**
	 * ユーザー名
	 */
	private String name;
	
	/**
	 * 電話番号
	 */
    private String telNum;
    
    /**
     * メールアドレス
     */
    private String email;
    
    /**
     * 郵便番号
     */
    private String postalCode;
    
    /**
     * 住所
     */
    private String address;
    
    
	/**
	 * IDを格納するメソッド
	 * @param id ID
	 */
	public void setId(int id){
		this.id = id;
	}
    
	/**
	 * IDを取得するメソッド
	 * @return id ID
	 */
	public int getId(){
		return id;
	}

	/**
	 * ユーザーの名前を格納するメソッド
	 * @param name ユーザーの名前
	 */
	public void setName(String name){
		this.name=name;
	}
	
	/**
	 * ユーザーの名前を取得するメソッド
	 * @return name ユーザーの名前
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 電話番号を格納するメソッド
	 * @param telNum 電話番号
	 */
	public void setTelNum(String telNum){
		this.telNum=telNum;
	}
    /**
     * 電話番号を取得するメソッド
     * @return telNum 電話番号
     */
	public String getTelNum(){
		return telNum;
	}
	
	/**
	 * メールアドレスを格納するメソッド
	 * @param email メールアドレス
	 */
	public void setEmail(String email){
		this.email=email;
	}
	
	/**
	 * メールアドレスを取得するメソッド
	 * @return email メールアドレス
	 */
	public String getEmail(){
		return email;
	}
	
	/**
	 * 郵便番号を格納するメソッド
	 * @param postalCode 郵便番号
	 */
	public void setPostalCode(String postalCode){
		this.postalCode=postalCode;
	}
	
	/**
	 * 郵便番号を取得するメソッド
	 * @return postalCode 郵便番号
	 */
	public String getPostalCode(){
		return postalCode;
	}
	
	/**
	 * 住所を格納するメソッド
	 * @param address 住所
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
	/**
	 * 住所を取得するメソッド
	 * @return address 住所
	 */
	public String getAddress(){
		return address;
	}
}
