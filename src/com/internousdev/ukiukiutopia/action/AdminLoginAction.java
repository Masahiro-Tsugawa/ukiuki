package com.internousdev.ukiukiutopia.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ukiukiutopia.dao.AdminLoginDAO;

/**
 * @author internous
 *
 */
public class AdminLoginAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	
	private Map<String, Object> session;

	public String execute() throws SQLException {
		if (name == null || name.equals(" ")){
			addActionError("ユーザー名を入力してください");
			return ERROR;
		}
		if (password == null || password.equals(" ")){
			addActionError("パスワードを入力してください");
			return ERROR;
		}
		
		AdminLoginDAO dao = new AdminLoginDAO();
		String ret = dao.select(name, password);
		
		if(ret == "error"){
			addActionError("ユーザー名もしくはパスワードが違います");
		}
		
		if(dao.getIs_login() == true){
			addActionError("すでにログインしているユーザーです");
			
		}
		session.put("name_key", dao.getAdmin_name());
		System.out.println(dao.getAdmin_name());
		return ret;

	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
// public class AdminLoginAction extends ActionSupport{
//
// private static final long serialVersionUID = 1L;
//
//
// private String ticketId;
// private String ticketInfo;
//
// public String execute(){
// ticketId="ticket";
// ticketInfo="info";
// return SUCCESS;
// }
//
// public void setTicketId(String ticketId){
// this.ticketId=ticketId;
// }
//
// public String getTicketId(){
// return ticketId;
// }
//
// public void setTicketInfo(String ticketInfo){
// this.ticketInfo=ticketInfo;
// }
//
// public String getTicketInfo(){
// return ticketInfo;
// }
// }