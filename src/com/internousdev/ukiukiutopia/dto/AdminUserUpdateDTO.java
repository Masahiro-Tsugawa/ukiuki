/**
 * 
 */
package com.internousdev.ukiukiutopia.dto;

/**
 * DBから変更したユーザー情報を取得・格納する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminUserUpdateDTO {
	
	/***
	 * 変更したいメールアドレス
	 */
	private String updateEmail;
	/***
	 * 変更したいパスワード
	 */
	private String updatePassword;
	/***
	 * 変更したいユーザー名
	 */
	private String updateName;
	/***
	 * 変更したい電話番号
	 */
	private String updateTelNum;
	/***
	 * 変更したい郵便番号
	 */
	private String updatePostalCode;
	/***
	 * 変更したい住所
	 */
	private String updateAddress;
	/***
	 * 変更したい更新日
	 */
	private String updateRenewDate;
	
	/**
	 * 変更メールアドレス取得メソッド
	 * 
	 * @return 変更メールアドレス
	 */
	public String getUpdateEmail(){
		return updateEmail;
	}
	/**
	 * 変更メールアドレス格納メソッド
	 * 
	 * @param updateEmail
	 */
	public void setUpdateEmail(String updateEmail){
		this.updateEmail=updateEmail;
	}
	
	/**
	 * 変更パスワード取得メソッド
	 * 
	 * @return 変更パスワード
	 */
	public String getUpdatePassword(){
		System.out.println(updatePassword);
		return updatePassword;
	}
	/**
	 * 変更パスワード格納メソッド
	 * 
	 * @param updatePassword
	 */
	public void setUpdatePassword(String updatePassword){
		this.updatePassword=updatePassword;
    }

	/**
	 * 変更ユーザー名取得メソッド
	 * 
	 * @return 変更ユーザー名
	 */
	public String getUpdateName(){
		return updateName;
	}
	/**
	 * 変更ユーザー名格納メソッド
	 * 
	 * @param updateName
	 */
	public void setUpdateName(String updateName){
		this.updateName=updateName;
	}

	/**
	 * 変更電話番号取得メソッド
	 * 
	 * @return 変更電話番号
	 */
	public String getUpdateTelNum(){
		return updateTelNum;
	}
	/**
	 * 変更電話番号格納メソッド
	 * 
	 * @param updateTelNum
	 */
	public void setUpdateTelNum(String updateTelNum){
		this.updateTelNum=updateTelNum;
	}

	/**
	 * 変更郵便番号取得メソッド
	 * 
	 * @return 変更郵便番号
	 */
	public String getUpdatePostalCode(){
		return updatePostalCode;
	}
	/**
	 * 変更郵便番号格納メソッド
	 * 
	 * @param updatePostalCode
	 */
	public void setUpdatePostalCode(String updatePostalCode){
		this.updatePostalCode=updatePostalCode;
	}

	/**
	 * 変更住所取得メソッド
	 * 
	 * @return 変更住所
	 */
	public String getUpdateAddress(){
		return updateAddress;
	}
	/**
	 * 変更住所格納メソッド
	 * 
	 * @param updateAddress
	 */
	public void setUpdateAddress(String updateAddress){
		this.updateAddress=updateAddress;
	}

	/**
	 * 変更更新日取得メソッド
	 * 
	 * @return 変更更新日
	 */
	public String getUpdateRenewDate(){
		return updateRenewDate;
	}
	/**
	 * 変更更新日格納メソッド
	 * 
	 * @param updateRenewDate
	 */
	public void setUpdateRenewDate(String updateRenewDate){
		this.updateRenewDate=updateRenewDate;
	}
}
