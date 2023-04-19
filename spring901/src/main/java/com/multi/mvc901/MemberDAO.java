package com.multi.mvc901;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//스프링에 dao는싱글토으로 하나만 만들어서 사용할게!라고 설정해야함
//2가지 방법을 할 수 있음.
//어노테이션(표시)방법, xml방법

@Component
public class MemberDAO { // CRUD

	//mybatis 싱글톤 객체 찾아서 주소를 넣어주세요
	@Autowired
	SqlSessionTemplate my;
	
	
	
//	public int login(MemberVO bag) {
//		
//		return result;
//	}
//	
//	
//	public ArrayList<MemberVO> list() {
//		
//		return list;
//
//	}
//
//	// 메서드를 만드는 것 ==> 메서드 정의(define)!
//	// 메서드를 정의했다고 실행되는 것은 아니다.!
//	// 메서드를 쓰는 것 ==> 메서드 호출(call)!
//	public MemberVO one(String id) {
//		
//		return bag;
//
//	}
//
	public int delete(String id) {
		
		int result = my.delete("member.del", id);
		
		return result;
	}
//
//	// 1. 가방을 받아서 저장해두자.
//	// 2. 필요할 때 가방에서 값들을 하나씩 꺼내자.
//	public int update(MemberVO bag) {
//		
//		return result;
//	}

	// public void add2() {
	public int update(MemberVO bag) {
		int result = my.update("member.up", bag);
		//                     namespace.id
		return result;
	}
	// public void add2() {
	public int insert(MemberVO bag) {
		int result = my.insert("member.create", bag);
		//                     namespace.id
		return result;
	}
}
