package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ukiukiutopia.util.DBConnector;

public class BuyCompleteDAO {
	public int updateToUser(String token, String number) throws Exception {

		Connection con = DBConnector.getConnection();

		String sql = "update user set credit_token = ? AND credit_num = ) value(?,?)";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setString(1, token);
		ps.setString(2, number);

		int rscount = ps.executeUpdate();

		return rscount;
	}

	public int insertToOrder(int userId, String date) throws Exception {

		Connection con = DBConnector.getConnection();

		String sql = "insert into `order`(user_id,registered_date) value(?,?)";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setInt(1, userId);
		ps.setString(2, date);

		int rscount = ps.executeUpdate();

		return rscount;
	}

	public int insertToTicket(int userId, String date) throws Exception {

		Connection con = DBConnector.getConnection();

		String sql = "insert into order_ticket(user_id,registered_date) value(?,?)";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setInt(1, userId);
		ps.setString(2, date);

		int rscount = ps.executeUpdate();

		return rscount;
	}
}
