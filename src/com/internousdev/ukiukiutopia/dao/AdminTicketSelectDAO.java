/**
 * 
 */
package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;
import com.internousdev.ukiukiutopia.util.MongoDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 * DBから全チケット情報の取得を実行する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminTicketSelectDAO {
	/***
	 * DBと接続
	 */
	Connection con;
	/***
	 * 実行結果
	 */
	boolean result=false;
	/***
	 * DBから取得した全チケット情報を格納するリスト
	 */
	public List<AdminTicketSelectDTO> ticketList = new ArrayList<AdminTicketSelectDTO>();

	/**
	 * 全チケット情報を検索するメソッド
	 * @return true
	 * @throws Exception 
	 */
	public boolean select() throws Exception {
		// MySQLと接続
		con = DBConnector.getConnection();

		// MongoDBと接続
		DB db = MongoDBConnector.getConnection();
		// Mongoのコレクションを指定して取得
		DBCollection coll = db.getCollection("ticket_detail");

		try {
			
			//mysql
			String sql = "select * from ticket where is_show=true";

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				AdminTicketSelectDTO dto = new AdminTicketSelectDTO();
				
				//mongodb
				BasicDBObject query = new BasicDBObject("ticket_id", rs.getInt(1));
				DBCursor cursor = coll.find(query);
				DBObject doc = cursor.next();
				
				dto.setId(rs.getInt(1));
				dto.setName(rs.getString(2));
				dto.setPrice(rs.getFloat(3));
				dto.setTicketType(rs.getString(4));
				dto.setIsSale(rs.getBoolean(5));
				dto.setRenewDate(rs.getString(8));
				dto.setTicketInfo((String) doc.get("ticket_info"));

				ticketList.add(dto); 
				
				result = true;
		}// while
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
//			cursor.close();
		} // finally

		return result;
	}// select

	/**
	 * 全チケット情報を取得するメソッド
	 * @return boughtList
	 */
	public List<AdminTicketSelectDTO> getTicketList() {
		return ticketList;
	}


}