package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;

public class HomeDAO {

	private String name;

	public String select(String user, String password) {
		System.out.println("dao");
		Connection conn = null;
		String ret = "error";
		try {
			conn = (Connection) DBConnector.getConnection();
			String sql = "SELECT * FROM user WHERE";
			sql += " email = ? AND password = ?";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ret = "success";
				name = rs.getString("name");

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
		return name;
	}

	public void setAdmin_name(String name) {
		this.name = name;
	}
}
