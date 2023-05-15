package com.multi.liveAlone.party.bbsParty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsPartyController {
	@Autowired
	BbsPartyDAO dao;
	
	
	@RequestMapping("bbsPartyAll")
	public void all(PagePartyVO vo, Model model) {
		vo.setStartEnd(vo.getPage());
		List<BbsPartyVO> list = dao.all(vo);
		int count = dao.count();
		System.out.println("all count>> " + count);
		int pages = count / 10 + 1; //전체 페이지 개수 구하기 
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pages", pages);
	}
	
	@RequestMapping("bbsPartyOne")
	public void one(BbsPartyVO vo, Model model) {
		//게시물 1개짜리 vo2
		//replyList
		BbsPartyVO vo2 = dao.one(vo);
		model.addAttribute("one", vo2);
		
	}
}
