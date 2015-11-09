package com.internousdev.ukiukiutopia.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ukiukiutopia.dao.AdminLoginDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public abstract class AdminLoginAction extends ActionSupport implements SessionAware {
	private String id;
	private String password;
	private Map<String, Object> session;

	public String execute() throws SQLException {
		AdminLoginDAO dao = new AdminLoginDAO();
		String ret = dao.select(id, password);
		session.put("name_key", dao.admin_name);
		System.out.println("qqq");
		return ret;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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