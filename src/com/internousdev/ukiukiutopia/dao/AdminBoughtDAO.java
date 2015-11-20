/**
 * 
 */
package com.internousdev.ukiukiutopia.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.dto.AdminBoughtDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * DBから購入されたチケット情報の取得を実行する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminBoughtDAO {
	/***
	 * DBと接続
	 */
	Connection con;
	/***
	 * 実行結果
	 */
	boolean result = false;
	/***
	 * DBから取得した購入情報を格納するリスト
	 */
	public List<AdminBoughtDTO> boughtList = new ArrayList<AdminBoughtDTO>();

	/**
	 * 購入情報を検索するメソッド
	 * @param startDate 
	 * @param endDate 
	 * @param dto 
	 * @return result true:DBから購入情報取得成功
	 * @throws Exception 
	 */
	public boolean select(String startDate,String endDate,AdminBoughtDTO dto)throws Exception{

		con = DBConnector.getConnection();

		try{
		String sql = "select order_id,ticket_id,sheets,total_amount,registered_date from order_ticket where registered_date between ? and ?";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setString(1, startDate);
		ps.setString(2, endDate);

		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			result = true;

			dto.setOrderId(rs.getInt(1));
			dto.setTicketId(rs.getInt(2));
			dto.setSheets(rs.getInt(3));
			dto.setTotalAmount(rs.getFloat(4));
			
			boughtList.add(dto);
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}
		return result;
	}
	
	/**
	 * チケットの購入情報を取得するメソッド
	 * @return boughtList
	 */
	public List<AdminBoughtDTO> getBoughtList(){
		return boughtList;
	}
	

}
