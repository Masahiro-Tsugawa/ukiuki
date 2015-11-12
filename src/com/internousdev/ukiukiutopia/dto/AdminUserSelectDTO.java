/**
 * 
 */
package com.internousdev.ukiukiutopia.dto;

/**
 * @author internous
 *
 */
public class AdminUserSelectDTO {
	
	public String email;
	public String password;
	public String name;
	public String telNum;
	public String postalCode;
	public String adress;
	public String renewDate;
	

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

	public String getPosralCode(){
		return postalCode;
	}
	public void setAdress(String adress){
		this.adress = adress;
	}

	public String getAdress(){
		return adress;
	}
	public void setRenewDate(String renewDate){
		this.renewDate = renewDate;
	}

	public String getRenewDate(){
		return renewDate;
	}
}
