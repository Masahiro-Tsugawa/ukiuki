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

	/**
	 * @param updateid
	 * @param updatename
	 * @param updateprice
	 * @param updatetickettype
	 * @param updateissale
	 * @param updaterenewdate
	 * @return
	 * @throws Exception
	 */
	public int update(int updateId,String updateName,float updatePrice,String updateTicketType,boolean updateIsSale,String updateRenewDate)
					throws Exception {

		con = DBConnector.getConnection();

		try {
			if (updateId > 0) {

			 if (updateName != null) {
					String sql = "update ticket set name=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateName);
					ps.setInt(2, updateId);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
				}
			 if(updatePrice >0){
				 String sql = "update user set price=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setFloat(1, updatePrice);
					ps.setInt(2, updateId);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(updateTicketType != null){
				 String sql = "update user set ticket_type=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateTicketType);
					ps.setInt(2, updateId);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(updateIsSale != false){
				 String sql = "update user set is_sale=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setBoolean(1, updateIsSale);
					ps.setInt(2, updateId);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 
			 
				 String sql = "update user set renew_date=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateRenewDate);
					ps.setInt(2, updateId);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 
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

