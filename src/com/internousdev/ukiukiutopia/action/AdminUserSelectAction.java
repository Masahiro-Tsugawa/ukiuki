package com.internousdev.ukiukiutopia.action;
/**
 * 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.AdminUserSelectDAO;
import com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理ページから編集したいユーザーの情報を検索する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminUserSelectAction extends ActionSupport implements SessionAware{

	/**
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 5335805675679897912L;
	/***
     * 検索結果を格納するリスト
     */
	 public List<AdminUserSelectDTO> userList = new ArrayList<AdminUserSelectDTO>();
	 /***
	 * 実行結果
	 */
	 public String result = ERROR;
	 /***
	 * ユーザー情報を取得できなかった際のエラーメッセージ
	 */
	 private String errorUserSelect;
		
	 /***
	 * 編集したいユーザーのメールアドレスを保持する為のセッション
     */
	 private Map<String, Object> session;
	 /***
	 * 編集したいユーザーのメールアドレス
	 */
	 private String selectEmail;

	 /**
	　* 編集したいユーザーの情報を検索するメソッド
	　* @return ユーザー情報取得の可否
	 */
	 public String execute() throws Exception {
			
			if (selectEmail.equals("")) {
				addActionError("ユーザーIDを入力してください");
				return result;
				
			}else{

		AdminUserSelectDAO dao = new AdminUserSelectDAO();
		boolean resultDAO = dao.select(selectEmail);
		
		if(resultDAO==false){
			setErrorUserSelect("ユーザー情報の取得に失敗しました");
			return result;
		}
		
		if(resultDAO){
			userList = dao.getUserList();
			session.put("sessionEmail", selectEmail);
			result = SUCCESS;
		}
		return result;
		}
		}

		/**
		 * エラーメッセージを取得するメソッド
		 * @return errorUserSelect
		 */
		public String getErrorUserSelect(){
			return errorUserSelect;
		}
		/**
		 * エラーメッセージを格納するメソッド
		 * @param errorUserSelect エラーメッセージ
		 */
		public void setErrorUserSelect(String errorUserSelect) {
			this.errorUserSelect = errorUserSelect;
		}
		
	     /**
		 * セッションに格納するメソッド
		 * @param session セッション
		 */
	    public void setSession(Map<String, Object> session) {
			this.session = session;
		}
	    
	    /**
		 * 編集したいユーザーのメールアドレスを取得するメソッド
		 * @return selectEmail
		 */
		public String getSelectEmail() {
			return selectEmail;
		}
		/**
		 * 編集したいユーザーのメールアドレスを格納するメソッド
		 * @param selectEmail 編集したいユーザーのメールアドレス
		 */
		public void setSelectEmail(String selectEmail) {
			this.selectEmail = selectEmail;
		}


	}
