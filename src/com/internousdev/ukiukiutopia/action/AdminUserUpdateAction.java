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
 * 管理ページからユーザー情報を編集する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminUserUpdateAction extends ActionSupport implements SessionAware {

	/**
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 484956041771748211L;
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
	 * ユーザー情報を編集できなかった際のエラーメッセージ
	 */
	private String errorUserUpdate;

	/***
	 * 変更したいユーザーのメールアドレスをセッションから取得
	 */
	private Map<String, Object> session;

	/**
	 * ユーザー情報を編集するメソッド
	 * 
	 * @return result ユーザー情報編集の可否
	 */
	public String execute() {

		String result = ERROR;
		String purposeEmail = (String) session.get("sessionEmail");

		DateTime dt = new DateTime();
		String updateRenewDate = dt.toString(DateTimeFormat.mediumDateTime());

		AdminUserUpdateDAO dao = new AdminUserUpdateDAO();

		int count = 0;

		if (("".equals(purposeEmail)) == false) {
			
			if (("".equals(updateEmail)) == false) {
				count = dao.updateEmail(purposeEmail, updateEmail);
				purposeEmail = updateEmail;
			}

			if (("".equals(updatePassword)) == false) {
				count += dao.updatePassword(purposeEmail, updatePassword);
			}

			if (("".equals(updateName)) == false) {
				count += dao.updateName(purposeEmail, updateName);
			}

			if (("".equals(updateTelNum)) == false) {
				count += dao.updateTelNum(purposeEmail, updateTelNum);
			}

			if (("".equals(updatePostalCode)) == false) {
				count += dao.updatePostalCode(purposeEmail, updatePostalCode);
			}

			if (("".equals(updateAddress)) == false) {
				count += dao.updateAddress(purposeEmail, updateAddress);
			}

			count += dao.updateRenewDate(purposeEmail, updateRenewDate);

			if (count < 2) {
				setErrorUserUpdate("ユーザー情報の編集に失敗しました");
				return result;
			}
			
			session.remove("sessionEmail");
			result = SUCCESS;
		}
		return result;
	}

	/**
	 * エラーメッセージを取得するメソッド
	 * 
	 * @return errorUserUpdate エラーメッセージ
	 */
	public String getErrorUserUpdate() {
		return errorUserUpdate;
	}

	/**
	 * エラーメッセージを格納するメソッド
	 * 
	 * @param errorUserUpdate エラーメッセージ
	 *            エラーメッセージ
	 */
	public void setErrorUserUpdate(String errorUserUpdate) {
		this.errorUserUpdate = errorUserUpdate;
	}

	/**
	 * セッション格納するメソッド
	 * 
	 * @param session 更新する値のセッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 変更したいメールアドレス取得するメソッド
	 * 
	 * @return updateEmail 変更したいメールアドレス
	 */
	public String getUpdateEmail() {
		return updateEmail;
	}

	/**
	 * 変更したいメールアドレス格納するメソッド
	 * 
	 * @param updateEmail 変更したいメールアドレス
	 */
	public void setUpdateEmail(String updateEmail) {
		this.updateEmail = updateEmail;
	}

	/**
	 * 変更したいパスワード取得するメソッド
	 * 
	 * @return updatePassword 変更したいパスワード
	 */
	public String getUpdatePassword() {
		return updatePassword;
	}

	/**
	 * 変更したいパスワード格納するメソッド
	 * 
	 * @param updatePassword 変更したいパスワード
	 */
	public void setUpdatePassword(String updatePassword) {
		this.updatePassword = updatePassword;
	}

	/**
	 * 変更したいユーザー名を取得するメソッド
	 * 
	 * @return updateName 変更したいユーザー名
	 */
	public String getUpdateName() {
		return updateName;
	}

	/**
	 * 変更したいユーザー名を格納するメソッド
	 * 
	 * @param updateName 変更したいユーザー名
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	/**
	 * 変更したい電話番号を取得するメソッド
	 * 
	 * @return updateTelNum 変更したい電話番号
	 */
	public String getUpdateTelNum() {
		return updateTelNum;
	}

	/**
	 * 変更したい電話番号を格納するメソッド
	 * 
	 * @param updateTelNum 変更したい電話番号
	 */
	public void setUpdateTelNum(String updateTelNum) {
		this.updateTelNum = updateTelNum;
	}

	/**
	 * 変更したい郵便番号を取得するメソッド
	 * 
	 * @return updatePostalCode 変更したい郵便番号
	 */
	public String getUpdatePostalCode() {
		return updatePostalCode;
	}

	/**
	 * 変更したい郵便番号を格納するメソッド
	 * 
	 * @param updatePostalCode 変更したい郵便番号
	 */
	public void setUpdatePostalCode(String updatePostalCode) {
		this.updatePostalCode = updatePostalCode;
	}

	/**
	 * 変更したい住所を取得するメソッド
	 * 
	 * @return updateAddress 変更したい住所
	 */
	public String getUpdateAddress() {
		return updateAddress;
	}

	/**
	 * 変更したい住所を格納するメソッド
	 * 
	 * @param updateAddress 変更したい住所
	 */
	public void setUpdateAddress(String updateAddress) {
		this.updateAddress = updateAddress;
	}

}
