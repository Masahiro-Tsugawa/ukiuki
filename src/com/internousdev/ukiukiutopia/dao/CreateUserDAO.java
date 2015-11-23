package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * 新規登録メールアドレスが既にDBに登録されてないか確かめる為のクラス
 * @author M.Tsugawa
 * @version 1.1
 * @since 1.0
 */
public class CreateUserDAO {
	private String email;
    /**
     * 新規登録メールアドレスが既にDBに登録されてないか確かめるメソッド
     * @param userEmail 登録されているメールアドレス
     * @return result 既存アドレスがあるかの有無
     */
	public boolean select(String userEmail) {

		Connection conn = DBConnector.getConnection();
		boolean result = true;
		try {
			String sql = "SELECT email FROM user WHERE email = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userEmail);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result = false;
				setEmail(rs.getString("email"));
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
		return result;
	}
	
	/**
	 * 新規登録メールアドレスを取得するメソッド
	 * @return email 新規登録メールアドレス
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 新規登録メールアドレスを設定するメソッド
	 * @param email 新規登録メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}