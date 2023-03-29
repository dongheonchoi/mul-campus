package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어해주는 역활을한다.
public class FoodController {
	
	@RequestMapping("food")
	public String login(FoodVO bag) {
		
		System.out.println(bag);
		//dao를 이용해서 DB처리할
		System.out.println("login 요청됨.");
		
		if (bag.getLike().equals("라면")) {
			return "like"; //views 아래 파일이름.jsp
		}else if(bag.getDislike().equals("커피")){
			//views아래가 아니고, webapp아래 
			//member.jsp로 가고 싶은 경우!
			return "dislike";
			//return "no";
		}else {
			return "redirect:food.jsp";
		}
	}
	

}
