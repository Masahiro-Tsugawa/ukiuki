package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * 完了ボタンプッシュ後に購入データをDBへ登録する為のクラス
 * @author M.Namatame 
 * @version 1.1 
 * @since 1.0
 */
public class BuyCompleteDAO {

	/**
	 * ユーザーのクレジットカード情報をアップデートするメソッド
	 * @param token クレジットカードトークン
	 * @param number クレジットカード下四桁
	 * @param email ユーザーメールアドレス
	 * @return count アップデート数
	 */
	public int updateToUser(String token, String number, String email) {

		int count = 0;
		Connection con = DBConnector.getConnection();

		String sql = "update user set credit_token=?,credit_num=? where email=?;";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, token);
			ps.setString(2, number);
			ps.setString(3, email);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}

	/**
	 * ユーザーIDを取得するメソッド
	 * @param email ユーザーメールアドレス
	 * @return userId ユーザーID
	 */
	public int selectUserId(String email) {
		int userId = 0;
		Connection con = DBConnector.getConnection();

		String sql = "select id from user where email=?;";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				userId = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userId;
	}

	/**
	 * 注文IDをDBから取得するメソッド
	 * @param userId ユーザーID
	 * @param date 購入を確定した日時
	 * @return orderId 注文ID
	 */
	public int selectOrderId(int userId, String date) {
		int orderId = 0;
		Connection con = DBConnector.getConnection();

		String sql = "select id from `order` where user_id=? and registered_date=?;";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setString(2, date);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				orderId = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orderId;
	}

	/**
	 * 注文情報をDBへ登録するメソッド
	 * @param userId ユーザーID
	 * @param date 購入を確定した日時
	 * @return count アップデート数
	 */
	public int insertToOrder(int userId, String date) {
		int count = 0;
		Connection con = DBConnector.getConnection();

		String sql = "insert into `order`(user_id,registered_date) value(?,?);";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setString(2, date);

			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	/**
	 * チケットの注文情報をDBへ登録するメソッド
	 * @param orderId 注文ID
	 * @param ticketId チケットID
	 * @param sheets 枚数
	 * @param buyTotal チケット毎の小計
	 * @param date 購入を確定した日時
	 * @return count アップデート数
	 */
	public int insertToOrderTicket(int orderId, int ticketId, int sheets, int buyTotal, String date){
		int count = 0;
		Connection con = DBConnector.getConnection();

		String sql = "insert into order_ticket(order_id,ticket_id,sheets,total_amount,registered_date) value(?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, orderId);
			ps.setInt(2, ticketId);
			ps.setInt(3, sheets);
			ps.setInt(4, buyTotal);
			ps.setString(5, date);

			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
}
