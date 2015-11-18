package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * 
 * @author A.Masui
 * @version 1.1　
 * @since 1.0　
 *　DBからemailとpasswordを検索する為のクラス
 */
public class HomeDAO {

	private String name;
	private int id;

	/**
	 * DB検索メソッド
	 * @param email DB内のemail
	 * @param password DB内のpassword
	 * @return　検索の結果の成否
	 */
	public String select(String email, String password) {
		System.out.println(email);
		Connection conn = null;
		String ret = "error";
		try {
			conn = (Connection) DBConnector.getConnection();
			String sql = "SELECT * FROM user WHERE ";
			sql += "email = ? AND password = ?";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ret = "success";
				name = rs.getString("name");
				id = rs.getInt("id");

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
	
	/**
	 * ユーザーID取得メソッド
	 * @return　ユーザーID
	 */
	public int getId() {
		return id;
	}

	/**
	 *  ユーザーID格納メソッド
	 * @param id ユーザーID
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 *  ユーザー名取得メソッド
	 * @return　ユーザー名
	 */
	public String getName() {
		return name;
	}

	/**
	 *  ユーザー名格納メソッド
	 * @param name ユーザー名
	 */
	public void setName(String name) {
		this.name = name;
	}
}
