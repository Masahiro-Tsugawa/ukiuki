package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * 完了ボタンプッシュ後に購入データをDBへ登録する為のクラス
 * @author M.Namatame
 *　@version 1.1　
 *　@since 1.0
 */
public class BuyCompleteDAO {
	
	/**
	 * ユーザーのクレジットカード情報をアップデートするメソッド
	 * @param token クレジットカードトークン
	 * @param number クレジットカード下四桁
	 * @param email ユーザーメールアドレス
	 * @return rscount　アップデート数を返す
	 * @throws Exception 例外処理
	 */
	public int updateToUser(String token, String number, String email) throws Exception {

		Connection con = DBConnector.getConnection();

		String sql = "update user set credit_token=?,credit_num=? where email=?;";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, token);
		ps.setString(2, number);
		ps.setString(3, email);
		int rscount = ps.executeUpdate();

		return rscount;
	}

	/**
	 * ユーザーIDを取得するメソッド
	 * @param email ユーザーメールアドレス
	 * @return　rs.getInt(1)　ユーザーID
	 * @throws Exception 例外処理
	 */
	public int selectUserId(String email) throws Exception {
		Connection con = DBConnector.getConnection();

		String sql = "select id from user where email=?;";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);

		ResultSet rs = ps.executeQuery();
		rs.next();

		return rs.getInt(1);
	}

	/**
	 * 注文IDをDBから取得するメソッド
	 * @param userId ユーザーID
	 * @param date 購入を確定した日時
	 * @return rs.getInt(1)　注文ID
	 * @throws Exception 例外処理
	 */
	public int selectOrderId(int userId, String date) throws Exception {
		Connection con = DBConnector.getConnection();

		String sql = "select id from `order` where user_id=? and registered_date=?;";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, userId);
		ps.setString(2, date);

		ResultSet rs = ps.executeQuery();
		rs.next();

		return rs.getInt(1);
	}

	/**
	 * 注文情報をDBへ登録するメソッド
	 * @param userId ユーザーID
	 * @param date 購入を確定した日時
	 * @return　rscount アップデート数
	 * @throws Exception 例外処理
	 */
	public int insertToOrder(int userId, String date) throws Exception {

		Connection con = DBConnector.getConnection();

		String sql = "insert into `order`(user_id,registered_date) value(?,?);";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setInt(1, userId);
		ps.setString(2, date);

		int rscount = ps.executeUpdate();

		return rscount;
	}

	/**
	 * チケットの注文情報をDBへ登録するメソッド
	 * @param orderId 注文ID
	 * @param ticketId チケットID
	 * @param sheets 枚数
	 * @param buyTotal チケット毎の小計
	 * @param date 購入を確定した日時
	 * @return　rscount アップデート数
	 * @throws Exception 例外処理
	 */
	public int insertToOrderTicket(int orderId, int ticketId, int sheets, int buyTotal, String date) throws Exception {

		Connection con = DBConnector.getConnection();

		String sql = "insert into order_ticket(order_id,ticket_id,sheets,total_amount,registered_date) value(?,?,?,?,?)";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setInt(1, orderId);
		ps.setInt(2, ticketId);
		ps.setInt(3, sheets);
		ps.setInt(4, buyTotal);
		ps.setString(5, date);

		int rscount = ps.executeUpdate();

		return rscount;
	}
}
