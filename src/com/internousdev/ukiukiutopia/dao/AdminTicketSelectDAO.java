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

/**
 * @author internous
 *
 */
public class AdminTicketSelectDAO {

	Connection con;
	boolean action;

	public List<AdminTicketSelectDTO> ticketList = new ArrayList<AdminTicketSelectDTO>();

//検索するメソッド
	public boolean select()throws Exception{
		System.out.println("select - メソッド実行");
		action=false;
		con = DBConnector.getConnection();

		try{
		String sql = "select * from user";

		PreparedStatement ps2;
		ps2 = con.prepareStatement(sql);

		System.out.println("select - ps2 - "+ ps2);

		ResultSet rs = ps2.executeQuery();
		System.out.println("select - sql実行");

		while(rs.next()){
			action = true;

			AdminTicketSelectDTO dto =new AdminTicketSelectDTO();
			dto.setId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setPrice(rs.getFloat(3));
			dto.setTickettype(rs.getString(4));
			dto.setIssale(rs.getBoolean(5));
			dto.setRenewdate(rs.getString(8));
	
			


			ticketList.add(dto);
		}//while

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}//finally

		return action;

	}//select
	public List<AdminTicketSelectDTO> getTicketList(){
		return ticketList;
	}
	

}

