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
	 * @return result ユーザー削除の可否
	 */
	public String execute() {

		String result = ERROR;
		AdminUserDeleteDAO dao = new AdminUserDeleteDAO();

		String deleteMail = (String) session.get("sessionEmail");
		int count = dao.delete(deleteMail);;

		if (count < 1) {
			setErrorUserDelete("ユーザーの削除に失敗しました");
			return result;
		}
		
		session.remove("email");
		result = SUCCESS;
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
	 * セッション格納するメソッド
	 * 
	 * @param session 削除したいユーザーのメールアドレスをセッションに格納
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
