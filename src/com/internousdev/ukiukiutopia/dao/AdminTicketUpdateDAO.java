/**
 * 
 */
package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ukiukiutopia.util.DBConnector;
import com.internousdev.ukiukiutopia.util.MongoDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
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
	public int update(int updateId,String updateName,float updatePrice,String updateTicketType,boolean updateIsSale,String updateRenewDate,String updateTicketInfo)
					throws Exception {

		con = DBConnector.getConnection();

		try {
			if (updateId > 0) {

			 if (("".equals(updateName) == false)) {
					String sql = "update ticket set name=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateName);
					ps.setInt(2, updateId);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
				}
			 if(("".equals(updatePrice) == false)){
				 String sql = "update ticket set price=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setFloat(1, updatePrice);
					ps.setInt(2, updateId);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(("".equals(updateTicketType) == false)){
				 String sql = "update ticket set ticket_type=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateTicketType);
					ps.setInt(2, updateId);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(("".equals(updateIsSale) == false)){
				 String sql = "update ticket set is_sale=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setBoolean(1, updateIsSale);
					ps.setInt(2, updateId);

					System.out.println("update - ps -" + ps);

					rscount = ps.executeUpdate();
			 }
			 if(("".equals(updateTicketInfo) == false)){
			 
				DB db = MongoDBConnector.getConnection();
			    DBCollection coll = db.getCollection("ticket_detail");
			    BasicDBObject base = new BasicDBObject("ticket_id", updateId);
				base.put("ticket_detail", updateTicketInfo);
			 
			 }
			 
				 String sql = "update ticket set renew_date=? where id=?";
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

