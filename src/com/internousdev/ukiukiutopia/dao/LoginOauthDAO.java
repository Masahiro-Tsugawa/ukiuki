package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.internousdev.ukiukiutopia.dto.LoginOauthDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * @author A.Masui
 * @version 1.1　
 * @since 1.0　
 *　取得した情報を格納、照合、insertする為のクラス
 */
public class LoginOauthDAO {

	/**
	 * 取得した情報を格納する為のDTO
	 */
	private LoginOauthDTO dto = new LoginOauthDTO();
	Connection con = null;
	
	/**
	 * 取得したユニークIDの照合メソッド
	 * @param userUniqueId 取得したユニークID
	 * @param oauthName 取得した名前
	 * @param oauthEmail 
	 * @param NETWORK_NAME 
	 * @return result　結果
	 */
	public boolean select(String userUniqueId, String oauthName, String oauthEmail, String NETWORK_NAME) {
		boolean result = false;
		con = DBConnector.getConnection();
		try {
			String sql = "SELECT id, name, email FROM user WHERE unique_id = ? AND oauth_name = ? AND email ";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, userUniqueId);
			stmt.setString(2, oauthName);
			stmt.setString(2, oauthEmail);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				dto.setUserId(rs.getInt(1));
				dto.setUserName(rs.getString(2));
				result = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * DTO取得メソッド
	 * 
	 * @return dto
	 */
	public LoginOauthDTO getLoginOauthDTO() {
		return dto;
	}

	/**
	 * DTO格納メソッド
	 * 
	 * @param dto
	 *            ログインユーザDTO
	 */
	public void setLoginOauthDTO(LoginOauthDTO dto) {
		this.dto = dto;
	}

}