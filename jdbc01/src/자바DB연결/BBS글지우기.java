package 자바DB연결;

import java.util.Scanner;

public class BBS글지우기 {

	public static void main(String[] args) {
		//win6실행
		Scanner sc = new Scanner(System.in); //스캐너 생성
		System.out.println("삭제할 글 번호를 입력하세요"); //문장 출력	
		int NO = sc.nextInt(); //입력값을 String으로 id에 저장

		
		
		BbsDAO dao = new BbsDAO();
		dao.delete(NO); //win6 인서트
		
		
		
	}

}
