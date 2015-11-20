package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import com.internousdev.ukiukiutopia.util.DBConnector;


/**
 * ユーザー情報を検索しインサートとアップデートするクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 *
 */
public class RegisterUserDAO {
	
	/**
	 * IDの表示
	 */
	private int id;
	
	/**
	 * 名前の表示
	 */
	private String name;

	/**
	 * ユーザー情報をデータベースにインサートするメソッド
	 * @param email メールアドレスの格納
	 * @param password パスワードの格納
	 * @param name 名前の格納
	 * @param telNum 電話番号の格納
	 * @param posCode 郵便番号の格納
	 * @param address 住所の格納
	 * @return rscount インサートする情報
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
	}
	
	/**
	 * OAuthの情報をアップデートするメソッド
	 * @param OAuthId オーオースIDの格納
	 * @param OAuthName オーオースユーザー名の格納
	 * @param email メールアドレスの格納
	 * @return result　OAuthの情報
	 * @throws SQLException 例外エラー
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
	 * IDと名前を検索するメソッド
	 * @param email メールアドレスの格納
	 * @return result IDと名前
	 * @throws SQLException　例外エラー
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

