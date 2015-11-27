package com.internousdev.ukiukiutopia.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.util.DBConnector;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AdminLoginUpdateAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 3835450304779617995L;
	
	/***
	 * 管理者名を保持してブラウザに表示するためにセッションを用意
	 */
	private Map<String, Object> session;

	public String execute() {

		String result = ERROR;
		
		Connection con = DBConnector.getConnection();

		try {

			String sql = "update admin set is_login=false";
			PreparedStatement ps = con.prepareStatement(sql);

			ps = con.prepareStatement(sql);
			
			if(ps.executeUpdate() > 0){
				session.clear();
				result = SUCCESS;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	/**
	 * セッション格納するメソッド
	 * @param session 管理者名を格納する
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
