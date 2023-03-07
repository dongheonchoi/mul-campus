package 자바DB연결;

import java.util.Scanner;

public class BBS글쓰기 {

	public static void main(String[] args) {
		//win6실행
		Scanner sc = new Scanner(System.in); //스캐너 생성
		System.out.println("NO/TITLE/CONTENT/WRITER 순으로 입력하세요"); //문장 출력	
		int NO = sc.nextInt(); //입력값을 String으로 id에 저장
		String TITLE = sc.next(); //입력값을 String으로 pw에 저장
		sc.nextLine();
		String CONTENT = sc.nextLine(); //입력값을 String으로 name에 저장
		String WRITER = sc.next();  ////입력값을 String으로 tel에 저장
		
		
		BbsDAO dao = new BbsDAO();
		dao.insert(NO, TITLE, CONTENT, WRITER); //win6 인서트
		
		
		
	}

}
