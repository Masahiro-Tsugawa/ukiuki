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
	public boolean select(String selectDate1,String selectDate2,AdminBoughtDTO dto)throws Exception{
		System.out.println("select - メソッド実行");
		System.out.println(selectDate1);
		action=false;
		con = DBConnector.getConnection();

		try{
		String sql = "select * from order_ticket where registered_date between ? and ?";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setString(1, selectDate1);
		ps.setString(2, selectDate2);

		System.out.println("select - ps - "+ ps);

		ResultSet rs = ps.executeQuery();
		System.out.println("select - sql実行");

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
	public List<AdminBoughtDTO> getBoughtList(){
		return boughtList;
	}
	

}
