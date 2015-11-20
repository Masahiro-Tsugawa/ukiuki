package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	 * ユーザーID
	 */
	private int id;
	/**
	 * ユーザー名
	 */
	private String name;

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

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, password);
		ps.setString(3, name);
		ps.setString(4, telNum);
		ps.setString(5, posCode);
		ps.setString(6, address);
		ps.setString(7, dt.toString(DateTimeFormat.mediumDateTime()));
		ps.setString(8, dt.toString(DateTimeFormat.mediumDateTime()));

		int rscount = ps.executeUpdate();

		return rscount;
	}
	
	/**
	 * @param OAuthId
	 * @param OAuthName
	 * @param email
	 * @return result
	 * @throws SQLException 
	 */
	public boolean update(String OAuthId,String OAuthName, String email) throws SQLException{
		
		boolean result = false;
		
		Connection con = DBConnector.getConnection();
		DateTime dt = new DateTime();
		
		String sql = "update user set unique_id=?,oauth_name=?,renew_date=? where email=?;";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, OAuthId);
		ps.setString(2, OAuthName);
		ps.setString(3, dt.toString(DateTimeFormat.mediumDateTime()));
		ps.setString(4, email);
		
		if(ps.executeUpdate()>0){
			result = true;
		}
		
		return result;
	}
	
	/**
	 * @param email
	 * @return result
	 * @throws SQLException
	 */
	public boolean select(String email) throws SQLException{
		boolean result = false;
		
		Connection con = DBConnector.getConnection();
		String sql = "select id,name from user where email=?;";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);

		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			id = rs.getInt("id");
			name = rs.getString("name");
			result = true;
		}
		return result;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

}

