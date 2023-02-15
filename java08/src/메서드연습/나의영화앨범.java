package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {
	
	
	static int index = 2;
	
	public static void main(String[] args) {
		String[] title = {"더 퍼스트 슬램덩크","아바타:물의 길" ,"앤트맨과 와스프 퀀텀매니아" ,"영웅", "타이타닉" };
		String[] img = {"555.png","444.png","111.png","333.png","222.png"};
		double[] jumsu = {9.28,8.82 ,8.90 ,8.43 ,9.73};
 	
		
		
		JFrame f = new JFrame();
		f.setSize(516, 530);
		f.getContentPane().setBackground(Color.green);
		
		Font font = new Font("D2Coding", Font.BOLD , 40);
		
		
		//배치부품(객체)를 바꿔주지 않으면 경계레이아웃을 사용
		//BorderLayout
		
		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.red);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel();
		center.setHorizontalAlignment(0);
		center.setFont(font);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);
		
		JLabel under = new JLabel(String.valueOf(jumsu[index]));
		under.setHorizontalAlignment(0);
		under.setForeground(Color.blue);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);
		
		JButton left = new JButton("왼 쪽");
		left.setBackground(Color.yellow);
		left.setFont(font);
		f.add(left, BorderLayout.WEST); 
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//현재 인뎃스 보다 하나 적은 값들로 top, center, under를 setting
				if (index > 0) {
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index = index - 1;
				}else {
					JOptionPane.showMessageDialog(f, "끝입니다.");;
				}
					
				}
				
				
				
				
				
		});
		
		
		
		JButton right = new JButton("오른쪽");
		right.setBackground(Color.yellow);
		right.setFont(font);
		f.add(right, BorderLayout.EAST); 
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//현재 인뎃스 보다 하나 적은 값들로 top, center, under를 setting
				if (index<4) {
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index = index + 1;
					
				}else {
					JOptionPane.showMessageDialog(f,"끝입니다");
				}
			}
				
				
				
				
		});
		
		
		
		//프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
	}

}
