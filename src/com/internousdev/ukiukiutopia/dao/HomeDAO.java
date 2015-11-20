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
	 * データベース検索メソッド
	 * @param email データベース内のemail
	 * @param password データベース内のpassword
	 * @return　データベースでemail,passwordを検索の結果の成否
	 */
	public String select(String email, String password) {
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
	 * 顧客ID取得メソッド
	 * @return　顧客登録ID
	 */
	public int getId() {
		return id;
	}

	/**
	 *  顧客ID格納メソッド
	 * @param id 顧客登録ID
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 *  顧客名取得メソッド
	 * @return　顧客登録名
	 */
	public String getName() {
		return name;
	}

	/**
	 *  顧客名格納メソッド
	 * @param name 顧客登録名
	 */
	public void setName(String name) {
		this.name = name;
	}
}
