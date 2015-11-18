package com.internousdev.ukiukiutopia.action;
/**
 * 
 */

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import com.internousdev.ukiukiutopia.dao.AdminUserUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理ページからユーザーを編集する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminUserUpdateAction extends ActionSupport implements SessionAware {

	/***
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 1L;
	/***
	 * 変更したいユーザーのメールアドレス
	 */
	private String purposeEmail;
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
	/***
	 * DAO成功回数
	 */
	String up = null;
	/***
	 * 実行結果
	 */
	public String result = ERROR;
	/***
	 * 変更したいユーザーのメールアドレスをセッションから取得
	 */
	private Map<String, Object> session;

	/**
	 *　ユーザーを編集するメソッド
	 * @return SUCCESS
	 */
	public String execute() throws Exception {

		purposeEmail = (String) session.get("sessionEmail");

		DateTime dt = new DateTime();
		updateRenewDate = dt.toString(DateTimeFormat.mediumDateTime());

		AdminUserUpdateDAO dao = new AdminUserUpdateDAO();

		int up = dao.update(purposeEmail, updateEmail, updatePassword, updateName, updateTelNum, updatePostalCode,
				updateAddress, updateRenewDate);

		if (up > 0) {
			session.remove(purposeEmail);
			result = SUCCESS;
		}
		return result;
	}

	/**
	 * セッション取得するメソッド
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * セッション格納するメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 変更したいメールアドレス取得するメソッド
	 * @return updateEmail
	 */
	public String getUpdateEmail() {
		return updateEmail;
	}
	/**
	 * 変更したいメールアドレス格納するメソッド
	 * @param updateEmail 変更したいメールアドレス
	 */
	public void setUpdateEmail(String updateEmail) {
		this.updateEmail = updateEmail;
	}

	/**
	 * 変更したいパスワード取得するメソッド
	 * @return updatePassword
	 */
	public String getUpdatePassword() {
		return updatePassword;
	}
	/**
	 * 変更したいパスワード格納するメソッド
	 * @param updatePassword 変更したいパスワード
	 */
	public void setUpdatePassword(String updatePassword) {
		this.updatePassword = updatePassword;
	}

	/**
	 * 変更したいユーザー名を取得するメソッド
	 * @return updateName
	 */
	public String getUpdateName() {
		return updateName;
	}
	/**
	 * 変更したいユーザー名を格納するメソッド
	 * @param updateName 変更したいユーザー名
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	/**
	 * 変更したい電話番号を取得するメソッド
	 * @return updateTelNum
	 */
	public String getUpdateTelNum() {
		return updateTelNum;
	}
	/**
	 * 変更したい電話番号を格納するメソッド
	 * @param updateTelNum 変更したい電話番号
	 */
	public void setUpdateTelNum(String updateTelNum) {
		this.updateTelNum = updateTelNum;
	}

	/**
	 * 変更したい郵便番号を取得するメソッド
	 * @return updatePostalCode
	 */
	public String getUpdatePostalCode() {
		return updatePostalCode;
	}
	/**
	 * 変更したい郵便番号を格納するメソッド
	 * @param updatePostalCode 変更したい郵便番号
	 */
	public void setUpdatePostalCode(String updatePostalCode) {
		this.updatePostalCode = updatePostalCode;
	}

	/**
	 * 変更したい住所を取得するメソッド
	 * @return updateAddress
	 */
	public String getUpdateAddress() {
		return updateAddress;
	}
	/**
	 * 変更したい住所を格納するメソッド
	 * @param updateAddress 変更したい住所
	 */
	public void setUpdateAddress(String updateAddress) {
		this.updateAddress = updateAddress;
	}

	/**
	 * 変更したい更新日を取得するメソッド
	 * @return updateRenewDate
	 */
	public String getUpdateRenewDate() {
		return updateRenewDate;
	}
	/**
	 * 変更したい更新日を格納するメソッド
	 * @param updateRenewDate 変更したい更新日
	 */
	public void setUpdateRenewDate(String updateRenewDate) {
		this.updateRenewDate = updateRenewDate;
	}
}
