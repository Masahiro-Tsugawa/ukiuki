package com.internousdev.ukiukiutopia.dto;

    /**
     * 個人情報のデータを設定・格納するクラス
     * @author K.Kato
     * @version 1.1
     * @since 1.0
     */
public class PersonalInformationDTO {
    
	/**
	 * IDの表示
	 */
	private int id;
	
	/**
	 * ユーザーの表示
	 */
	private String name;
	
	/**
	 * 電話番号の表示
	 */
    private String telNum;
    
    /**
     * メールアドレスの表示
     */
    private String email;
    
    /**
     * 郵便番号の表示
     */
    private String postalCode;
    
    /**
     * 住所の表示
     */
    private String address;
    
    
	/**
	 * IDを設定するメソッド
	 * @param id
	 */
	public void setId(int id){
		this.id = id;
	}
    
	/**
	 * IDを格納するメソッド
	 * @return　id
	 */
	public int getId(){
		return id;
	}

	/**
	 * ユーザーの名前を設定するメソッド
	 * @param name
	 */
	public void setName(String name){
		this.name=name;
	}
	
	/**
	 * ユーザーの名前を格納するメソッド
	 * @return name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 電話番号を設定するメソッド
	 * @param telNum
	 */
	public void setTelNum(String telNum){
		this.telNum=telNum;
	}
    /**
     * 電話番号を格納するメソッド
     * @return　telNum
     */
	public String getTelNum(){
		return telNum;
	}
	
	/**
	 * メールアドレスを設定するメソッド
	 * @param email
	 */
	public void setEmail(String email){
		this.email=email;
	}
	
	/**
	 * メールアドレスを格納するメソッド
	 * @return email
	 */
	public String getEmail(){
		return email;
	}
	
	/**
	 * 郵便番号を設定するメソッド
	 * @param postalCode
	 */
	public void setPostalCode(String postalCode){
		this.postalCode=postalCode;
	}
	
	/**
	 * 郵便番号を格納するメソッド
	 * @return postalCode
	 */
	public String getPostalCode(){
		return postalCode;
	}
	
	/**
	 * 住所を設定するメソッド
	 * @param address
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
	/**
	 * 住所を格納するメソッド
	 * @return address
	 */
	public String getAddress(){
		return address;
	}
}
