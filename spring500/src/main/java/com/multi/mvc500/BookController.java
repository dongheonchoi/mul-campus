package com.multi.mvc500;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	@Autowired
	BookDAO dao;//100
	
	@RequestMapping("insert3.multi")
	public void insert(BookVO bag) {
		
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	@RequestMapping("delete3.multi")
	public void insert(int id) {
		
		System.out.println("delete요청됨.");
		System.out.println(dao);
		dao.delete(id);
	}
	@RequestMapping("update3.multi")
	public void update(BookVO bag) {
		
		System.out.println("update요청됨.");
		System.out.println(dao);
		dao.update(bag);
	}
	@RequestMapping("one4")
	public void one4(int id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		BookVO bag = dao.one(id);
		model.addAttribute("bag" ,bag);

	}
	@RequestMapping("list3")
	public void list3(Model model) {
		List<BookVO> list = dao.list();
		model.addAttribute("list" ,list);
		
	}


}
