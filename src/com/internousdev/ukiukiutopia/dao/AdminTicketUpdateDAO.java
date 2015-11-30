/**
 * 
 */
package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;
import com.internousdev.ukiukiutopia.util.MongoDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;


/**
 * DBのチケット情報の変更を実行する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminTicketUpdateDAO {
	
	/**
	 * チケットを編集する前にIsShowがtrueになっているか確認するメソッド
	 * @param id チケットID
	 * @return result IsShowの真偽
	 */
	public boolean selectIsShow(int id){
		boolean result = false;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "select is_show from ticket where id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				AdminTicketSelectDTO dto = new AdminTicketSelectDTO();

				dto.setIsShow(rs.getBoolean(1));
				result = dto.getIsShow();
					
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * チケット名を変更するメソッド
	 * @param id チケットID
	 * @param name チケット名
	 * @return count 編集の可否
	 */
	public int updateName(int id, String name) {

		int count = 0;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "update ticket set name=? where id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, id);

			count = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * 値段を変更するメソッド
	 * @param id チケットID
	 * @param price 値段
	 * @return count 編集の可否
	 */
	public int updatePrice(int id, float price) {

		int count = 0;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "update ticket set price=? where id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setFloat(1, price);
			ps.setInt(2, id);

			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * チケット種類を変更するメソッド
	 * @param id チケットID
	 * @param ticketType チケットの種類
	 * @return count 編集の可否
	 */
	public int updateTicketType(int id, String ticketType) {

		int count = 0;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "update ticket set ticket_type=? where id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ticketType);
			ps.setInt(2, id);

			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * チケット種類を変更するメソッド
	 * @param id チケットID
	 * @param isSale 販売状態
	 * @return count 編集の可否
	 */
	public int updateIsSale(int id, boolean isSale){

		int count = 0;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "update ticket set is_sale=? where id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setBoolean(1, isSale);
			ps.setInt(2, id);

			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * チケット詳細を変更するメソッド
	 * @param id チケットID
	 * @param ticketInformation チケットの詳細
	 * @return count 編集の可否
	 */
	public int updateTicketInformation(int id, String ticketInformation) {

		int count = 0;
		try {
			DB db = MongoDBConnector.getConnection();
			DBCollection coll = db.getCollection("ticket_detail");
			BasicDBObject serch = new BasicDBObject().append("ticket_id", id);
			BasicDBObject update = new BasicDBObject();
			update.append("$set", new BasicDBObject().append("ticket_info", ticketInformation));
			coll.update(serch, update);
			count = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	/**
	 * 更新日を変更するメソッド
	 * @param id チケットID
	 * @param renewDate 更新日
	 * @return count 編集の可否
	 */
	public int updateRenewDate(int id, String renewDate) {

		int count = 0;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "update ticket set renew_date=? where id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, renewDate);
			ps.setInt(2, id);

			count = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
}
