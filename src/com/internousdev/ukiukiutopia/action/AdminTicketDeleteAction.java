/**
 * 
 */
package com.internousdev.ukiukiutopia.action;


import com.internousdev.ukiukiutopia.dao.AdminTicketDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理ページからチケットを削除するクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminTicketDeleteAction extends ActionSupport {

	/***
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 1L;
	
	/***
	 * 削除したいチケットのID
	 */
	private int deleteId;
	/***
	 * DAOの実行成功結果数
	 */
	int count;
	/***
	 * 実行結果
	 */
	public String result=ERROR;
	
	/**
	 * 管理者ページからチケットを削除するメソッド
	 * @return SUCCESS
	 */
		public String execute() throws Exception {

		AdminTicketDeleteDAO dao = new AdminTicketDeleteDAO();
		
		deleteId = getDeleteId();
		
		count = dao.delete(deleteId);

		if(count>0){
			result = SUCCESS;
		}
		return result;
		}
		
		/**
		 * 削除したいチケットのID取得するメソッド
		 * @return deleteId
		 */
		public int getDeleteId() {
			return deleteId;
		}
		/**
		 * 削除したいチケットのID格納するメソッド
		 * @param deleteId 削除したいチケットのID
		 */
		public void setDeleteId(int deleteId) {
			this.deleteId = deleteId;
		}

	}
