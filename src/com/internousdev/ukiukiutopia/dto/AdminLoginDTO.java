package com.internousdev.ukiukiutopia.dto;

/**
 * DBからログインしようとしているユーザーの情報を取得、格納する為のクラス
 * 
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminLoginDTO {

	/***
	 * 管理者のID
	 */
	private int id;
	/***
	 * 管理者のユーザー名
	 */
	private String name;

	/**
	 * ユーザー名取得メソッド
	 * 
	 * @return name ユーザー名
	 */
	public String getName() {
		return name;
	}

	/**
	 * ユーザー名格納メソッド
	 * 
	 * @param name ユーザー名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 管理者ID取得メソッド
	 * 
	 * @return id 管理者ID
	 */
	public int getId() {
		return id;
	}
	/**
	 * 管理者ID格納メソッド
	 * 
	 * @param id 管理者ID
	 */
	public void setId(int id) {
		this.id = id;
	}
}
