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
	private int rscount = 0;

	/**
	 * 選択したユーザー情報を編集するメソッド
	 * 
	 * @param purposeEmail 編集するメールアドレス
	 * @param updateEmail 新しいメールアドレス
	 * @return 編集の可否
	 * @throws Exception メールアドレスを編集できません。
	 */
	public int updateEmail(String purposeEmail, String updateEmail) throws Exception {

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
	 * @param purposeEmail	編集するメールアドレス
	 * @param updateEmail 新しいメールアドレス
	 * @param updatePassword 新しいパスワード
	 * @return 編集の可否
	 * @throws Exception パスワードを編集できません。
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
	 * @param purposeEmail 編集するメールアドレス
	 * @param updateEmail 新しいメールアドレス
	 * @param updateName 新しいユーザー名
	 * @return 編集の可否
	 * @throws Exception ユーザー名を編集できません。
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
	 * @param purposeEmail 編集するメールアドレス
	 * @param updateEmail 新しいメールアドレス
	 * @param updateTelNum 新しい電話番号
	 * @return 編集の可否
	 * @throws Exception 電話番号を編集できません。
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
	 * @param purposeEmail 編集するメールアドレス
	 * @param updateEmail 新しいメールアドレス
	 * @param updatePostalCode 新しい郵便番号
	 * @return 編集の可否
	 * @throws Exception 郵便番号を編集できません。
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
	 * @param purposeEmail 編集するメールアドレス
	 * @param updateEmail 新しいメールアドレス
	 * @param updateAddress 新しい住所
	 * @return 編集の可否
	 * @throws Exception 住所を編集できません。
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
	 * @param purposeEmail 編集するメールアドレス
	 * @param updateEmail 新しいメールアドレス
	 * @param updateRenewDate 新しい更新日
	 * @return 編集の可否
	 * @throws Exception 更新日を編集できません。
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
