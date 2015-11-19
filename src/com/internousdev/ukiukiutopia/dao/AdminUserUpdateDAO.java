package com.internousdev.ukiukiutopia.dao;
/**
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * DBから選択したユーザー情報の編集を実行する為のクラス
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
	public int update(String purposeEmail, String updateEmail, String updatePassword, String updateName,
			String updateTelNum, String updatePostalCode, String updateAddress, String updateRenewDate)
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
					
					purposeEmail = updateEmail;

					rscount = ps.executeUpdate();
				}
				if (("".equals(updatePassword)) == false) {
					String sql = "update user set password=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updatePassword);
					ps.setString(2, purposeEmail);

					rscount = ps.executeUpdate();
				}
				if (("".equals(updateName)) == false) {
					String sql = "update user set name=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateName);
					ps.setString(2, purposeEmail);

					rscount = ps.executeUpdate();
				}
				if (("".equals(updateTelNum)) == false) {
					String sql = "update user set tel_num=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateTelNum);
					ps.setString(2, purposeEmail);

					rscount = ps.executeUpdate();
				}
				if (("".equals(updatePostalCode)) == false) {
					String sql = "update user set postal_code=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updatePostalCode);
					ps.setString(2, purposeEmail);

					rscount = ps.executeUpdate();
				}
				if (("".equals(updateAddress)) == false) {
					String sql = "update user set Address=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateAddress);
					ps.setString(2, purposeEmail);

					rscount = ps.executeUpdate();
				}

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
		} // finally
		return rscount;
	}// update

}
