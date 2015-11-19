package com.internousdev.ukiukiutopia.dao;
/**
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * DBから選択したユーザー情報の編集を実行する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminUserUpdateDAO {
	/***
	 * DBと接続
	 */
	Connection con;
	/***
	 * 実行結果
	 */
	int rscount = 0;

	/**
	 * 選択したユーザー情報を編集するメソッド
	 * 
	 * @param purposeEmail
	 * @param updateEmail
	 * @param updatePassword
	 * @param updateName
	 * @param updateTelNum
	 * @param updatePostalCode
	 * @param updateAddress
	 * @param updateRenewDate
	 * @return rscount>0:編集成功
	 * @throws Exception
	 */
	public int updateEmail(String purposeEmail, String updateEmail)
					throws Exception {

		con = DBConnector.getConnection();

		try {

			if (("".equals(purposeEmail)) == false) {

				if (("".equals(updateEmail)) == false) {
					String sql = "update user set email=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateEmail);
					ps.setString(2, purposeEmail);

					rscount = ps.executeUpdate();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return rscount;
	}

	/**
	 * 選択したユーザーのパスワードを編集するメソッド
	 * 
	 * @param purposeEmail
	 * @param updateEmail
	 * @param updatePassword
	 * @return rscount>0:編集成功
	 * @throws Exception
	 */
	public int updatePassword(String purposeEmail, String updatePassword) throws Exception {

		con = DBConnector.getConnection();

		try {
			if (("".equals(purposeEmail)) == false) {
				if (("".equals(updatePassword)) == false) {
					String sql = "update user set password=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updatePassword);
					ps.setString(2, purposeEmail);

					rscount = ps.executeUpdate();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return rscount;
	}

	/**
	 * 選択したユーザーのユーザー名を編集するメソッド
	 * 
	 * @param purposeEmail
	 * @param updateEmail
	 * @param updateName
	 * @return rscount>0:編集成功
	 * @throws Exception
	 */
	public int updateName(String purposeEmail, String updateName) throws Exception {

		con = DBConnector.getConnection();

		try {

			if (("".equals(purposeEmail)) == false) {
				if (("".equals(updateName)) == false) {
					String sql = "update user set name=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateName);
					ps.setString(2, purposeEmail);

					rscount = ps.executeUpdate();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return rscount;
	}

	/**
	 * 選択したユーザーの電話番号を編集するメソッド
	 * 
	 * @param purposeEmail
	 * @param updateEmail
	 * @param updateTelNum
	 * @return rscount>0:編集成功
	 * @throws Exception
	 */
	public int updateTelNum(String purposeEmail, String updateTelNum) throws Exception {

		con = DBConnector.getConnection();

		try {

			if (("".equals(purposeEmail)) == false) {
				if (("".equals(updateTelNum)) == false) {
					String sql = "update user set tel_num=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateTelNum);
					ps.setString(2, purposeEmail);

					rscount = ps.executeUpdate();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return rscount;

	}

	/**
	 * 選択したユーザーの郵便番号を編集するメソッド
	 * 
	 * @param purposeEmail
	 * @param updateEmail
	 * @param updatePostalCode
	 * @return rscount>0:編集成功
	 * @throws Exception
	 */
	public int updatePostalCode(String purposeEmail, String updatePostalCode) throws Exception {

		con = DBConnector.getConnection();

		try {

			if (("".equals(purposeEmail)) == false) {
				if (("".equals(updatePostalCode)) == false) {
					String sql = "update user set postal_code=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updatePostalCode);
					ps.setString(2, purposeEmail);

					rscount = ps.executeUpdate();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return rscount;
	}

	/**
	 * 選択したユーザーの住所を編集するメソッド
	 * 
	 * @param purposeEmail
	 * @param updateEmail
	 * @param updateAddress
	 * @return rscount>0:編集成功
	 * @throws Exception
	 */
	public int updateAddress(String purposeEmail, String updateAddress) throws Exception {

		con = DBConnector.getConnection();

		try {

			if (("".equals(purposeEmail)) == false) {
				if (("".equals(updateAddress)) == false) {
					String sql = "update user set Address=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateAddress);
					ps.setString(2, purposeEmail);

					rscount = ps.executeUpdate();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} 
		return rscount;

	}
	
	/**
	 * 選択したユーザーの更新日を編集するメソッド
	 * 
	 * @param purposeEmail
	 * @param updateEmail
	 * @param updateRenewDate
	 * @return rscount>0:編集成功
	 * @throws Exception
	 */
	public int updateRenewDate(String purposeEmail, String updateRenewDate) throws Exception {

		con = DBConnector.getConnection();

		try {

			if (("".equals(purposeEmail)) == false) {
				String sql = "update user set renew_date=? where email=?";
				PreparedStatement ps;

				ps = con.prepareStatement(sql);
				ps.setString(1, updateRenewDate);
				ps.setString(2, purposeEmail);

				rscount = ps.executeUpdate();
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return rscount;

	}
}
