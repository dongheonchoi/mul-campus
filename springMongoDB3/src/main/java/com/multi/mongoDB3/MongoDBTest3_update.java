package com.multi.mongoDB3;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest3_update {

	public static void main(String[] args) {
		//1. 몽고db 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. 몽고db 프로그램에 연결 성공.");
		//2. shop2 db로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 db로 연결 성공");
		
		//3. member 컬렉션에 연결
		MongoCollection<Document> collection =database.getCollection("memo");
		System.out.println("3.memo 컬렉션에 연결 성공");
		
		//update할 조건은 json(document로 만들어 주세요)
		Document filter = new Document();
		filter.append("age", 501);
		
		
		Bson set = Updates.set("name", "songsong");
		
		collection.updateOne(filter, set);
		System.out.println("test.");
	}

}
