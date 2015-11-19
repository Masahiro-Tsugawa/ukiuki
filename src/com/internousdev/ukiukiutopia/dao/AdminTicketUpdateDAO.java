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
 * DBのチケット情報の変更を実行する為のクラス
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
	 * @param updateId
	 * @param updateName
	 * @param updateTicketType
	 * @param updateIsSale
	 * @param updateRenewDate
	 * @param updateTicketInfo
	 * @return rscount 実行成功回数
	 * @throws Exception
	 */
	public int updateName(int updateId, String updateName) throws Exception {

		con = DBConnector.getConnection();

		try {
			if (updateId > 0) {

				if (("".equals(updateName) == false)) {
					String sql = "update ticket set name=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateName);
					ps.setInt(2, updateId);

					rscount = ps.executeUpdate();
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
	 * 値段を変更するメソッド
	 * 
	 * @param updateId
	 * @param updatePrice
	 * @return rscount 実行成功回数
	 * @throws Exception
	 */
	public int updatePrice(int updateId, float updatePrice) throws Exception {

		con = DBConnector.getConnection();

		try {
			if (updateId > 0) {

				if (("".equals(updatePrice) == false)) {
					if (updatePrice > 0) {
						String sql = "update ticket set price=? where id=?";
						PreparedStatement ps;

						ps = con.prepareStatement(sql);
						ps.setFloat(1, updatePrice);
						ps.setInt(2, updateId);

						rscount = ps.executeUpdate();
					}
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
	 * @param updateId
	 * @param updateTicketType
	 * @return rscount 実行成功回数
	 * @throws Exception
	 */
	public int updateTicketType(int updateId, String updateTicketType) throws Exception {

		con = DBConnector.getConnection();

		try {
			if (updateId > 0) {

				if (("".equals(updateTicketType) == false)) {
					String sql = "update ticket set ticket_type=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateTicketType);
					ps.setInt(2, updateId);

					rscount = ps.executeUpdate();
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
	 * @param updateId
	 * @param updateIsSale
	 * @return rscount 実行成功回数
	 * @throws Exception
	 */
	public int updateIsSale(int updateId, boolean updateIsSale) throws Exception {

		con = DBConnector.getConnection();

		try {
			if (updateId > 0) {

				if (("".equals(updateIsSale) == false)) {
					String sql = "update ticket set is_sale=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setBoolean(1, updateIsSale);
					ps.setInt(2, updateId);

					rscount = ps.executeUpdate();
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
	 * @param updateId
	 * @param updateTicketInfo
	 * @return rscount 実行成功回数
	 * @throws Exception
	 */
	public int updateTicketInfo(int updateId, String updateTicketInfo) throws Exception {
		try {
			if (updateId > 0) {

				if (("".equals(updateTicketInfo) == false)) {

					DB db = MongoDBConnector.getConnection();
					DBCollection coll = db.getCollection("ticket_detail");
					BasicDBObject base = new BasicDBObject("ticket_id", updateId);
					base.put("ticket_detail", updateTicketInfo);

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
	 * @param updateId
	 * @param updateRenewDate
	 * @return rscount 実行成功回数
	 * @throws Exception
	 */
	public int updateRenewDate(int updateId, String updateRenewDate) throws Exception {

		con = DBConnector.getConnection();

		try {
			if (updateId > 0) {

				if (("".equals(updateRenewDate) == false)) {

					String sql = "update ticket set renew_date=? where id=?";
					PreparedStatement ps;

					ps = con.prepareStatement(sql);
					ps.setString(1, updateRenewDate);
					ps.setInt(2, updateId);

					rscount = ps.executeUpdate();

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} // finally
		return rscount;
	}
}
