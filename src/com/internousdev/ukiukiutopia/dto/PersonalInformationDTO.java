package com.internousdev.ukiukiutopia.dto;

public class PersonalInformationDTO {

	private int id;
	private String name;
    private String tel_num;
    private String email;
    private String postal;
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
	public void setTel_num(String tel_num){
		this.tel_num=tel_num;
	}

	public String getTel_num(){
		return tel_num;
	}
	
	//メールアドレス
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getEMail(){
		return email;
	}
	
	//郵便番号
	public void setPostal(String postal){
		this.postal=postal;
	}
	
	public String getPostal(){
		return postal;
	}
	
	//住所
	public void setAddress(String address){
	}
	
	public String getAddress(){
		return address;
	}

}
