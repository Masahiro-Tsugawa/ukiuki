package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.AdminUserDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理ページからユーザーを削除する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminUserDeleteAction extends ActionSupport implements SessionAware {

	/**
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 6819911393806628609L;
	/***
	 * 削除したいユーザーのメールアドレス
	 */
	private String deleteMail;
	/***
	 * 実行結果
	 */
	public String result = ERROR;

	/***
	 * ユーザーを削除できなかった際のエラーメッセージ
	 */
	private String errorUserDelete;

	/***
	 * 削除したいユーザーのメールアドレスをセッションから取得
	 */
	private Map<String, Object> session;

	/**
	 * 管理者ページからユーザーを削除するメソッド
	 * 
	 * @return ユーザー削除の可否
	 */
	public String execute() {

		AdminUserDeleteDAO dao = new AdminUserDeleteDAO();

		deleteMail = (String) session.get("sessionEmail");
		int count=0;
		try {
			count = dao.delete(deleteMail);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (count < 1) {
			setErrorUserDelete("ユーザーの削除に失敗しました");
			return result;
		}

		if (count > 0) {
			result = SUCCESS;
		}
		session.remove("email");
		return result;
	}

	/**
	 * エラーメッセージを取得するメソッド
	 * 
	 * @return errorUserDelete エラーメッセージ
	 */
	public String getErrorUserDelete() {
		return errorUserDelete;
	}

	/**
	 * エラーメッセージを格納するメソッド
	 * 
	 * @param errorUserDelete
	 *            エラーメッセージ
	 */
	public void setErrorUserDelete(String errorUserDelete) {
		this.errorUserDelete = errorUserDelete;
	}

	/**
	 * 削除したいユーザーのメールアドレス取得するメソッド
	 * 
	 * @return deleteMail 削除したいユーザーのメールアドレス
	 */
	public String getDeleteMail() {
		return deleteMail;
	}

	/**
	 * 削除したいユーザーのメールアドレス格納するメソッド
	 * 
	 * @param deleteMail
	 *            削除したいユーザーのメールアドレス
	 */
	public void setDeleteMail(String deleteMail) {
		this.deleteMail = deleteMail;
	}

	/**
	 * セッション取得するメソッド
	 * 
	 * @return session 削除したいユーザーのメールアドレスをセッションに取得
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納するメソッド
	 * 
	 * @param session 削除したいユーザーのメールアドレスをセッションに格納
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
