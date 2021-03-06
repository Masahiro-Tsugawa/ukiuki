package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * DBから選択したユーザー情報の検索を実行する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminUserSelectDAO {
	/***
	 * DBから取得したユーザー情報を格納するリスト
	 */
	public List<AdminUserSelectDTO> userList = new ArrayList<AdminUserSelectDTO>();

	/**
	 * ユーザー情報を検索するメソッド
	 * 
	 * @param selectEmail 編集したいユーザーのメールアドレス
	 * @return result true：検索結果を取得成功
	 */
	public boolean select(String selectEmail) {

		boolean result = false;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "select email,password,name,tel_num,postal_code,address,renew_date from user where email=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, selectEmail);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				AdminUserSelectDTO dto = new AdminUserSelectDTO();
				dto.setEmail(rs.getString(1));
				dto.setPassword(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setTelNum(rs.getString(4));
				dto.setPostalCode(rs.getString(5));
				dto.setAddress(rs.getString(6));
				dto.setRenewDate(rs.getString(7));

				userList.add(dto);

				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 選択したユーザー情報を取得するメソッド
	 * 
	 * @return userList 選択したユーザー情報のリスト
	 */
	public List<AdminUserSelectDTO> getUserList() {
		return userList;
	}

}
