package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class 부품만들기2 {

	public static void main(String[] args) {

		// new: 틀을 가지고 찍어낼때 사용
		// f에 JFrame이 저장
		JFrame f = new JFrame();
		f.setSize(300, 300);// 클만들기

		FlowLayout layOut = new FlowLayout();
		f.setLayout(layOut);
		
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼1");
		
		JLabel text1 = new JLabel();
		text1.setText("안녕하세요");
		
		
		Font font = new Font("궁서", 1 ,20);
		text1.setFont(font);
		
		b1.setBackground(Color.red);
		b1.setForeground(Color.yellow);
		
		
		ImageIcon icon = new ImageIcon("춘식1.jpg");
		//ImageIcon icon2 = new ImageIcon("춘식2.jpg");
		
		b1.setIcon(icon);
		
		
		f.add(text1);
		f.add(b1);
		
		
		
		// 보여주는건 맨 끝으로
		f.setVisible(true); // 틀을 보이게 하기

	}

}
