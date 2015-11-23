/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

import com.internousdev.ukiukiutopia.dao.AdminTicketDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理ページからチケットを削除するクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminTicketDeleteAction extends ActionSupport {

	/**
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 3272574526615947484L;
	/***
	 * 削除したいチケットのID
	 */
	private int deleteId;

	/***
	 * 削除できなかった際のエラーメッセージ
	 */
	private String errorTicketDelete;

	/**
	 * 管理者ページからチケットを削除するメソッド
	 * 
	 * @return result チケット削除の可否
	 */
	public String execute() {
		String result = ERROR;
		int count = 0;

		AdminTicketDeleteDAO dao = new AdminTicketDeleteDAO();
		
		count = dao.updateIsSale(deleteId);
		if (count < 1) {
			setErrorTicketDelete("削除に失敗しました");
			return result;
		}
		
		count += dao.updateIsShow(deleteId);
		if (count < 2) {
			setErrorTicketDelete("削除に失敗しました");
			return result;
		}

		result = SUCCESS;
		return result;
	}

	/**
	 * エラーメッセージを取得するメソッド
	 * 
	 * @return errorTicketDelete エラーメッセージ
	 */
	public String getErrorTicketDelete() {
		return errorTicketDelete;
	}

	/**
	 * エラーメッセージを格納するメソッド
	 * 
	 * @param errorTicketDelete
	 *            エラーメッセージ
	 */
	public void setErrorTicketDelete(String errorTicketDelete) {
		this.errorTicketDelete = errorTicketDelete;
	}

	/**
	 * 削除したいチケットのID取得するメソッド
	 * 
	 * @return deleteId 削除したいチケット
	 */
	public int getDeleteId() {
		return deleteId;
	}

	/**
	 * 削除したいチケットのID格納するメソッド
	 * 
	 * @param deleteId
	 *            削除したいチケットのID
	 */
	public void setDeleteId(int deleteId) {
		this.deleteId = deleteId;
	}

}
