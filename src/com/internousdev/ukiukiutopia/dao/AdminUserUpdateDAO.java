package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * DBから選択したユーザー情報の編集を実行する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminUserUpdateDAO {

	/**
	 * 選択したユーザー情報を編集するメソッド
	 * @param purposeEmail 編集するメールアドレス
	 * @param updateEmail 新しいメールアドレス
	 * @return count 編集数
	 */
	public int updateEmail(String purposeEmail, String updateEmail) {

		int count = 0;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "update user set email=? where email=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, updateEmail);
			ps.setString(2, purposeEmail);

			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * 選択したユーザーのパスワードを編集するメソッド
	 * @param purposeEmail	編集するメールアドレス
	 * @param updatePassword 新しいパスワード
	 * @return count 編集数
	 */
	public int updatePassword(String purposeEmail, String updatePassword) {

		int count = 0;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "update user set password=? where email=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, updatePassword);
			ps.setString(2, purposeEmail);

			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * 選択したユーザーのユーザー名を編集するメソッド
	 * @param purposeEmail 編集するメールアドレス
	 * @param updateName 新しいユーザー名
	 * @return count 編集数
	 */
	public int updateName(String purposeEmail, String updateName) {

		int count = 0;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "update user set name=? where email=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, updateName);
			ps.setString(2, purposeEmail);

			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * 選択したユーザーの電話番号を編集するメソッド
	 * @param purposeEmail 編集するメールアドレス
	 * @param updateTelNum 新しい電話番号
	 * @return count 編集数
	 */
	public int updateTelNum(String purposeEmail, String updateTelNum) {

		int count = 0;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "update user set tel_num=? where email=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, updateTelNum);
			ps.setString(2, purposeEmail);

			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * 選択したユーザーの郵便番号を編集するメソッド
	 * @param purposeEmail 編集するメールアドレス
	 * @param updatePostalCode 新しい郵便番号
	 * @return count 編集数
	 */
	public int updatePostalCode(String purposeEmail, String updatePostalCode) {

		int count = 0;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "update user set postal_code=? where email=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, updatePostalCode);
			ps.setString(2, purposeEmail);

			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * 選択したユーザーの住所を編集するメソッド
	 * @param purposeEmail 編集するメールアドレス
	 * @param updateAddress 新しい住所
	 * @return count 編集数
	 */
	public int updateAddress(String purposeEmail, String updateAddress) {

		int count = 0;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "update user set Address=? where email=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, updateAddress);
			ps.setString(2, purposeEmail);

			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;

	}

	/**
	 * 選択したユーザーの更新日を編集するメソッド
	 * @param purposeEmail 編集するメールアドレス
	 * @param updateRenewDate 新しい更新日
	 * @return count 編集数
	 */
	public int updateRenewDate(String purposeEmail, String updateRenewDate) {

		int count = 0;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "update user set renew_date=? where email=?";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);
			ps.setString(1, updateRenewDate);
			ps.setString(2, purposeEmail);

			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;

	}
}
