package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어해주는 역활을한다.
public class MemberController {
	@Autowired
	MemberDAO dao; //전역 변수(글로벌 변수)
	@Autowired
	BookDAO dao2;
	
	//컨트롤 하는 기능 (CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버메서드(기능처리담당)
	//하나의 버튼호출당 하나의 함수 연결
	//요청된 주소가 어떻게 될 때
	//바로 아래에 있는 메서드가 호출이 될지를
	//써주어야 한다.
	@RequestMapping("login")
	public String login(MemberVO bag) {
		
		System.out.println(bag);
		//dao를 이용해서 DB처리할
		System.out.println("login 요청됨.");
		System.out.println(dao);
		
		int result = dao.login(bag);
		if (result == 1) {
			return "ok"; //views 아래 파일이름.jsp
		}else {
			//views아래가 아니고, webapp아래 
			//member.jsp로 가고 싶은 경우!
			return "redirect:member.jsp";
			//return "no";
		}
	}
	
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 다 넣어줌.
		//3)bag에 다 넣어준다.
		System.out.println("insert 요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		//dao에게 insert 요청!!
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update 요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete 요청됨.");
		System.out.println(id);
		dao.delete(id);
	}
	
	@RequestMapping("one")
	public void one(int id, Model model) {
		System.out.println("one 요청됨.");
		System.out.println(id);
		BookVO bag = dao2.one(id);
		//bag에 검색결과 다 들어있음.
		//views아래 one.jsp로 쓸 수 있도록 설정해주어야 한다.
		model.addAttribute("bag", bag);
		//views까지 전달할 속성으로 추가
		
	}
	
	@RequestMapping("list") 
	public void list(MemberVO bag) {
		System.out.println("list 요청됨.");
		System.out.println(bag);
	}

}
