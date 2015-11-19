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
	 * @return result　結果
	 */
	public boolean select(String userUniqueId, String oauthName) {
		boolean result = false;
		con = DBConnector.getConnection();
		try {
			String sql = "SELECT id, name FROM user WHERE unique_id = ? AND oauth_name = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, userUniqueId);
			stmt.setString(2, oauthName);
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
	 * ユーザー情報登録メソッド
	 * @param uniqueId 取得したユニークID
	 * @param oauthName 取得した名前
	 * @param userName 
	 * @return result　結果
	 */
	
	public boolean insert(String uniqueId, String userName, String oauthName) {
		boolean result = false;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String now = sdf.format(cal.getTime());
		con = DBConnector.getConnection();
		String sql = "INSERT INTO user(name, unique_id, oauth_name, created_at, updated_at) values (?,?,?,?,?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, userName);
			stmt.setString(2, uniqueId);
			stmt.setString(3, oauthName);
			stmt.setString(4, now);
			stmt.setString(5, now);

			int insertCount = stmt.executeUpdate();
			if (insertCount > 0) {
				result = true;
			}
		} catch (SQLException e) {
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