package com.multi.mongoDB3;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_delete2 {

	public static void main(String[] args) {
		//1. 몽고db 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. 몽고db 프로그램에 연결 성공.");
		//2. shop2 db로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 db로 연결 성공");
		
		//3. member 컬렉션에 연결
		MongoCollection<Document> collection =database.getCollection("member");
		System.out.println("3.member 컬렉션에 연결 성공");
		
		//삭제할 조건을 json(Document)로 만들어주기
		Document filter = new Document();
		
		//조건
		filter.append("pw","1234");
		
		
		collection.deleteMany(filter);
		client.close();
		System.out.println("4. memeber 컬렉션에 deleteMany 성공");
		
	}

}
