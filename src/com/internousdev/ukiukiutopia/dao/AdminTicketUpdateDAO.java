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

/**
 * DBのチケット情報の変更を実行する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminTicketUpdateDAO {
	/***
	 * DBと接続
	 */
	Connection con;
	/***
	 * 実行して成功した回数
	 */
	int rscount = 0;

	/**
	 * チケット名を変更するメソッド
	 * 
	 * @param id
	 * @param name
	 * @return 編集の可否
	 * @throws Exception
	 */
	public int updateName(int id, String name) throws Exception {

		con = DBConnector.getConnection();

		try {
			if (id > 0) {

				if (("".equals(name) == false)) {
					String sql = "update ticket set name=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, name);
					ps.setInt(2, id);

					rscount = ps.executeUpdate();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return rscount;
	}

	/**
	 * 値段を変更するメソッド
	 * 
	 * @param id
	 * @param price
	 * @return 編集の可否
	 * @throws Exception
	 */
	public int updatePrice(int id, float price) throws Exception {

		con = DBConnector.getConnection();

		try {
			if (id > 0) {
				if (price > 0) {
					String sql = "update ticket set price=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setFloat(1, price);
					ps.setInt(2, id);

					rscount = ps.executeUpdate();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return rscount;
	}

	/**
	 * チケット種類を変更するメソッド
	 * 
	 * @param id
	 * @param ticketType
	 * @return 編集の可否
	 * @throws Exception
	 */
	public int updateTicketType(int id, String ticketType) throws Exception {

		con = DBConnector.getConnection();

		try {
			if (id > 0) {

				if (("".equals(ticketType) == false)) {
					String sql = "update ticket set ticket_type=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, ticketType);
					ps.setInt(2, id);

					rscount = ps.executeUpdate();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return rscount;
	}

	/**
	 * チケット種類を変更するメソッド
	 * 
	 * @param id
	 * @param isSale
	 * @return 編集の可否
	 * @throws Exception
	 */
	public int updateIsSale(int id, boolean isSale) throws Exception {

		con = DBConnector.getConnection();

		try {
			if (id > 0) {
				String sql = "update ticket set is_sale=? where id=?";
				PreparedStatement ps;

				ps = con.prepareStatement(sql);
				ps.setBoolean(1, isSale);
				ps.setInt(2, id);

				rscount = ps.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return rscount;
	}

	/**
	 * チケット種類を変更するメソッド
	 * 
	 * @param id
	 * @param ticketInformation
	 * @return 編集の可否
	 * @throws Exception
	 */
	public int updateTicketInformation(int id, String ticketInformation) throws Exception {
		try {
			if (id > 0) {

				if (("".equals(ticketInformation) == false)) {

					DB db = MongoDBConnector.getConnection();
					DBCollection coll = db.getCollection("ticket_detail");
					BasicDBObject serch = new BasicDBObject().append("ticket_id", id);
					BasicDBObject update = new BasicDBObject();
					update.append("$set", new BasicDBObject().append("ticket_info", ticketInformation));
					coll.update(serch, update);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} // finally
		return rscount;
	}

	/**
	 * チケット種類を変更するメソッド
	 * 
	 * @param id
	 * @param renewDate
	 * @return 編集の可否
	 * @throws Exception
	 */
	public int updateRenewDate(int id, String renewDate) throws Exception {

		con = DBConnector.getConnection();

		try {
			if (id > 0) {

				if (("".equals(renewDate) == false)) {

					String sql = "update ticket set renew_date=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, renewDate);
					ps.setInt(2, id);

					rscount = ps.executeUpdate();

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return rscount;
	}
}
