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
	private static final long serialVersionUID = -7016065614706474231L;
	/**
	 * セッションを表します。
	 */
	private Map<String, Object> session;
	/**
	 * 性を表します。
	 */
	private String userName1;
	/**
	 * 名を表します。
	 */
	private String userName2;
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
	private String userAddress1;
	/**
	 * 住所（市町村区）を表します。
	 */
	private String userAddress2;
	/**
	 * 住所（マンション等以下）を表します。
	 */
	private String userAddress3;
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
	 * @see java.dao.CreateUserDAO
	 */
	public String execute() throws SQLException {
		/**
		 * DAOを参照
		 */
		CreateUserDAO dao = new CreateUserDAO();
		/**
		 * 結果を取得
		 */
		String ret = dao.select(userEmail);
		if(ret == "error"){
			  setErrorMail(getText("signUp.errorMail"));
			}

		/**
		 * 姓名を表す。
		 */
		StringBuilder userName = new StringBuilder();
		userName.append(userName1);
		userName.append(userName2);
		session.put("signUpName", userName.toString());
		session.put("signUpPassword", userPassword);
		session.put("signUpPostalCode", userPostalCode);
		StringBuilder userAddress = new StringBuilder();
		userAddress.append(userAddress1);
		userAddress.append(userAddress2);
		userAddress.append(userAddress3);
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
	public String getUserAddress1() {
		return userAddress1;
	}
    /**
     * を設定するメソッド
     * @param userAddress1 都道府県
     */
	public void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}
    /**
     * 市町村区を取得するメソッド
     * @return 市町村区
     */
	public String getUserAddress2() {
		return userAddress2;
	}
    /**
     * 市町村区を設定するメソッド
     * @param userAddress2 市町村区
     */
	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}
    /**
     * 市町村区以下の住所を取得するメソッド
     * @return 市町村区以下の住所
     */
	public String getUserAddress3() {
		return userAddress3;
	}
    /**
     * 市町村区以下の住所を設定するメソッド
     * @param userAddress3 市町村区以下の住所
     */
	public void setUserAddress3(String userAddress3) {
		this.userAddress3 = userAddress3;
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
	public String getUserName1() {
		return userName1;
	}
    /**
     * 新規登録性を設定するメソッド
     * @param userName1 新規登録性
     */
	public void setUserName1(String userName1) {
		this.userName1 = userName1;
	}
    /**
     * 新規登録名を取得するメソッド
     * @return 新規登録名
     */
	public String getUserName2() {
		return userName2;
	}
    /**
     * 新規登録名を設定するメソッド
     * @param userName2 新規登録名
     */
	public void setUserName2(String userName2) {
		this.userName2 = userName2;
	}



}