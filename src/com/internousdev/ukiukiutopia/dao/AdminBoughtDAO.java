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
 * @author internous
 *
 */
public class AdminBoughtDAO {
	Connection con;
	boolean action;

	public List<AdminBoughtDTO> boughtList = new ArrayList<AdminBoughtDTO>();

//検索するメソッド
	public boolean select(String selectdate1,String selectdate2,AdminBoughtDTO dto)throws Exception{
		System.out.println("select - メソッド実行");
		action=false;
		con = DBConnector.getConnection();

		try{
		String sql = "select * from order_ticket";

		PreparedStatement ps2;
		ps2 = con.prepareStatement(sql);

		System.out.println("select - ps2 - "+ ps2);

		ResultSet rs = ps2.executeQuery();
		System.out.println("select - sql実行");

		while(rs.next()){
			action = true;

			dto.setOrderid(rs.getInt(1));
			dto.setTicketid(rs.getInt(2));
			dto.setSheets(rs.getInt(3));
			dto.setTotalamount(rs.getFloat(4));
			dto.setRegistereddate(rs.getString(5));
	
			


			boughtList.add(dto);
		}//while

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}//finally

		return action;

	}//select
	public List<AdminBoughtDTO> getBoughtList(){
		return boughtList;
	}
	

}
