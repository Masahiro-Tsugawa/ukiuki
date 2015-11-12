package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.internousdev.ukiukiutopia.dto.PersonalInformationDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;



public class PersonalInformationDAO {

	Connection con;
	boolean action;


	public List<PersonalInformationDTO>PersonalList  = new ArrayList<PersonalInformationDTO>();

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

			PersonalList.add(dto);
			System.out.println("select - itemList - OK");
		}//while

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}//finally
		System.out.println("select - return - "+ action);
		return action;
	}

	public Collection<? extends PersonalInformationDTO> getPersonalList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	}//select