package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;

public class HomeDAO {

	private String name;

	public String select(int id,String user, String password) {
		System.out.println("dao");
		Connection conn = null;
		String ret = "error";
		try {
			conn = (Connection) DBConnector.getConnection();
			String sql = "SELECT * FROM user WHERE";
			sql += "id = ? AND email = ? AND password = ?";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, user);
			ps.setString(3, password);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
