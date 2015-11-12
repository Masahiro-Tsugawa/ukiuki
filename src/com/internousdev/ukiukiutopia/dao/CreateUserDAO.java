package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;

public class CreateUserDAO {
	private String email;

	public String select(String userEmail) {

		Connection conn = null;
		String ret = "success";
		try {
			conn = (Connection) DBConnector.getConnection();
			String sql = "SELECT * FROM user WHERE";
			sql += " email = ?";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, userEmail);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ret = "error";
				email = rs.getString("email");
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
		return email;
	}

	public void setAdmin_name(String email) {
		this.email = email;
	}

}