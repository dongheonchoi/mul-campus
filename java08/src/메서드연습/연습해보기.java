package 메서드연습;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class 연습해보기 {
	
	static int[] count1 = {0, 0, 0};

	final static int[] PRICE1 = {30000, 10000, 4000};

	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("키오스크");
		f.setSize(700, 677);
		f.getContentPane().setBackground(Color.green);
		
		Font font = new Font("D2Coding", Font.BOLD , 40);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		

		
		JButton b1 = new JButton("회");
		JButton b2 = new JButton("매운탕");
		JButton b3 = new JButton("술");
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b1.setBackground(Color.magenta);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.cyan);
		
		
		

		JLabel textLabel = new JLabel("개수: ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("11.png");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font);

		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("11.png");
				imgLabel.setIcon(icon);
				count1[0] ++;
				f.setTitle("회"+ count1[0] + "개" + "매운탕" + count1[1] + "개" + "술" + count1[2] + "개");
				countLabel.setText("회"+ count1[0] + "개");
				result.setText("결제금액 " + ((count1[0]*PRICE1[0]) + (count1[1]*PRICE1[1]) + (count1[2]*PRICE1[2])) + "원");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("22.png");
				imgLabel.setIcon(icon);
				count1[1] ++;
				f.setTitle("회"+ count1[0] + "개" + "매운탕" + count1[1] + "개" + "술" + count1[2] + "개");
				countLabel.setText("매운탕" + count1[1] + "개");
				result.setText("결제금액 " + ((count1[0]*PRICE1[0]) + (count1[1]*PRICE1[1]) + (count1[2]*PRICE1[2])) + "원");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("33.png");
				imgLabel.setIcon(icon);
				count1[2] ++;
				f.setTitle("회"+ count1[0] + "개" + "매운탕" + count1[1] + "개" + "술" + count1[2] + "개");
				countLabel.setText("술" + count1[2] + "개");
				result.setText("결제금액 " + ((count1[0]*PRICE1[0]) + (count1[1]*PRICE1[1]) + (count1[2]*PRICE1[2])) + "원");
			}
		});
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);
		
		f.setVisible(true);
		
	}

}
