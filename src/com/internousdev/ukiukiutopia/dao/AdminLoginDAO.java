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
	 * 管理者情報を検索するメソッド
	 * @param admin_name 
	 * @param password
	 * @param dto 
	 * @return success
	 */
	public String select(String admin_name, String password, AdminLoginDTO dto) {

		Connection conn = null;
		String ret = "error";
		try {
			conn = (Connection) DBConnector.getConnection();
			String sql = "SELECT * FROM admin WHERE ";
			sql += "admin_name = ? AND admin_password = ?";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);

			ps.setString(1, admin_name);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("if");
				dto.setName(rs.getString("admin_name"));
				dto.setIsLogin(rs.getBoolean("is_login"));
				sql = "update admin set is_login=? where id=?";
				ps = conn.prepareStatement(sql);
				ps.setBoolean(1, true);
				ps.setInt(2, rs.getInt("id"));

				int rscount = ps.executeUpdate();
				
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
}