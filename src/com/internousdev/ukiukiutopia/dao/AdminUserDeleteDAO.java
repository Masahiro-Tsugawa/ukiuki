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
	
	/***
	 * 実行結果
	 */
	private int rscount = 0;

	/**
	 * 指定したユーザーの個人情報を削除するメソッド
	 * 
	 * @param deleteMail 削除したいユーザーのメールアドレス
	 * @return rscount 削除成功の可否
	 * @throws Exception ユーザー情報を削除できませんでした
	 */
	public int delete(String deleteMail) {

		Connection con = DBConnector.getConnection();
		try {
			String sql = "delete from user where email=?";

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setString(1, deleteMail);
			rscount = ps.executeUpdate();

			if (rscount < 0) {
				return rscount;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rscount;
	}
}
