package 자바DB연결;

import java.util.Scanner;

public class 회원정보수정 {

	public static void main(String[] args) {
		//win6실행
		Scanner sc = new Scanner(System.in); //스캐너 생성
		System.out.println("id/tel 순으로 입력하세요"); //문장 출력	
		String id = sc.next(); //입력값을 String으로 id에 저장
		String tel = sc.next();  ////입력값을 String으로 tel에 저장
		
		
		MemberDAO2 dao = new MemberDAO2();
		dao.update(id,  tel); //win6 인서트
		
		
		
	}

}
