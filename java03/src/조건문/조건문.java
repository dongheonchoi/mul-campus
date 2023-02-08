package 조건문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class 조건문 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(300, 500);
		JLabel l = new JLabel();
		JTextField text = new JTextField(10);
;
		JButton b = new JButton();
		
		FlowLayout flow = new FlowLayout();
		
		Font font = new Font("궁서", 1, 15);
		
		Font font2 = new Font("D2Coding", 1, 30);
		
		
		f.setLayout(flow);
		
		l.setText("당신이 생각하는 숫자를 입력하세요");
		l.setFont(font);
		l.setForeground(Color.red);

		text.setBackground(Color.green);
		text.setForeground(Color.blue);
		text.setFont(font2);
		
		b.setBackground(Color.red);
		b.setForeground(Color.white);
		b.setFont(font2);
		b.setText("숫자 맞추기 게임");
		
		f.getContentPane().setBackground(Color.cyan);
		f.add(l);
		f.add(text);
		f.add(b);

		f.setVisible(true);
	}

}
