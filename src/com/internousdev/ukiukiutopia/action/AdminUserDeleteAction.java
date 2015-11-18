package com.internousdev.ukiukiutopia.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.AdminUserDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理ページからユーザーを削除するアクション
 * @author Mizukoshi Shizuka
 * @since 2015/11/18
 * @version 1.0
 */
public class AdminUserDeleteAction extends ActionSupport implements SessionAware {

	/***
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 1L;
	
	/***
	 * 削除したいユーザーのメールアドレス
	 */
	private String delmail;
	/***
	 * DAOの実行成功回数
	 */
	int count;
	/***
	 * 実行結果
	 */
	public String result=ERROR;
	/***
	 * 削除したいユーザーのメールアドレスをセッションから取得
	 */
	private Map<String, Object> session;

	/**
	 * 管理者ページからユーザーを削除するメソッド
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return SUCCESS
	 */
		public String execute() throws Exception {

		AdminUserDeleteDAO dao = new AdminUserDeleteDAO();
		
		String delmail = (String) session.get("email");
		count = dao.delete(delmail);

		if(count>0){
			result = SUCCESS;
		}
		session.remove(delmail);
		return result;
		}
		
		/**
		 * 削除したいユーザーのメールアドレス取得メソッド
		 * @author Mizukoshi Shizuka
		 * @since 2015/11/18
		 * @return delmail
		 */
		public String getDelmail() {
			return delmail;
		}
		/**
		 * 削除したいユーザーのメールアドレス格納メソッド
		 * @author Mizukoshi Shizuka
		 * @since 2015/11/18
		 * @param delmail 削除したいユーザーのメールアドレス
		 */
		public void setDelmail(String delmail) {
			this.delmail = delmail;
		}
		
		/**
		 * セッション取得メソッド
		 * @author Mizukoshi Shizuka
		 * @since 2015/11/18
		 * @return session
		 */
		public Map<String, Object> getSession() {
			return session;
		}
		/**
		 * セッション格納メソッド
		 * @author Mizukoshi Shizuka
		 * @since 2015/11/18
		 * @param session セッション
		 */
		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

	}
