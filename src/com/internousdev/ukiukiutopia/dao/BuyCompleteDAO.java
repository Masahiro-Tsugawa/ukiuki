package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * @author internous
 *
 */
public class BuyCompleteDAO {
	/**
	 * @param token
	 * @param number
	 * @param email
	 * @return 
	 * @throws Exception
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
	 * @param email
	 * @return
	 * @throws Exception
	 */
	public int selectUserId(String email) throws Exception {
		Connection con = DBConnector.getConnection();

		String sql = "select * from user where email=?;";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);

		ResultSet rs = ps.executeQuery();
		rs.next();

		System.out.println("useid=" + rs.getInt(1));

		return rs.getInt(1);
	}

	/**
	 * @param userId
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public int selectOrderId(int userId, String date) throws Exception {
		Connection con = DBConnector.getConnection();

		String sql = "select * from `order` where user_id=? and registered_date=?;";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, userId);
		ps.setString(2, date);

		ResultSet rs = ps.executeQuery();
		rs.next();

		System.out.println("orderid=" + rs.getInt(1));

		return rs.getInt(1);
	}

	/**
	 * @param userId
	 * @param date
	 * @return
	 * @throws Exception
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
	 * @param orderId
	 * @param ticketId
	 * @param sheets
	 * @param buyTotal
	 * @param date
	 * @return
	 * @throws Exception
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
