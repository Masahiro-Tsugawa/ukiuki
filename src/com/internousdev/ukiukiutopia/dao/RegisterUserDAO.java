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
 * 
 * @author N.Minami
 * @version 1.1
 * @since 1.0
 */
public class RegisterUserDAO {
	/**
	 * 会員ID
	 */
	private int id;
	/**
	 * 会員名
	 */
	private String name;

	/**
	 * ユーザー情報をデータベースにインサートするメソッド
	 * @param email メールアドレス
	 * @param password パスワード
	 * @param name 名前
	 * @param telNum 電話番号
	 * @param posCode 郵便番号
	 * @param address 住所
	 * @return count インサート完了で1，失敗で0
	 */
	public int insert(String email, String password, String name, String telNum, String posCode, String address){

		int count = 0;
		Connection con = DBConnector.getConnection();
		DateTime dt = new DateTime();

		String sql = "insert into user(email,password,name,tel_num,postal_code,address,"
				+ "registered_date,renew_date) value(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ps.setString(3, name);
			ps.setString(4, telNum);
			ps.setString(5, posCode);
			ps.setString(6, address);
			ps.setString(7, dt.toString(DateTimeFormat.mediumDateTime()));
			ps.setString(8, dt.toString(DateTimeFormat.mediumDateTime()));

			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return count;
	}

	/**
	 * OAuthの情報をアップデートするメソッド
	 * @param OAuthId OAuth認証で取得したID
	 * @param OAuthName OAuth認証で利用したSNS名
	 * @param email メールアドレス
	 * @return result ユーザー情報のアップデートができたか否か
	 */
	public boolean update(String OAuthId, String OAuthName, String email) {

		boolean result = false;

		Connection con = DBConnector.getConnection();
		DateTime dt = new DateTime();

		String sql = "update user set unique_id=?,oauth_name=?,renew_date=? where email=?;";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, OAuthId);
			ps.setString(2, OAuthName);
			ps.setString(3, dt.toString(DateTimeFormat.mediumDateTime()));
			ps.setString(4, email);

			if (ps.executeUpdate() > 0) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * メールアドレスでユーザーのIDと名前を検索するメソッド
	 * @param email メールアドレス
	 * @return result 処理ができたか否か
	 */
	public boolean select(String email) {
		boolean result = false;

		Connection con = DBConnector.getConnection();
		String sql = "select id,name from user where email=?;";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt("id");
				name = rs.getString("name");
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * 会員ID取得メソッド
	 * @return id 会員ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * 会員名取得メソッド
	 * @return name 会員名
	 */
	public String getName() {
		return name;
	}

}
