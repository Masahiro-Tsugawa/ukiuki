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
 * 管理ページからDBに登録されている全てのチケットを検索するアクション
 * @author Mizukoshi Shizuka
 * @since 2015/11/18
 * @version 1.0
 */
public class AdminTicketSelectAction extends ActionSupport{

	/***
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * @author Mizukoshi Shizuka
	 * @since 2015/11/18
	 * @return SUCCESS
	 */
	public String execute() throws Exception {

	AdminTicketSelectDAO dao = new AdminTicketSelectDAO();
	AdminTicketSelectDTO dto = new AdminTicketSelectDTO();
	boolean resultDAO = dao.select();

	if(resultDAO){
		ticketList = dao.getTicketList();
		dto = ticketList.get(0);
		
		result = SUCCESS;
	}
	return result;
	}

}

