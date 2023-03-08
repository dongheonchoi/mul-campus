package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.MemberDAO2;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입");
		f.setSize(400, 900);

		JLabel l1 = new JLabel("<<<<회원가입화면>>>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이름");
		JLabel l5 = new JLabel("전화번호");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원가입처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				if (id.equals("")) {
					JOptionPane.showMessageDialog(f, "id는 필수입력항목입니다.");
				}

				MemberDAO2 dao = new MemberDAO2();
				int result = dao.insert(id, pw, name, tel);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원가입성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원가입실패 다시 입력해주세요");
				}
			} // action
		}); // b1

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴처리");
				String id = t1.getText();

				MemberDAO2 dao = new MemberDAO2();
				int result = dao.delete(id);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원탈퇴 실패 다시 입력해주세요");
				}

			} // action
		}); // b2

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원수정처리");
				String id = t1.getText();
				String tel = t4.getText();

				MemberDAO2 dao = new MemberDAO2();
				int result = dao.update(id, tel);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원정보수정 성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원정보수정 실패 다시 입력해주세요");
				}
			} // action
		}); // b3

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원검색처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();

				MemberDAO2 dao = new MemberDAO2();
				dao.insert(id, pw, name, tel);

			} // action
		}); // b4

		// f에 위에 있는 요소들을 add로 붙여주어야하는데,
		// 붙이는 순서대로 물흐르듯이 붙여주고 싶음
		// 물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();

		// 폰트를 설정하기 위해 font 부품 필요
		Font font = new Font("D2.Coding", Font.BOLD, 40);

		//// 필ㅇ한 부품(객체)를 ram에 가져다 놓고, 준비 끝
		// 조립을 시작
		f.setLayout(flow);

		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);

		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		t1.setBackground(Color.yellow);
		t1.setForeground(Color.blue);

		t2.setBackground(Color.yellow);
		t2.setForeground(Color.blue);

		t3.setBackground(Color.yellow);
		t3.setForeground(Color.blue);

		t4.setBackground(Color.yellow);
		t4.setForeground(Color.blue);

		b1.setBackground(Color.white);
		b1.setForeground(Color.magenta);

		b2.setBackground(Color.white);
		b2.setForeground(Color.magenta);

		b3.setBackground(Color.white);
		b3.setForeground(Color.magenta);

		b4.setBackground(Color.white);
		b4.setForeground(Color.magenta);

		f.getContentPane().setBackground(Color.green);

		// 맨 끝으로~~~
		f.setVisible(true);
	}

}
