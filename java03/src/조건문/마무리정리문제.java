package 조건문;

import java.util.Scanner;

public class 마무리정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id를 입력하세요>>");
		String id = sc.next();
		
		System.out.print("pw를 입력하세요>>");
		String pw = sc.next();
		
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
	sc.close();
	
	}

}
