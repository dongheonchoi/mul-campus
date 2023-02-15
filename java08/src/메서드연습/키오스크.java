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


public class 키오스크 {
	
	static int count; //0으로 초기화, 전역 변수
	final static int PRICE = 10000;//final 변경 불가, 상수
	//상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로 하길 권장한다.
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("키오스크");
		f.setSize(650, 677);
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
				count ++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count*PRICE) + "원");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("22.png");
				imgLabel.setIcon(icon);
				count ++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count*PRICE) + "원");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("33.png");
				imgLabel.setIcon(icon);
				count ++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count*PRICE) + "원");
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
