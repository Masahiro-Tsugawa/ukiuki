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
	private String updateTelnum;
	/***
	 * 変更したい郵便番号
	 */
	private String updatePostalcode;
	/***
	 * 変更したい住所
	 */
	private String updateAddress;
	/***
	 * 変更したい更新日
	 */
	private String updateRenewdate;
	
	/**
	 * 変更メールアドレス取得メソッド
	 * 
	 * @return updateEmail
	 */
	public String getUpdateEmail(){
		return updateEmail;
	}
	/**
	 * 変更メールアドレス格納メソッド
	 * 
	 * @param updateEmail
	 *            変更メールアドレス
	 */
	public void setUpdateEmail(String updateEmail){
		this.updateEmail=updateEmail;
	}
	
	/**
	 * 変更パスワード取得メソッド
	 * 
	 * @return updatePassword
	 */
	public String getUpdatePassword(){
		System.out.println(updatePassword);
		return updatePassword;
	}
	/**
	 * 変更パスワード格納メソッド
	 * 
	 * @param updatePassword
	 *            変更パスワード
	 */
	public void setUpdatePassword(String updatePassword){
		this.updatePassword=updatePassword;
    }

	/**
	 * 変更ユーザー名取得メソッド
	 * 
	 * @return updateName
	 */
	public String getUpdateName(){
		return updateName;
	}
	/**
	 * 変更ユーザー名格納メソッド
	 * 
	 * @param updateName
	 *            変更ユーザー名
	 */
	public void setUpdateName(String updateName){
		this.updateName=updateName;
	}

	/**
	 * 変更電話番号取得メソッド
	 * 
	 * @return updateTelnum
	 */
	public String getUpdateTelnum(){
		return updateTelnum;
	}
	/**
	 * 変更電話番号格納メソッド
	 * 
	 * @param updateTelnum
	 *            変更電話番号
	 */
	public void setUpdateTelnum(String updateTelnum){
		this.updateTelnum=updateTelnum;
	}

	/**
	 * 変更郵便番号取得メソッド
	 * 
	 * @return updatePostalcode
	 */
	public String getUpdatePostalcode(){
		return updatePostalcode;
	}
	/**
	 * 変更郵便番号格納メソッド
	 * 
	 * @param updatePostalcode
	 *            変更郵便番号
	 */
	public void setUpdatePostalcode(String updatePostalcode){
		this.updatePostalcode=updatePostalcode;
	}

	/**
	 * 変更住所取得メソッド
	 * 
	 * @return updateAddress
	 */
	public String getUpdateAddress(){
		return updateAddress;
	}
	/**
	 * 変更住所格納メソッド
	 * 
	 * @param updateAddress
	 *            変更住所
	 */
	public void setUpdateAddress(String updateAddress){
		this.updateAddress=updateAddress;
	}

	/**
	 * 変更更新日取得メソッド
	 * 
	 * @return updateRenewdate
	 */
	public String getUpdateRenewdate(){
		return updateRenewdate;
	}
	/**
	 * 変更更新日格納メソッド
	 * 
	 * @param updateRenewdate
	 *            変更更新日
	 */
	public void setUpdateRenewdate(String updateRenewdate){
		this.updateRenewdate=updateRenewdate;
	}
}
