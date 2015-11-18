package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
 * 購入可能なチケットの情報をリストに格納する為のクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 *
 */
public class TicketDataDAO {

	private Connection con;
	private boolean action;

	private List<TicketDataDTO> useTicketList = new ArrayList<TicketDataDTO>();
	private List<TicketDataDTO> optionTicketList = new ArrayList<TicketDataDTO>();

	/**
	 * @return
	 * @throws Exception
	 */
	public boolean setTicketList() throws Exception {
		System.out.println("select - メソッド実行");
		action = false;
		con = DBConnector.getConnection();

		DB db = MongoDBConnector.getConnection();
		DBCollection coll = db.getCollection("ticket_detail");

		try {
			String sql = "select * from ticket where is_sale=true and ticket_type='use'";

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
			
				useTicketList.add(dto);

				System.out.println("select - useList - OK");
				
			} // while
			
			
			String sql2 = "select * from ticket where is_sale=true and ticket_type='option'";

			PreparedStatement ps2;
			ps2 = con.prepareStatement(sql2);

			System.out.println("select - ps2 - " + ps2);

			ResultSet rs2 = ps2.executeQuery();
			System.out.println("select - sql2実行");
			
			while (rs2.next()) {
				action = true;
				TicketDataDTO dto = new TicketDataDTO();
				BasicDBObject query = new BasicDBObject("ticket_id", rs2.getInt(1));
				DBCursor cursor = coll.find(query);
				DBObject doc = cursor.next();

				dto.setId(rs2.getInt(1));
				dto.setName(rs2.getString(2));
				dto.setPrice(rs2.getInt(3));
				dto.setType(rs2.getString(4));
				dto.setInfo((String) doc.get("ticket_info"));
				
				optionTicketList.add(dto);

				System.out.println("select - optionList - OK");
				
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
