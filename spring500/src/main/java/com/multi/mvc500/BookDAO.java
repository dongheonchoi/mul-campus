package com.multi.mvc500;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BookVO bag) {
		System.out.println("------" + my);
		int result = my.insert("book.create", bag);
		return result;
	}
	public int delete(int id) {
		System.out.println("------" + my);
		int result = my.delete("book.del", id);
		return result;
	}
	public int update(BookVO bag) {
		System.out.println("------" + my);
		int result = my.update("book.up", bag);
		return result;
	}
	public BookVO one(int no) {
		BookVO bag = my.selectOne("book.one", no);
		return bag;

	}
	
	public List<BookVO> list() {
		List<BookVO> list = my.selectList("book.all");
		return list;
	}
	
}