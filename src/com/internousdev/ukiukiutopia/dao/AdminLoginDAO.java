package com.internousdev.ukiukiutopia.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.dto.AdminLoginDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * DBから管理者情報の取得を実行する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminLoginDAO {

	/**
	 * 管理者ID
	 */
	int id;

	/**
	 * 管理者情報を検索するメソッド
	 * 
	 * @param name
	 * @param password
	 * @param dtoSelect
	 * @return rscountSelect 検索結果を取得した回数
	 */
	public int select(String name, String password, AdminLoginDTO dtoSelect) {

		Connection conn = null;
		int rscountSelect = 0;

		try {
			conn = DBConnector.getConnection();
			String sql = "select id,admin_password,admin_name,is_login from admin where ";
			sql += "admin_name = ? and admin_password = ?";
			PreparedStatement ps;

			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
	
			ResultSet rs = ps.executeQuery();
			rs.next();
			dtoSelect.setId(rs.getInt("id"));
			dtoSelect.setName(rs.getString("admin_name"));
			
			if (rs.next()) {

				rscountSelect = ps.executeUpdate();

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
		return rscountSelect;
	}

	/**
	 * ログイン情報をtrueに編集するメソッド
	 * @param dtoSelect
	 * @param id
	 * @return rscountUpdate 編集結果を取得した回数
	 */
	public int update(int id) {

		Connection conn = null;
		int rscountUpdate = 0;

		try {
			conn = (Connection) DBConnector.getConnection();

			String sql = "update admin set is_login=true where id=?";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);

			ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			rscountUpdate = ps.executeUpdate();
			
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
		return rscountUpdate;
	}
}