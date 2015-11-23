package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 *　DBからemailとpasswordを検索する為のクラス
 * @author A.Masui
 * @version 1.1　
 * @since 1.0　
 */
public class HomeDAO {

	private String name;
	private int id;

	/**
	 * データベース検索メソッド
	 * @param email データベース内のemail
	 * @param password データベース内のpassword
	 * @return　result データベースでemail,passwordを検索した結果の成否
	 */
	
	public boolean select(String email, String password) {
		Connection conn = DBConnector.getConnection();
		boolean result = false;
		try {
			String sql = "SELECT id,name FROM user WHERE email = ? AND password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result = true;
				name = rs.getString("name");
				id = rs.getInt("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		
		return result;
	}
	
	/**
	 * 顧客ID取得メソッド
	 * @return id　顧客登録ID
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
	 * @return　name 顧客登録名
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
