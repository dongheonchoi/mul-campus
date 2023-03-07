package 자바DB연결;

import java.util.Scanner;

public class 회원탈퇴 {

	public static void main(String[] args) {
		//win6실행
		Scanner sc = new Scanner(System.in); //스캐너 생성
		System.out.println("탈퇴할 아이디를 입력하세요"); //문장 출력	
		String id = sc.next(); //입력값을 String으로 id에 저장

		
		
		MemberDAO2 dao = new MemberDAO2();
		dao.delete(id); //win6 인서트
		
		
		
	}

}
