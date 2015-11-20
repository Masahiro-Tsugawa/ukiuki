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
	 * @param id 管理者ID
	 * @return count 編集結果を取得した回数
	 */
	public int update(int id) {

		Connection con = DBConnector.getConnection();
		int count = 0;

		try {

			String sql = "update admin set is_login=false where id=?";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

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
