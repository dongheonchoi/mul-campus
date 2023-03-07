package 자바DB연결;

import java.util.Scanner;

public class 회원가입2 {

	public static void main(String[] args) {
		//win6실행
		Scanner sc = new Scanner(System.in); //스캐너 생성
		System.out.println("id/pw/name/tel 순으로 입력하세요"); //문장 출력	
		String id = sc.next(); //입력값을 String으로 id에 저장
		String pw = sc.next(); //입력값을 String으로 pw에 저장
		String name = sc.next(); //입력값을 String으로 name에 저장
		String tel = sc.next();  ////입력값을 String으로 tel에 저장
		
		
		MemberDAO2 dao = new MemberDAO2();
		dao.insert(id, pw, name, tel); //win6 인서트
		
		
		
	}

}
