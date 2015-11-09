package com.internousdev.ukiukiutopia.util;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoDBConnector {

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