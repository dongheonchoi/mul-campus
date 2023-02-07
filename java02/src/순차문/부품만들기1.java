package 순차문;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JTextField;


public class 부품만들기1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 150);
		
		//물흐르듯이 순서대로 배치해주는 부품을 램에 복사
		//FlowLayout
		//f에 물흐르듯이 배치해주는 부품을 쓰겠다고 조립
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b = new JButton();
		b.setText("로그인 하시겠습니까");

		
		JButton b2 = new JButton();
		b2.setText("로그인 하시겠습니까2");
		
		JLabel text1 = new JLabel();
		text1.setText("아이디");

		JLabel text2 = new JLabel();
		text2.setText("패스워드");

		
		JTextField input1 = new JTextField(10); //(10)10은 열글자까지 칠수 있다.
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("궁서", 1, 20);
		text1.setFont(font);
		text2.setFont(font);

		b.setFont(font);
		b2.setFont(font);
		
		f.add(text1);
		f.add(input1);
		f.add(b);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		
		f.setVisible(true);
	}

}