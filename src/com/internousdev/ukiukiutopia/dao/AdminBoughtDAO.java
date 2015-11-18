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
	boolean action;
	/***
	 * DBから取得した購入情報を格納するリスト
	 */
	public List<AdminBoughtDTO> boughtList = new ArrayList<AdminBoughtDTO>();

	/**
	 * 購入情報を検索するメソッド
	 * @param selectDate1 
	 * @param selectDate2 
	 * @param dto 
	 * @return true
	 * @throws Exception 
	 */
	public boolean select(String selectDate1,String selectDate2,AdminBoughtDTO dto)throws Exception{

		action=false;
		con = DBConnector.getConnection();

		try{
		String sql = "select * from order_ticket where registered_date between ? and ?";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setString(1, selectDate1);
		ps.setString(2, selectDate2);

		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			action = true;

			dto.setOrderId(rs.getInt(1));
			dto.setTicketId(rs.getInt(2));
			dto.setSheets(rs.getInt(3));
			dto.setTotalAmount(rs.getFloat(4));
			
			boughtList.add(dto);
		}//while

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}//finally

		return action;

	}//select
	
	/**
	 * チケットの購入情報を取得するメソッド
	 * @return boughtList
	 */
	public List<AdminBoughtDTO> getBoughtList(){
		return boughtList;
	}
	

}
