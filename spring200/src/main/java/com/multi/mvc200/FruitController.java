package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FruitController {
	
	
	@RequestMapping("fruit")
	public void fruit(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("메론");
		list.add("수박");
		list.add("참외");
		list.add("포도");
		list.add("딸기");
		list.add("배");
		model.addAttribute("list", list);
	}
	@RequestMapping("tour")
	public void tour( Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("제주도");
		list.add("미국 동부");
		list.add("미국 서부");
		list.add("홍콩");
		list.add("평창");
		list.add("일본");
		list.add("중국");
		model.addAttribute("list", list);
	}
}
