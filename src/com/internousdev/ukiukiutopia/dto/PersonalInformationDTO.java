package com.internousdev.ukiukiutopia.dto;

public class PersonalInformationDTO {

	private int id;
	private String name;
    private String telNum;
    private String email;
    private String postalCode;
    private String address;
    
    
	//ID
	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	//名前
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	//電話番号
	public void setTelNum(String telNum){
		this.telNum=telNum;
	}

	public String getTelNum(){
		return telNum;
	}
	
	//メールアドレス
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getEmail(){
		return email;
	}
	
	//郵便番号
	public void setPostalCode(String postal_code){
		this.postalCode=postalCode;
	}
	
	public String getPostalCode(){
		return postalCode;
	}
	
	//住所
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return address;
	}

}
