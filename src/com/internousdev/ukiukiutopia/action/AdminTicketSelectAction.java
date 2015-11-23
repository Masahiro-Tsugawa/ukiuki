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
	private List<AdminTicketSelectDTO> ticketList = new ArrayList<AdminTicketSelectDTO>();

	/***
	 * チケット一覧を取得できなかった際のエラーメッセージ
	 */
	private String errorTicketSelect;

	/**
	 * 管理者ページからDBに登録されている全てのチケットを検索するメソッド
	 * 
	 * @return result チケット編集の可否
	 */
	public String execute() {

		String result = ERROR;
		AdminTicketSelectDAO dao = new AdminTicketSelectDAO();
		boolean resultDAO = dao.select();

		if (resultDAO == false) {
			setErrorTicketSelect("チケット一覧の取得に失敗しました");
			return result;
		}

		ticketList = dao.getTicketList();
		result = SUCCESS;

		return result;
	}

	/**
	 * エラーメッセージを取得するメソッド
	 * 
	 * @return errorTicketSelect エラーメッセージ
	 */
	public String getErrorTicketSelect() {
		return errorTicketSelect;
	}

	/**
	 * エラーメッセージを格納するメソッド
	 * 
	 * @param errorTicketSelect エラーメッセージ
	 */
	public void setErrorTicketSelect(String errorTicketSelect) {
		this.errorTicketSelect = errorTicketSelect;
	}

	/**
	 * チケットの一覧を格納するリストを取得するメソッド
	 * @return ticketList チケットの一覧を格納するリスト
	 */
	public List<AdminTicketSelectDTO> getTicketList() {
		return ticketList;
	}

	/**
	 * チケットの一覧を格納するリストを格納するメソッド
	 * @param ticketList チケットの一覧を格納するリスト
	 */
	public void setTicketList(List<AdminTicketSelectDTO> ticketList) {
		this.ticketList = ticketList;
	}

}
