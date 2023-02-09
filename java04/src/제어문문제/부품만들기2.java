package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class 부품만들기2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		
		//물흐르듯이 순서대로 배치해주는 부품을 램에 복사
		//FlowLayout
		//f에 물흐르듯이 배치해주는 부품을 쓰겠다고 조립
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b = new JButton();
		b.setText("회원 가입 처리");

		

		
		JLabel text1 = new JLabel();
		text1.setText("아이디 입력");

		JLabel text2 = new JLabel();
		text2.setText("패스워드 입력");

		JLabel text3 = new JLabel();
		text3.setText("이름 입력");
		
		JLabel text4 = new JLabel();
		text4.setText("전화번호 입력");

		JLabel result = new JLabel();
		//result.setText("로그인 결과");
		
		JTextField input1 = new JTextField(10); //(10)10은 열글자까지 칠수 있다.
		JTextField input2 = new JTextField(10);
		JTextField input3 = new JTextField(10);
		JTextField input4 = new JTextField(10);
		
		
		
		
		ImageIcon ok = new ImageIcon("ok.png");
		ImageIcon no = new ImageIcon("no.png");
		
		
		b.setBackground(Color.pink);
		
		Font font = new Font("D2Coding", 1, 20);
		text1.setFont(font);
		text2.setFont(font); 
		text3.setFont(font); 
		text4.setFont(font); 
		result.setFont(font); 

		result.setForeground(Color.red);
		
		
		b.setFont(font);

		
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(text3);
		f.add(input3);
		f.add(text4);
		f.add(input4);
		f.add(b);
		f.add(result);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
						result.setIcon(ok);

				
				
				
			}
		});
		
		
		
		
		
		f.setVisible(true);
	}

}