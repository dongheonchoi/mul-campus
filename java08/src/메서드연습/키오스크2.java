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


public class 키오스크2 {
	
	static int count1; //0으로 초기화, 전역 변수
	static int count2; //0으로 초기화, 전역 변수
	static int count3; //0으로 초기화, 전역 변수
	final static int PRICE1 = 30000;//final 변경 불가, 상수
	final static int PRICE2 = 10000;//final 변경 불가, 상수
	final static int PRICE3 = 4000;//final 변경 불가, 상수
	//상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로 하길 권장한다.
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("키오스크");
		f.setSize(700, 677);
		f.getContentPane().setBackground(Color.green);
		
		Font font = new Font("D2Coding", Font.BOLD , 40);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//배치부품(객체)를 바꿔주지 않으면 경계레이아웃을 사용
		//BorderLayout
		
		JButton b1 = new JButton("회");
		JButton b2 = new JButton("매운탕");
		JButton b3 = new JButton("술");
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b1.setBackground(Color.pink);
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
				count1 ++;
				f.setTitle("회"+ count1 + "개" + "매운탕" + count2 + "개" + "술" + count3 + "개");
				countLabel.setText("회"+ count1 + "개");
				result.setText("결제금액 " + ((count1*PRICE1) + (count2*PRICE2) + (count3*PRICE3)) + "원");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("22.png");
				imgLabel.setIcon(icon);
				count2 ++;
				f.setTitle("회"+ count1 + "개" + "매운탕" + count2 + "개" + "술" + count3 + "개");
				countLabel.setText("매운탕" + count2 + "개");
				result.setText("결제금액 " + ((count1*PRICE1) + (count2*PRICE2) + (count3*PRICE3)) + "원");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("33.png");
				imgLabel.setIcon(icon);
				count3 ++;
				f.setTitle("회"+ count1 + "개" + "매운탕" + count2 + "개" + "술" + count3 + "개");
				countLabel.setText("술" + count3 + "개");
				result.setText("결제금액 " + ((count1*PRICE1) + (count2*PRICE2) + (count3*PRICE3)) + "원");
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
