/**
 * 
 */
package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * DBからチケット情報の削除を実行する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminTicketDeleteDAO {

	/***
	 * 実行結果
	 */
	boolean result = false;

	/**
	 * 管理者画面から任意のチケット情報を販売中止に変更するメソッド
	 * 
	 * @param deleteId 販売中止したいチケットのID
	 * @return rsIsSale 1以上なら販売中止に変更成功
	 */
	public int updateIsSale(int deleteId) {

		Connection con;
		con = DBConnector.getConnection();
		int isSale = 0;

		try {
			String sql = "update ticket set is_sale=false where id=?";

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setInt(1, deleteId);
			isSale = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isSale;
	}

	/**
	 * 管理者画面から任意のチケット情報を非表示に変更するメソッド
	 * 
	 * @param deleteId 販売中止したいチケットのID
	 * @return rsIsShow 非表示への変更の可否
	 */
	public int updateIsShow(int deleteId) {

		Connection con;
		con = DBConnector.getConnection();
		int isShow = 0;

		try {

			String sql = "update ticket set is_show=false where id=?";

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setInt(1, deleteId);
			isShow = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isShow;
	}
}
