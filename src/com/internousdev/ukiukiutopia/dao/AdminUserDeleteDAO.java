package com.internousdev.ukiukiutopia.dao;
/**
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * 指定したユーザーの個人情報を削除する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminUserDeleteDAO {

	/**
	 * 指定したユーザーの個人情報を削除するメソッド
	 * @param deleteMail 削除したいユーザーのメールアドレス
	 * @return count 削除成功の件数
	 */
	public int delete(String deleteMail) {

		int count = 0;
		Connection con = DBConnector.getConnection();
		try {
			String sql = "delete from user where email=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, deleteMail);
			count = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
}
