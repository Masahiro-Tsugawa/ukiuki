package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.dto.AdminLoginDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * DBから管理者情報の取得を実行する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminLoginDAO {
	/**
	 * 管理者情報を検索するメソッド
	 * @param name 管理者名
	 * @param password パスワード
	 * @param dtoSelect ログインしようとしている管理者の情報を取得・格納するクラス
	 * @return count 検索結果を取得した回数
	 */
	public int select(String name, String password, AdminLoginDTO dtoSelect) {

		Connection con = DBConnector.getConnection();
		int count = 0;

		try {
			String sql = "select id,admin_name from admin where ";
			sql += "admin_name = ? and admin_password = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				dtoSelect.setId(rs.getInt("id"));
				dtoSelect.setName(rs.getString("admin_name"));
				count = 1;
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
		return count;
	}

	/**
	 * ログイン情報をtrueに編集するメソッド
	 * @param id 管理者ID
	 * @return count 編集結果を取得した回数
	 */
	public int update(int id) {

		Connection con = DBConnector.getConnection();
		int count = 0;

		try {

			String sql = "update admin set is_login=true where id=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			count = ps.executeUpdate();

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
		return count;
	}
}