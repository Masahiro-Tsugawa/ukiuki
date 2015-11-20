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

	/**
	 * 購入可能な施設利用チケットのリスト
	 */
	private List<TicketDataDTO> useTicketList = new ArrayList<TicketDataDTO>();
	/**
	 * 購入可能なオプションチケットのリスト
	 */
	private List<TicketDataDTO> optionTicketList = new ArrayList<TicketDataDTO>();

	/**
	 * 購入可能なチケットのリストを作成する為のメソッド
	 * @return　result 購入可能なチケットのリストを作成できたか否か
	 * @throws Exception
	 */
	public boolean createTicketList() throws Exception {
		boolean result = false;
		Connection con = DBConnector.getConnection();

		DB db = MongoDBConnector.getConnection();
		DBCollection coll = db.getCollection("ticket_detail");

		try {
			String sql = "select id,name,price,ticket_type from ticket where is_sale=true and ticket_type='use'";

			PreparedStatement ps;
			ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				result = true;
				TicketDataDTO dto = new TicketDataDTO();
				BasicDBObject query = new BasicDBObject("ticket_id", rs.getInt("id"));
				DBCursor cursor = coll.find(query);
				DBObject doc = cursor.next();

				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				dto.setType(rs.getString("ticket_type"));
				dto.setInfo((String) doc.get("ticket_info"));
			
				useTicketList.add(dto);			
			}	
			
			String sql2 = "select id,name,price,ticket_type from ticket where is_sale=true and ticket_type='option'";

			PreparedStatement ps2;
			ps2 = con.prepareStatement(sql2);

			ResultSet rs2 = ps2.executeQuery();
			
			while (rs2.next()) {
				result = true;
				TicketDataDTO dto = new TicketDataDTO();
				BasicDBObject query = new BasicDBObject("ticket_id", rs2.getInt("id"));
				DBCursor cursor = coll.find(query);
				DBObject doc = cursor.next();

				dto.setId(rs2.getInt("id"));
				dto.setName(rs2.getString("name"));
				dto.setPrice(rs2.getInt("price"));
				dto.setType(rs2.getString("ticket_type"));
				dto.setInfo((String) doc.get("ticket_info"));
				
				optionTicketList.add(dto);		
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;

	}

	/**
	 * 購入可能な施設利用チケットのリスト取得メソッド
	 * @return　useTicketList　購入可能な施設利用チケットのリスト
	 */
	public List<TicketDataDTO> getUseTicketList() {
		return useTicketList;
	}
	
	/**
	 * 購入可能なオプションチケットのリスト取得メソッド
	 * @return　optionTicketList　購入可能なオプションチケットのリスト
	 */
	public List<TicketDataDTO> getOptionTicketList() {
		return optionTicketList;
	}

}
