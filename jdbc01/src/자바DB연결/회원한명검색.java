package 자바DB연결;

import java.util.Scanner;

import javax.swing.JOptionPane;

import 화면DB연결.MemberVO;

public class 회원한명검색 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //스캐너 생성
		System.out.println("검색할 아이디를 입력하세요"); //문장 출력	

		String id = sc.next(); //입력값을 String으로 id에 저장
		
		
		MemberDAO3 dao = new MemberDAO3();
		MemberVO bag = dao.one(id);
		String total = bag.getId() + ", " + bag.getPw() + ", " + bag.getName() + ", " + bag.getTel();
		
		JOptionPane.showMessageDialog(null, total);
		
	}

}
