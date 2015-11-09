package com.internousdev.ukiukiutopia.dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * @author internous
 *
 */
public class AdminLoginDAO {
	public String admin_name;
	public String select(String id, String password) {

		Connection conn = null;
		String ret = "error";
		System.out.println("aaa");
		try {
			conn = (Connection) DBConnector.getConnection();
			String sql = "SELECT * FROM admin WHERE ";
			sql += "id = ? AND admin_password = ?";
			System.out.println(sql);
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getString("admin_name");
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
		return ret;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
}
