package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.dto.PersonalInformationDTO;
import com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;

   /**
    * 個人情報と購入履歴を検索して取得するクラス
    * @author K.Kato
    * @version 1.1
    * @since 1.0
    */
public class PersonalInformationDAO {
    
	/**
	 * データベース接続
	 */
	Connection con;
	
	/**
	 * 結果の表示
	 */
	boolean result;
    
	/**
	 * 個人情報のインスタンス化
	 */
	private PersonalInformationDTO personal = new PersonalInformationDTO();
	
	/**
	 * 購入履歴のインスタンス化
	 */
	private List<PurchaseHistoryDTO> historylList = new ArrayList<PurchaseHistoryDTO>();

	/**
	 * 個人情報を検索するメソッド
	 * @param emailaddress
	 * @return 処理が行われたか否か
	 * @throws Exception
	 */
	public boolean select(String emailaddress) throws Exception {
		result = false;
		con = DBConnector.getConnection();

		try {
			String sql = "select id,name,tel_num,email,postal_code,address from user where email = ?";

			PreparedStatement ps2;
			ps2 = con.prepareStatement(sql);
			ps2.setString(1, emailaddress);
			ResultSet rs = ps2.executeQuery();
			if (rs.next()) {
				result = true;

				personal.setId(rs.getInt(1));
				personal.setName(rs.getString(2));
				personal.setTelNum(rs.getString(3));
				personal.setEmail(rs.getString(4));
				personal.setPostalCode(rs.getString(5));
				personal.setAddress(rs.getString(6));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} 
		return result;
		
	}

	
	/**
	 * 購入履歴を検索するメソッド
	 * @param userId
	 * @return 処理が行われたか否か
	 * @throws Exception
	 */
	public boolean selectHistory(int userId) throws Exception {
		
		result = false;
		con = DBConnector.getConnection();

		try {
			String sql = "SELECT "
							+ "t.name, "
							+ "t.price, "
							+ "ot.sheets, "
					        + "ot.total_amount "
					   + "FROM user u "
					        + "LEFT OUTER JOIN `order` o ON u.id = o.user_id "
					        + "LEFT OUTER JOIN order_ticket ot ON o.id = ot.order_id "
					        + "LEFT OUTER JOIN ticket t ON ot.ticket_id = t.id "
					   + "WHERE u.id = ? order by o.id desc limit 5";

			PreparedStatement ps2;
			ps2 = con.prepareStatement(sql);
			ps2.setInt(1, userId);
			ResultSet rs = ps2.executeQuery();
			while (rs.next()) {
				result = true;

				PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
				
				dto.setTotalAmount(rs.getFloat(4));
				dto.setName(rs.getString(1));
				dto.setSheets(rs.getInt(3));
				dto.setPrice(rs.getFloat(2));

				historylList.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;
	}
	
	/**
	 * 個人情報を格納するメソッド
	 * @return 個人情報
	 */
	public PersonalInformationDTO getPersonal() {
		return personal;
	}
    
	/**
	 * 個人情報を設定するメソッド
	 * @param personal 個人情報
	 */
	public void setPersonal(PersonalInformationDTO personal) {
		this.personal = personal;
	}
    /**
     * 購入履歴を格納するメソッド
     * @return 購入履歴
     */
	public List<PurchaseHistoryDTO> getHistorylList() {
		return historylList;
	}
	

}
