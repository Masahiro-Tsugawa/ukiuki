/**
 * 
 */
package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ukiukiutopia.util.DBConnector;
/**
 * @author internous
 *
 */
public class AdminTicketUpdateDAO {

	Connection con;
	int rscount = 0;

	public int update(int updateid,String updatename,float updateprice,String updatetickettype,boolean updateissale,String updaterenewdate)
					throws Exception {

		con = DBConnector.getConnection();

		try {
			if (updateid > 0) {

			 if (updatename != null) {
					String sql = "update user set name=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updatename);
					ps.setInt(2, updateid);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
				}
			 if(updateprice >0){
				 String sql = "update user set price=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setFloat(1, updateprice);
					ps.setInt(2, updateid);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(updatetickettype != null){
				 String sql = "update user set ticket_type=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updatetickettype);
					ps.setInt(2, updateid);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(updateissale){
				 String sql = "update user set is_sale=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setBoolean(1, updateissale);
					ps.setInt(2, updateid);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(updaterenewdate != null){
				 String sql = "update user set renew_date=? where email=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updaterenewdate);
					ps.setInt(2, updateid);

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

