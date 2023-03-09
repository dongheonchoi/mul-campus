package 자바DB연결;

import javax.swing.JOptionPane;

import 화면DB연결.BbsUI;
import 화면DB연결.BbsUI2;
import 화면DB연결.MemberUI;
import 화면DB연결.MemberUI2;
import 화면DB연결.MemberUI3;
import 화면DB연결.MemberVO;

public class StartUI {

	public static void main(String[] args) {
		//입력하는 화면 ui만들기
		
		
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("비밀번호 입력");
		
		MemberDAO3 dao = new MemberDAO3();
		
		//1. 가방만들기
		MemberVO bag = new MemberVO();
		
		//2. 가방에 입력값 넣기
		bag.setId(id);
		bag.setPw(pw);
		
		int result = dao.login(bag);
		if (result == 1) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			BbsUI2 bbs = new BbsUI2();
			bbs.open();
			
		}else {
			JOptionPane.showMessageDialog(null, "로그인 살패");
			MemberUI3 mem = new MemberUI3();
			mem.open();
		}
		
		
	}

}
