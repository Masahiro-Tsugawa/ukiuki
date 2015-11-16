package com.internousdev.ukiukiutopia.mongosetup;

import com.internousdev.ukiukiutopia.util.MongoDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

public class MongoSetUp {

	public static void main(String[] args) {
		
		try {
			DB db = MongoDBConnector.getConnection();
			DBCollection coll = db.getCollection("ticket_detail");
			coll.drop();

			BasicDBObject doc;
			doc = new BasicDBObject("ticket_id", 1)
					.append("ticket_info", "testtesttest");
			coll.insert(doc);
			doc = new BasicDBObject("ticket_id", 2)
					.append("ticket_info", "フルセットチケット");
			coll.insert(doc);
			doc = new BasicDBObject("ticket_id", 3)
				 	.append("ticket_info", "マシンチケット");
			coll.insert(doc);
			doc = new BasicDBObject("ticket_id", 4)
					.append("ticket_info", "プールチケット");
			coll.insert(doc);
			doc = new BasicDBObject("ticket_id", 5)
					.append("ticket_info", "風呂チケット");
			coll.insert(doc);
			doc = new BasicDBObject("ticket_id", 6)
					.append("ticket_info", "レンタルチケット");
			coll.insert(doc);
			doc = new BasicDBObject("ticket_id", 7)
					.append("ticket_info", "パーソナルトレーナーチケット");
			coll.insert(doc);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			

	}

}
