package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.dto.PersonalInformationDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;



public class PersonalTel_numberDAO {

	Connection con;
	boolean action;


	public List<PersonalInformationDTO> itemList1 = new ArrayList<PersonalInformationDTO>();

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

			PersonalInformationDTO dto =new PersonalInformationDTO();
			dto.setId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setTel_num(rs.getString(3));
			dto.setEmail(rs.getString(4));
			dto.setPostal(rs.getString(5));
			dto.setAddress(rs.getString(6));

			itemList1.add(dto);
			System.out.println("select - itemList - OK");
		}//while

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}//finally
		System.out.println("select - return - "+ action);
		return action;

	}//select


//アップデートするメソッド
	public int update(int updateid, String updatetel_number)throws Exception{
		System.out.println("update - メソッド実行");
		con = DBConnector.getConnection();
		int rscount=0;
		try{
		String sql = "update user set tel_number=? where id=?";

		PreparedStatement ps2;

		ps2=con.prepareStatement(sql);
		ps2.setString(1, updatetel_number);
		ps2.setInt(2, updateid);

		System.out.println("update - ps2 -"+ ps2);

		rscount = ps2.executeUpdate();

		System.out.println("update - rsCount - 実行");
		if(rscount > 0){
		System.out.println("update - rsCount - Update OK");
		}//if


	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}//finally
		System.out.println("update - return -" + rscount);
		return rscount;
	}//update




}//class

