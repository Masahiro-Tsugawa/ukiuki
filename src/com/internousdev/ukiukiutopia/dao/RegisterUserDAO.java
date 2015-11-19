package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import com.internousdev.ukiukiutopia.util.DBConnector;


/**
 * ユーザー情報の為のクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 *
 */
public class RegisterUserDAO {

	/**
	 * ユーザー情報メソッド
	 * @param email メールアドレスの格納
	 * @param password パスワードの格納
	 * @param name 名前の格納
	 * @param telNum 電話番号の格納
	 * @param posCode 郵便番号の格納
	 * @param address 住所の格納
	 * @return ps2.executeUpdate インサート完了と失敗の戻り値
	 * @throws Exception 例外エラー
	 */
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


		return rscount;
	}// insert

}

