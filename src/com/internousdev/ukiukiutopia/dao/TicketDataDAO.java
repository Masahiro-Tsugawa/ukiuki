package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.internousdev.ukiukiutopia.dto.TicketDataDTO;
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
public class TicketDataDAO {

	Connection con;
	boolean action;

	/**
	 * 
	 */
	public List<TicketDataDTO> useTicketList = new ArrayList<TicketDataDTO>();
	public List<TicketDataDTO> optionTicketList = new ArrayList<TicketDataDTO>();

	/**
	 * @return
	 * @throws Exception
	 */
	public boolean select(int sheets,int subTotal) throws Exception {
		System.out.println("select - メソッド実行");
		action = false;
		con = DBConnector.getConnection();

		DB db = MongoDBConnector.getConnection();
		DBCollection coll = db.getCollection("ticket_detail");

		try {
			String sql = "select * from ticket where is_sale=true";

			PreparedStatement ps;
			ps = con.prepareStatement(sql);

			System.out.println("select - ps - " + ps);

			ResultSet rs = ps.executeQuery();
			System.out.println("select - sql実行");

			while (rs.next()) {
				action = true;
				TicketDataDTO dto = new TicketDataDTO();
				BasicDBObject query = new BasicDBObject("ticket_id", rs.getInt(1));
				DBCursor cursor = coll.find(query);
				DBObject doc = cursor.next();

				dto.setId(rs.getInt(1));
				dto.setName(rs.getString(2));
				dto.setPrice(rs.getInt(3));
				dto.setType(rs.getString(4));
				dto.setInfo((String) doc.get("ticket_info"));
				
				dto.setSheets(sheets);
				dto.setSubTotal(subTotal);
				
				useTicketList.add(dto);

				System.out.println("select - itemList - OK");
			} // while

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} // finally
		System.out.println("select - return - " + action);
		return action;

	}// select

	/**
	 * @return
	 */
	public List<TicketDataDTO> getUseTicketList() {
		return useTicketList;
	}

	public List<TicketDataDTO> getOptionTicketList() {

		return optionTicketList;
	}

}
