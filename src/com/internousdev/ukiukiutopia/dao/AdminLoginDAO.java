package com.internousdev.ukiukiutopia.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.dto.AdminLoginDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * @author internous
 *
 */
public class AdminLoginDAO {

//	private String name;

//	private boolean is_login;

	public String select(String admin_name, String password, AdminLoginDTO dto) {

		Connection conn = null;
		String ret = "error";
		System.out.println("aaa");
		try {
			conn = (Connection) DBConnector.getConnection();
			String sql = "SELECT * FROM admin WHERE ";
			sql += "admin_name = ? AND admin_password = ?";
			System.out.println(sql);
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);

			ps.setString(1, admin_name);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("if");
				dto.setName(rs.getString("admin_name"));
				dto.setIsLogin(rs.getBoolean("is_login"));
//				System.out.println(dto.getIs_login());
				
				sql = "update admin set is_login=? where id=?";
				ps = conn.prepareStatement(sql);
				ps.setBoolean(1, true);
				ps.setInt(2, rs.getInt("id"));
				
				
				System.out.println("update - ps2 -"+ ps);

				int rscount = ps.executeUpdate();

				System.out.println("update - rsCount - 実行");
				if(rscount > 0){
				System.out.println("update - rsCount - Update OK");
				}//if
				
				
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
		System.out.println(ret);
		return ret;
	}
}