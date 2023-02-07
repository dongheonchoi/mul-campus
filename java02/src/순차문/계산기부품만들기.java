package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class 계산기부품만들기 {

	public static void main(String[] args) {

		// new: 틀을 가지고 찍어낼때 사용
		// f에 JFrame이 저장
		JFrame f = new JFrame();
		f.setSize(300, 500);// 클만들기

		
		ImageIcon icon = new ImageIcon("010.png"); 
		JTextField text1 = new JTextField(10); //10은가로크기
		JTextField text2 = new JTextField(10);
		
		JLabel label1 = new JLabel();
		label1.setIcon(icon);
		
		Font font = new Font("궁서", 1 ,20);
		
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		
		
		FlowLayout layOut = new FlowLayout();
		f.setLayout(layOut);
		
		
		JButton b = new JButton();
		b.setText("+");
		b.setBackground(Color.red);
		b.setForeground(Color.yellow);
		
		JButton b2 = new JButton();
		b2.setText("-");
		b2.setBackground(Color.red);
		b2.setForeground(Color.yellow);
		
		JButton b3 = new JButton();
		b3.setText("/");
		b3.setBackground(Color.red);
		b3.setForeground(Color.yellow);
		
		JButton b4 = new JButton();
		b4.setText("*");
		b4.setBackground(Color.red);
		b4.setForeground(Color.yellow);
		

		
		label2.setText("숫자 1");
		label2.setFont(font);

		label3.setText("숫자 2");
		label3.setFont(font);
		

		
		
		text1.setFont(font);
		text2.setFont(font);
		
		
	
		
		
		f.add(label1);
		f.add(label2);
		f.add(text1);
		f.add(label3);
		f.add(text2);
		
		f.add(b);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		
		// 보여주는건 맨 끝으로
		f.setVisible(true); // 틀을 보이게 하기

	}

}
