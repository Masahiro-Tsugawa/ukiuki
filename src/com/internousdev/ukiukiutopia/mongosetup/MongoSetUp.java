package com.internousdev.ukiukiutopia.mongosetup;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * MongoDBにコレクションを作成する為のクラス
 * @author N.Minami
 * @version 1.1
 * @since 1.0
 */
public class MongoSetUp {

	/**
	 * @param args コマンドプロンプトでの初期値設定用のパラメータ
	 */
	public static void main(String[] args) {
		
		try {
			
			MongoClient client = new MongoClient("localhost", 27017);
			DB db = client.getDB("sports_gym");
			DBCollection coll = db.getCollection("ticket_detail");
			coll.drop();

			BasicDBObject doc;
			doc = new BasicDBObject("ticket_id", 1)
					.append("ticket_info", "全ての設備をご利用いただけます。");
			coll.insert(doc);
			doc = new BasicDBObject("ticket_id", 2)
				 	.append("ticket_info", "2Fフロアのマシンジム全てをご利用いただけます。");
			coll.insert(doc);
			doc = new BasicDBObject("ticket_id", 3)
					.append("ticket_info", "3Fプールをご利用いただけます。");
			coll.insert(doc);
			doc = new BasicDBObject("ticket_id", 4)
					.append("ticket_info", "当ジム3Fのジャグジーをご利用いただけます。");
			coll.insert(doc);
			doc = new BasicDBObject("ticket_id", 5)
					.append("ticket_info", "ウエア、タオル2種、シューズをレンタルいただけます。");
			coll.insert(doc);
			doc = new BasicDBObject("ticket_id", 6)
					.append("ticket_info", "専門知識を持つトレーナーがあなたのトレーニングをサポートします。※要予約");
			coll.insert(doc);
			doc = new BasicDBObject("ticket_id", 7)
					.append("ticket_info", "test");
			coll.insert(doc);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			

	}

}
