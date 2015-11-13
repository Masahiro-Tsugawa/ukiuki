package com.internousdev.ukiukiutopia.dao;
/**
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * @author internous
 *
 */
public class AdminUserUpdateDAO {

	Connection con;
	int rscount = 0;

	/**
	 * @param purposeEmail
	 * @param updateEmail
	 * @param updatePassword
	 * @param updateName
	 * @param updateTelNum
	 * @param updatePostalCode
	 * @param updateAddress
	 * @param updateRenewDate
	 * @return
	 * @throws Exception
	 */
	public int update(String purposeEmail, String updateEmail, String updatePassword, String updateName,
			String updateTelNum, String updatePostalCode, String updateAddress, String updateRenewDate)
					throws Exception {

		con = DBConnector.getConnection();

		try {

			if (purposeEmail != null) {

				System.out.println("updatePassword" + updatePassword);

				if (updateEmail != " ") {
					String sql = "update user set email=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateEmail);
					ps.setString(2, purposeEmail);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
				}
				if (updatePassword != null) {
					String sql = "update user set password=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updatePassword);
					ps.setString(2, purposeEmail);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
				}
//				if (updateName != null) {
//					String sql = "update user set name=? where email=?";
//					PreparedStatement ps;
//
//					ps = con.prepareStatement(sql);
//					ps.setString(1, updateName);
//					ps.setString(2, purposeEmail);
//
//					System.out.println("update - ps -" + ps);
//
//					rscount = ps.executeUpdate();
//				}
//				if (updateTelNum != null) {
//					String sql = "update user set tel_num=? where email=?";
//					PreparedStatement ps;
//
//					ps = con.prepareStatement(sql);
//					ps.setString(1, updateTelNum);
//					ps.setString(2, purposeEmail);
//
//					System.out.println("update - ps -" + ps);
//
//					rscount = ps.executeUpdate();
//				}
//				if (updatePostalCode != null) {
//					String sql = "update user set postal_code=? where email=?";
//					PreparedStatement ps;
//
//					ps = con.prepareStatement(sql);
//					ps.setString(1, updatePostalCode);
//					ps.setString(2, purposeEmail);
//
//					System.out.println("update - ps -" + ps);
//
//					rscount = ps.executeUpdate();
//				}
//				if (updateAddress != null) {
//					String sql = "update user set Address=? where email=?";
//					PreparedStatement ps;
//
//					ps = con.prepareStatement(sql);
//					ps.setString(1, updateAddress);
//					ps.setString(2, purposeEmail);
//
//					System.out.println("update - ps -" + ps);
//
//					rscount = ps.executeUpdate();
//				}

				String sql = "update user set renew_date=? where email=?";
				PreparedStatement ps;

				ps = con.prepareStatement(sql);
				ps.setString(1, updateRenewDate);
				ps.setString(2, purposeEmail);

				System.out.println("update - ps -" + ps);

				rscount = ps.executeUpdate();

			}
			if (rscount > 0) {
				System.out.println("update - rsCount - Update OK");
			} // if rs

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} // finally
		System.out.println("update - return -" + rscount);
		return rscount;
	}// update

}
