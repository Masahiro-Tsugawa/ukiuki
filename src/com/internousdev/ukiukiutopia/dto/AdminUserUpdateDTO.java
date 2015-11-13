/**
 * 
 */
package com.internousdev.ukiukiutopia.dto;

/**
 * @author internous
 *
 */
public class AdminUserUpdateDTO {
	
	private String updateEmail;
	private String updatePassword;
	private String updateName;
	private String updateTelnum;
	private String updatePostalcode;
	private String updateAddress;
	private String updateRenewdate;
	
	public String getUpdateEmail(){
		return updateEmail;
	}
	public void setUpdateEmail(String updateEmail){
		this.updateEmail=updateEmail;
	}
	public String getUpdatePassword(){
		System.out.println(updatePassword);
		return updatePassword;
	}
	public void setUpdatePassword(String updatePassword){
		this.updatePassword=updatePassword;
    }
	public String getUpdateName(){
		return updateName;
	}
	public void setUpdateName(String updateName){
		this.updateName=updateName;
	}
	public String getUpdateTelnum(){
		return updateTelnum;
	}
	public void setUpdateTelnum(String updateTelnum){
		this.updateTelnum=updateTelnum;
	}
	public String getUpdatePostalcode(){
		return updatePostalcode;
	}
	public void setUpdatePostalcode(String updatePostalcode){
		this.updatePostalcode=updatePostalcode;
	}
	public String getUpdateAddress(){
		return updateAddress;
	}
	public void setUpdateAddress(String updateAddress){
		this.updateAddress=updateAddress;
	}
	public String getUpdateRenewdate(){
		return updateRenewdate;
	}
	public void setUpdateRenewdate(String updateRenewdate){
		this.updateRenewdate=updateRenewdate;
	}
}
