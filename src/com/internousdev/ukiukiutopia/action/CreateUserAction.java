package com.internousdev.ukiukiutopia.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.CreateUserDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規登録画面の画面出力の為のクラス
 * @author M.Tsugawa
 * @version 1.1
 * @since 1.0
 */
public class CreateUserAction extends ActionSupport implements SessionAware {
	/**
	 * シリアルを生成
	 */
	private static final long serialVersionUID = -7016065614706474231L;
	/**
	 * セッションを表します。
	 */
	private Map<String, Object> session;
	/**
	 * 性を表します。
	 */
	private String userNameSurName;
	/**
	 * 名を表します。
	 */
	private String userNameFirstName;
	/**
	 * パスワードを表します。
	 */
	private String userPassword;
	/**
	 * 確認用パスワードを表します。
	 */
	private String confirmUserPassword;
	/**
	 * 郵便番号を表します。
	 */
	private String userPostalCode;
	/**
	 * 住所（都道府県）を表します。
	 */
	private String userAddressPrefecture;
	/**
	 * 住所（市町村区）を表します。
	 */
	private String userAddressCity;
	/**
	 * 住所（マンション等以下）を表します。
	 */
	private String userAddressOther;
	/**
	 * メールアドレスを表します。
	 */
	private String userEmail;
	/**
	 * 確認用メールアドレスを表します。
	 */
	private String confirmUserEmail;
	/**
	 * 電話番号を表します。
	 */
	private String userTelNum;
	/**
	 * メールアドレス重複登録のエラーメッセージを表します。
	 */
	private String errorMail;

	/**
	 * 既存メールアドレスがDBにないかを確かめるメソッド
	 * @return 既存登録アドレスの有無
	 */
	public String execute() throws SQLException {
		/**
		 * DAOを参照
		 */
		CreateUserDAO dao = new CreateUserDAO();
		/**
		 * 結果を取得
		 */
		String ret = ERROR;
		/**
		 * DBにて既存メールアドレスの有無を取得
		 */
		boolean result = dao.select(userEmail);
		if(result == true){
		ret = SUCCESS;
		}else if(result == false){
			  setErrorMail(getText("signUp.errorMail"));
			  ret = ERROR;
			}

		/**
		 * 姓名を表す。
		 */
		StringBuilder userName = new StringBuilder();
		userName.append(userNameSurName);
		userName.append(userNameFirstName);
		session.put("signUpName", userName.toString());
		session.put("signUpPassword", userPassword);
		session.put("signUpPostalCode", userPostalCode);
		StringBuilder userAddress = new StringBuilder();
		userAddress.append(userAddressPrefecture);
		userAddress.append(userAddressCity);
		userAddress.append(userAddressOther);
		session.put("signUpAddress", userAddress.toString());
		session.put("signUpEmail", userEmail);
		session.put("signUpTelNum", userTelNum);
		return ret;
	}

	/**
	 * 新規登録メールアドレスを取得するメソッド
	 * @return 新規登録メールアドレス
	 */
	public String getUserEmail() {
		return userEmail;
	}
    /**
     * 新規登録メールアドレスを設定するメソッド
     * @param userEmail 新規登録メールアドレス
     */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
    /**
     * 新規登録電話番号を取得するメソッド
     * @return 電話番号
     */
	public String getUserTelNum() {
		return userTelNum;
	}
    /**
     * 新規登録電話番号を設定するメソッド
     * @param userTelnum 新規登録電話番号
     */
	public void setUserTelNum(String userTelnum) {
		this.userTelNum = userTelnum;
	}
    /**
     * 新規登録郵便番号を取得するメソッド
     * @return 新規登録郵便番号
     */
	public String getUserPostalCode() {
		return userPostalCode;
	}
    /**
     * 新規登録郵便番号を設定するメソッド
     * @param userPostalCode 新規登録郵便番号
     */
	public void setUserPostalCode(String userPostalCode) {
		this.userPostalCode = userPostalCode;
	}
    /**
     * 新規登録パスワードを取得するメソッド
     * @return 新規登録パスワード
     */
	public String getUserPassword() {
		return userPassword;
	}
    /**
     * 新規登録パスワードを設定するメソッド
     * @param userPassword 新規登録パスワード
     */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
    /**
     * 確認用パスワードを取得するメソッド
     * @return 確認用パスワード
     */
	public String getConfirmUserPassword() {
		return confirmUserPassword;
	}
    /**
     * 確認用パスワードを設定するメソッド
     * @param confirmUserPassword 確認用パスワード
     */
	public void setConfirmUserPassword(String confirmUserPassword) {
		this.confirmUserPassword = confirmUserPassword;
	}
    /**
     * 都道府県を取得するメソッド
     * @return 都道府県
     */
	public String getUserAddressPrefecture() {
		return userAddressPrefecture;
	}
    /**
     * を設定するメソッド
     * @param userAddressPrefecture 都道府県
     */
	public void setUserAddressPrefecture(String userAddressPrefecture) {
		this.userAddressPrefecture = userAddressPrefecture;
	}
    /**
     * 市町村区を取得するメソッド
     * @return 市町村区
     */
	public String getUserAddressCity() {
		return userAddressCity;
	}
    /**
     * 市町村区を設定するメソッド
     * @param userAddressCity 市町村区
     */
	public void setUserAddressCity(String userAddressCity) {
		this.userAddressCity = userAddressCity;
	}
    /**
     * 市町村区以下の住所を取得するメソッド
     * @return 市町村区以下の住所
     */
	public String getUserAddressOther() {
		return userAddressOther;
	}
    /**
     * 市町村区以下の住所を設定するメソッド
     * @param userAddressOther 市町村区以下の住所
     */
	public void setUserAddressOther(String userAddressOther) {
		this.userAddressOther = userAddressOther;
	}
    /**
     * セッションを設定するメソッド
     * @param session セッション
     */
	public void setSession(Map<String, Object> session) {
		this.session= session;
	}
    /**
     * 確認用メールアドレスを取得するメソッド
     * @return 確認用メールアドレス
     */
	public String getConfirmUserEmail() {
		return confirmUserEmail;
	}
    /**
     * 確認用メールアドレスを設定するメソッド
     * @param confirmUserEmail 確認用メールアドレス
     */
	public void setConfirmUserEmail(String confirmUserEmail) {
		this.confirmUserEmail = confirmUserEmail;
	}
    /**
     * 既存メールアドレスがあった時のエラーメッセージを取得するメソッド
     * @return エラーメッセージ
     */
	public String getErrorMail() {
		return errorMail;
	}
    /**
     * 既存メールアドレスがあった時のエラーメッセージを設定するメソッド
     * @param errorMail エラーメッセージ
     */
	public void setErrorMail(String errorMail) {
		this.errorMail = errorMail;
	}
    /**
     * 新規登録性を取得するメソッド
     * @return 新規登録性
     */
	public String getUserNameSurName() {
		return userNameSurName;
	}
    /**
     * 新規登録性を設定するメソッド
     * @param userNameSurName 新規登録性
     */
	public void setUserNameSurName(String userNameSurName) {
		this.userNameSurName = userNameSurName;
	}
    /**
     * 新規登録名を取得するメソッド
     * @return 新規登録名
     */
	public String getUserNameFirstName() {
		return userNameFirstName;
	}
    /**
     * 新規登録名を設定するメソッド
     * @param userNameFirstName 新規登録名
     */
	public void setUserNameFirstName(String userNameFirstName) {
		this.userNameFirstName = userNameFirstName;
	}



}