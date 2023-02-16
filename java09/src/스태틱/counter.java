package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class counter {

	static int count;

	public static void main(String[] args) {

		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(300, 300);

		JLabel number = new JLabel("0");
		Font font = new Font("D2Coding", 1, 150);
		number.setFont(font);
		number.setForeground(Color.red);

		JButton b1 = new JButton("1 더하기");
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + "");

			}
		});

		JButton b2 = new JButton("0으로 초기화");
		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");

			}
		});

		JButton b3 = new JButton("1 빼기");
		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");

			}
		});
		b1.setBackground(Color.green);
		b1.setForeground(Color.black);

		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);

		b3.setBackground(Color.green);
		b3.setForeground(Color.black);

		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(number);

		f.setVisible(true);

	}

}
