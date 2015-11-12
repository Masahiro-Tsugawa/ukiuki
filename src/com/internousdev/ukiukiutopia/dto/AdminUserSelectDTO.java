package com.internousdev.ukiukiutopia.dto;
/**
 * 
 */


/**
 * @author internous
 *
 */
public class AdminUserSelectDTO {
	
	private String email;
	private String password;
	private String name;
	private String telNum;
	private String postalCode;
	private String address;
	private String renewDate;
	

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
	public void setTelNum(String telNum){
		this.telNum = telNum;
	}

	public String getTelNum(){
		return telNum;
	}
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}
	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}
	public void setRenewDate(String renewDate){
		this.renewDate = renewDate;
	}

	public String getRenewDate(){
		return renewDate;
	}

}
