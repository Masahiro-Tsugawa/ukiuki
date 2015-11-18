package com.internousdev.ukiukiutopia.util;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * MongoDBのsports_gymというデータベースに接続する為のクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 */
public class MongoDBConnector {

	/**
     * 指定したデータベースへの接続情報を取得するメソッド
     * @return db 指定したデータベースへの接続情報
     */
	public static DB getConnection() {
		DB db = null;
		try {
			MongoClient client = new MongoClient("localhost", 27017);
			db = client.getDB("sports_gym");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return db;
	}
}