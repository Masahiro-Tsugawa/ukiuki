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
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminTicketSelectAction extends ActionSupport{

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

	/**
	 * 管理者ページからDBに登録されている全てのチケットを検索するメソッド
	 * @return SUCCESS
	 */
	public String execute() throws Exception {

	AdminTicketSelectDAO dao = new AdminTicketSelectDAO();
	boolean resultDAO = dao.select();

	if(resultDAO){
		ticketList = dao.getTicketList();
		result = SUCCESS;
	}
	return result;
	}

}

