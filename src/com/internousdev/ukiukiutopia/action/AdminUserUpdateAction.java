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
	int count = 0;
	/***
	 * メールアドレス
	 */
	int countEmail = 0;
	/***
	 * パスワード
	 */
	int countPassword = 0;
	/***
	 * ユーザー名
	 */
	int countName = 0;
	/***
	 * 電話番号
	 */
	int countTelNum = 0;
	/***
	 * 郵便番号
	 */
	int countPostalCode = 0;
	/***
	 * 住所
	 */
	int countAddress = 0;
	/***
	 * 更新日
	 */
	int countRenewDate = 0;

	/***
	 * 実行結果
	 */
	public String result = ERROR;
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
	 * @return ユーザー情報編集の可否
	 */
	public String execute() throws Exception {

		purposeEmail = (String) session.get("sessionEmail");

		DateTime dt = new DateTime();
		updateRenewDate = dt.toString(DateTimeFormat.mediumDateTime());

		AdminUserUpdateDAO dao = new AdminUserUpdateDAO();

		if (("".equals(purposeEmail)) == false) {
			if (("".equals(updateEmail)) == false) {
				countEmail = dao.updateEmail(purposeEmail, updateEmail);
			}

			if (("".equals(updatePassword)) == false) {
				if (("".equals(updateEmail)) == false) {

					purposeEmail = updateEmail;
					countPassword = dao.updatePassword(purposeEmail, updatePassword);
				}
				if (("".equals(updateEmail)) == true) {
					countPassword = dao.updatePassword(purposeEmail, updatePassword);
				}
			}

			if (("".equals(updateName)) == false) {
				if (("".equals(updateEmail)) == false) {

					purposeEmail = updateEmail;
					countName = dao.updateName(purposeEmail, updateName);
				}
				if (("".equals(updateEmail)) == true) {
					countName = dao.updateName(purposeEmail, updateName);
				}
			}

			if (("".equals(updateTelNum)) == false) {
				if (("".equals(updateEmail)) == false) {

					purposeEmail = updateEmail;
					countTelNum = dao.updateTelNum(purposeEmail, updateTelNum);
				}
				if (("".equals(updateEmail)) == true) {
					countTelNum = dao.updateTelNum(purposeEmail, updateTelNum);
				}
			}

			if (("".equals(updatePostalCode)) == false) {
				if (("".equals(updateEmail)) == false) {

					purposeEmail = updateEmail;
					countPostalCode = dao.updatePostalCode(purposeEmail, updatePostalCode);
				}
				if (("".equals(updateEmail)) == true) {
					countPostalCode = dao.updatePostalCode(purposeEmail, updatePostalCode);
				}
			}

			if (("".equals(updateAddress)) == false) {
				if (("".equals(updateEmail)) == false) {

					purposeEmail = updateEmail;
					countAddress = dao.updateAddress(purposeEmail, updateAddress);
				}
				if (("".equals(updateEmail)) == true) {
					countAddress = dao.updateAddress(purposeEmail, updateAddress);
				}
			}

			if (("".equals(updateEmail)) == false) {

				purposeEmail = updateEmail;
				countRenewDate = dao.updateRenewDate(purposeEmail, updateRenewDate);
			}
			if (("".equals(updateEmail)) == true) {
				countRenewDate = dao.updateRenewDate(purposeEmail, updateRenewDate);
			}

			count = countEmail + countPassword + countName + countTelNum + countPostalCode + countAddress + countRenewDate;

			if(count<1){
				setErrorUserUpdate("ユーザー情報の編集に失敗しました");
				return result;
			}
			
			if (count >= 2) {
				session.remove(purposeEmail);
				result = SUCCESS;
			}
		}
		return result;
	}


	/**
	 * エラーメッセージを取得するメソッド
	 * @return errorUserUpdate
	 */
	public String getErrorUserUpdate(){
		return errorUserUpdate;
	}
	/**
	 * エラーメッセージを格納するメソッド
	 * @param errorUserUpdate エラーメッセージ
	 */
	public void setErrorUserUpdate(String errorUserUpdate) {
		this.errorUserUpdate = errorUserUpdate;
	}
	
	/**
	 * セッション取得するメソッド
	 * 
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納するメソッド
	 * 
	 * @param session
	 *            セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 変更したいメールアドレス取得するメソッド
	 * 
	 * @return updateEmail
	 */
	public String getUpdateEmail() {
		return updateEmail;
	}

	/**
	 * 変更したいメールアドレス格納するメソッド
	 * 
	 * @param updateEmail
	 *            変更したいメールアドレス
	 */
	public void setUpdateEmail(String updateEmail) {
		this.updateEmail = updateEmail;
	}

	/**
	 * 変更したいパスワード取得するメソッド
	 * 
	 * @return updatePassword
	 */
	public String getUpdatePassword() {
		return updatePassword;
	}

	/**
	 * 変更したいパスワード格納するメソッド
	 * 
	 * @param updatePassword
	 *            変更したいパスワード
	 */
	public void setUpdatePassword(String updatePassword) {
		this.updatePassword = updatePassword;
	}

	/**
	 * 変更したいユーザー名を取得するメソッド
	 * 
	 * @return updateName
	 */
	public String getUpdateName() {
		return updateName;
	}

	/**
	 * 変更したいユーザー名を格納するメソッド
	 * 
	 * @param updateName
	 *            変更したいユーザー名
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	/**
	 * 変更したい電話番号を取得するメソッド
	 * 
	 * @return updateTelNum
	 */
	public String getUpdateTelNum() {
		return updateTelNum;
	}

	/**
	 * 変更したい電話番号を格納するメソッド
	 * 
	 * @param updateTelNum
	 *            変更したい電話番号
	 */
	public void setUpdateTelNum(String updateTelNum) {
		this.updateTelNum = updateTelNum;
	}

	/**
	 * 変更したい郵便番号を取得するメソッド
	 * 
	 * @return updatePostalCode
	 */
	public String getUpdatePostalCode() {
		return updatePostalCode;
	}

	/**
	 * 変更したい郵便番号を格納するメソッド
	 * 
	 * @param updatePostalCode
	 *            変更したい郵便番号
	 */
	public void setUpdatePostalCode(String updatePostalCode) {
		this.updatePostalCode = updatePostalCode;
	}

	/**
	 * 変更したい住所を取得するメソッド
	 * 
	 * @return updateAddress
	 */
	public String getUpdateAddress() {
		return updateAddress;
	}

	/**
	 * 変更したい住所を格納するメソッド
	 * 
	 * @param updateAddress
	 *            変更したい住所
	 */
	public void setUpdateAddress(String updateAddress) {
		this.updateAddress = updateAddress;
	}

	/**
	 * 変更したい更新日を取得するメソッド
	 * 
	 * @return updateRenewDate
	 */
	public String getUpdateRenewDate() {
		return updateRenewDate;
	}

	/**
	 * 変更したい更新日を格納するメソッド
	 * 
	 * @param updateRenewDate
	 *            変更したい更新日
	 */
	public void setUpdateRenewDate(String updateRenewDate) {
		this.updateRenewDate = updateRenewDate;
	}
}
