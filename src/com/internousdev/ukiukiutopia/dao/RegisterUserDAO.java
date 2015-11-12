package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import com.internousdev.ukiukiutopia.util.DBConnector;

public class RegisterUserDAO {

	// インサートするメソッド
	public int insert(String email, String password, String name,
			String telNum, String posCode, String address) throws Exception {

		Connection con = DBConnector.getConnection();
		
		DateTime dt = new DateTime();

		String sql = "insert into user(email,password,name,tel_num,postal_code,address,"
				+ "registered_date,renew_date) value(?,?,?,?,?,?,?,?)";

		PreparedStatement ps2;
		ps2 = con.prepareStatement(sql);
		ps2.setString(1, email);
		ps2.setString(2, password);
		ps2.setString(3, name);
		ps2.setString(4, telNum);
		ps2.setString(5, posCode);
		ps2.setString(6, address);
		ps2.setString(7, dt.toString(DateTimeFormat.mediumDateTime()));
		ps2.setString(8, dt.toString(DateTimeFormat.mediumDateTime()));

		int rscount = ps2.executeUpdate();

		if (rscount > 0) {
			System.out.println("insert - インサート完了");
		} else {
			System.out.println("insert - インサード失敗");
		}

		return rscount;
	}// insert

}
