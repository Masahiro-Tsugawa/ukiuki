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

	public int update(String purposeEmail, String updateemail, String updatepassword, String updatename,
			String updatetelnum, String updatepostalcode, String updateaddress, String updaterenewdate)
					throws Exception {

		con = DBConnector.getConnection();

		try {
			if (purposeEmail != null) {

			 if (updateemail != null) {
					String sql = "update user set email=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateemail);
					ps.setString(2, purposeEmail);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
				}
			 if(updatepassword != null){
				 String sql = "update user set password=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updatepassword);
					ps.setString(2, purposeEmail);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(updatename != null){
				 String sql = "update user set name=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updatename);
					ps.setString(2, purposeEmail);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(updatetelnum != null){
				 String sql = "update user set tel_num=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updatetelnum);
					ps.setString(2, purposeEmail);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(updatepostalcode != null){
				 String sql = "update user set postal_code=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updatepostalcode);
					ps.setString(2, purposeEmail);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(updateaddress != null){
				 String sql = "update user set address=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateaddress);
					ps.setString(2, purposeEmail);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(updaterenewdate != null){
				 String sql = "update user set renew_date=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updaterenewdate);
					ps.setString(2, purposeEmail);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 
			}
			if(rscount > 0){
				System.out.println("update - rsCount - Update OK");
				}//if rs
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} // finally
		System.out.println("update - return -" + rscount);
		return rscount;
	}// update
}
