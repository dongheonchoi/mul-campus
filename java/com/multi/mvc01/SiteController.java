package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {
	
	@Autowired
	SiteDAO dao;
	
	
	@RequestMapping("insertSite")
	public void insert(SiteVO bag) {
		dao.insert(bag);
	}
	
	@RequestMapping("updateSite")
	public void update(SiteVO bag) {
		dao.update(bag);
	}

	@RequestMapping("deleteSite")
	public void delete(int no) {
		dao.delete(no);
	}

	@RequestMapping("oneSite")
	public void one(int no, Model model) {
		System.out.println("one 요청됨.");
		System.out.println(no);
		SiteVO bag = dao.one(no);
		model.addAttribute("bag", bag);
	}

	@RequestMapping("listSite")
	public void list2(Model model) {
		ArrayList<SiteVO> list = dao.list();
		model.addAttribute("list" , list);
		
	}
	
	
	
	
}
