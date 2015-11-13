package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ukiukiutopia.util.DBConnector;

public class BuyCompleteDAO {
	public int updateToUser(String token, String number, String email) throws Exception {

		Connection con = DBConnector.getConnection();

		String sql = "update user set credit_token=? AND credit_num=？　where　email=?;";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, token);
		ps.setString(2, number);
		ps.setString(3, email);
		int rscount = ps.executeUpdate();

		return rscount;
	}

	public int selectUserId(String email) throws Exception {
		Connection con = DBConnector.getConnection();

		String sql = "select id from user where email=?;";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);

		int userId = ps.executeUpdate();

		return userId;
	}

	public int selectOrderId(int userID, String date) throws Exception {
		Connection con = DBConnector.getConnection();

		String sql = "select id from `order` where user_id=? and registered_date=?;";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, userID);
		ps.setString(2, date);
		int orderId = ps.executeUpdate();

		return orderId;
	}

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
