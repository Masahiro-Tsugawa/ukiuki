/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.dao.AdminTicketSelectDAO;
import com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理ページからDBに登録されている全てのチケットを検索する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminTicketSelectAction extends ActionSupport {

	/**
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 7663473936501306795L;
	/***
	 * チケットの一覧を格納するリスト
	 */
	public List<AdminTicketSelectDTO> ticketList = new ArrayList<AdminTicketSelectDTO>();
	/***
	 * 実行結果
	 */
	public String result = ERROR;

	/***
	 * チケット一覧を取得できなかった際のエラーメッセージ
	 */
	private String errorTicketSelect;

	/**
	 * 管理者ページからDBに登録されている全てのチケットを検索するメソッド
	 * 
	 * @return チケット編集の可否
	 */
	public String execute() throws Exception {

		AdminTicketSelectDAO dao = new AdminTicketSelectDAO();
		boolean resultDAO = dao.select();

		if (resultDAO == false) {
			setErrorTicketSelect("チケット一覧の取得に失敗しました");
			result = ERROR;
		}

		if (resultDAO) {
			ticketList = dao.getTicketList();
			result = SUCCESS;
		}
		return result;
	}

	/**
	 * エラーメッセージを取得するメソッド
	 * 
	 * @return errorTicketSelect
	 */
	public String getErrorTicketSelect() {
		return errorTicketSelect;
	}

	/**
	 * エラーメッセージを格納するメソッド
	 * 
	 * @param errorTicketSelect
	 *            エラーメッセージ
	 */
	public void setErrorTicketSelect(String errorTicketSelect) {
		this.errorTicketSelect = errorTicketSelect;
	}

}
