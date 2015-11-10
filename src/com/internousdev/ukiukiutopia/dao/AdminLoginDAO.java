package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * @author internous
 *
 */
public class AdminLoginDAO {

	private String admin_name;

	private boolean is_login;

	public String select(String name, String password) {

		Connection conn = null;
		String ret = "error";
		System.out.println("aaa");
		try {
			conn = (Connection) DBConnector.getConnection();
			String sql = "SELECT * FROM admin WHERE ";
			sql += "admin_name = ? AND admin_password = ?";
			System.out.println(sql);
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);

			ps.setString(1, name);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("if");
				admin_name = rs.getString("admin_name");
				System.out.println(is_login);
				ret = "success";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(ret);
		return ret;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public boolean getIs_login() {
		return is_login;
	}

	public void setIs_login(boolean is_login) {
		this.is_login = is_login;
	}
}
