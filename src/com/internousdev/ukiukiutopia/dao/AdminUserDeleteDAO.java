package com.internousdev.ukiukiutopia.dao;
/**
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;

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
	 * DBと接続
	 */
	Connection con;
	/***
	 * 実行結果
	 */
	private int rscount = 0;

	/**
	 * 指定したユーザーの個人情報を削除するメソッド
	 * 
	 * @param deleteMail
	 * @param dto
	 * @return 削除成功の可否
	 * @throws Exception
	 */
	public int delete(String deleteMail) throws Exception {

		con = DBConnector.getConnection();

		try {
			String sql = "delete from user where email=?";

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setString(1, deleteMail);
			int rscount = ps.executeUpdate();

			if (rscount < 0) {
				return rscount;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return rscount;
	}
}
