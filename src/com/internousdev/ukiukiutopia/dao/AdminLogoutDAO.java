/**
 * 
 */
package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * ログイン情報をfalseに編集する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminLogoutDAO {
	/**
	 * ログイン情報をfalseに編集するメソッド
	 * 
	 * @param id
	 * @return 編集結果を取得した回数
	 */
	public int update(int id) {

		Connection conn = null;
		int rscount = 0;

		try {
			conn = (Connection) DBConnector.getConnection();

			String sql = "update admin set is_login=false where id=?";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);

			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rscount = ps.executeUpdate();

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
		return rscount;
	}

}
