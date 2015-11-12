package com.internousdev.ukiukiutopia.dao;
/**
 * 
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;



/**
 * @author internous
 *
 */
public class AdminUserSelectDAO {
	Connection con;
	boolean action;

	public List<AdminUserSelectDTO> userList = new ArrayList<AdminUserSelectDTO>();

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

			AdminUserSelectDTO dto =new AdminUserSelectDTO();
			dto.setEmail(rs.getString(2));
			dto.setPassword(rs.getString(3));
			dto.setName(rs.getString(4));
			dto.setTelNum(rs.getString(5));
			dto.setPostalCode(rs.getString(6));
			dto.setAddress(rs.getString(7));
			dto.setRenewDate(rs.getString(8));
	
			


			userList.add(dto);
		}//while

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}//finally

		return action;

	}//select
	public List<AdminUserSelectDTO> getUserList(){
		return userList;
	}
	

}
