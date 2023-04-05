package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyDAO dao;
	
	@Autowired
	MemberDAO dao2;
	
	@RequestMapping("one5")
	public void one5(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		MemberVO bag = dao2.one(id);
		//bag에 검색결과 다 들어있음.
		//views아래 one.jsp로 쓸 수 있도록 설정해주어야 함.
		model.addAttribute("bag", bag);
		//views까지 전달할 속성으로 추가해주세요. 
	}
	
	
	
	@RequestMapping("list6")
	public void list6(int bbsno, Model model) {
		System.out.println(bbsno); //사이즈를 찍어보세요.
		ArrayList<ReplyVO> list = dao.list(bbsno);
		model.addAttribute("list", list);
	}
	
	
	
	@RequestMapping("insert4")
	public void insert(ReplyVO vo) {
		System.out.println(vo);
		dao.insert(vo);
	
	}
	
	
	
}
