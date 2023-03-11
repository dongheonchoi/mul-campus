package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.sound.midi.Receiver;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import 자바DB연결.miniprojectDAO;

public class miniprojectUI3 {

	static String wy = "WEEKNO";
	static int index = 0;
	static Object[][] all = receive(wy);
	
	
	public static void main(String[] args) {

		Font font = new Font("D2Coding", Font.BOLD, 20);
			

		
		JFrame f = new JFrame();
		f.setSize(1000, 700);
		f.getContentPane().setBackground(Color.white);

		f.setLayout(new FlowLayout());
//		f.add();

		JLabel l1 = new JLabel();
		if (wy.equals("WEEKNO")) {
			l1.setText("주간 추천 도서");
		} else {
			l1.setText("연간 추천 도서");
		}

		JLabel l2 = new JLabel();
		if (wy.equals("WEEKNO")) {
			l2.setText("best" + all[index][1]);
		} else {
			l2.setText("best" + all[index][2]);
		}

		JLabel l3 = new JLabel((String) all[index][3]);
		JLabel l4 = new JLabel(
				(String) all[index][5] + "·" + all[index][6] + "·" + all[index][7].toString().substring(0, 10));
		JLabel imageLabel = new JLabel();
		ImageIcon icon = new ImageIcon((String) all[index][8]);

		imageLabel.setIcon(icon);

		JButton b1 = new JButton("주간 추천");
		JButton b2 = new JButton("연간 추천");
		JButton b3 = new JButton("이전");
		JButton b4 = new JButton("다음");
		JButton b5 = new JButton("리뷰");
		JButton b6 = new JButton("구매");
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				wy = "WEEKNO";
				all = receive(wy);
				index = 0;
				l1.setText("주간 추천 도서");
				l2.setText("best" + all[index][1]);
				l3.setText((String) all[index][3]);
				l4.setText((String) all[index][5] + "·" + all[index][6] + "·" + all[index][7].toString().substring(0, 10));
				ImageIcon icon = new ImageIcon((String) all[index][8]);
				imageLabel.setIcon(icon);
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				wy = "YEARNO";
				all = receive(wy);
				index = 0;
				l1.setText("연간 추천 도서");
				l2.setText("best" + all[index][2]);
				l3.setText((String) all[index][3]);
				l4.setText((String) all[index][5] + "·" + all[index][6] + "·" + all[index][7].toString().substring(0, 10));
				ImageIcon icon = new ImageIcon((String) all[index][8]);
				imageLabel.setIcon(icon);
				
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index == 0) {
					index = all.length - 1;
					if (wy.equals("WEEKNO")) {
						l2.setText("best" + all[index][1]);
					} else {
						l2.setText("best" + all[index][2]);
					}
					l3.setText((String) all[index][3]);
					l4.setText((String) all[index][5] + "·" + all[index][6] + "·" + all[index][7].toString().substring(0, 10));
					ImageIcon icon = new ImageIcon((String) all[index][8]);
					imageLabel.setIcon(icon);
				} else {
					index--;
					if (wy.equals("WEEKNO")) {
						l2.setText("best" + all[index][1]);
					} else {
						l2.setText("best" + all[index][2]);
					}
					l3.setText((String) all[index][3]);
					l4.setText((String) all[index][5] + "·" + all[index][6] + "·" + all[index][7].toString().substring(0, 10));
					ImageIcon icon = new ImageIcon((String) all[index][8]);
					imageLabel.setIcon(icon);
				}

			}
		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index == (all.length - 1)) {
					index = 0;
					if (wy.equals("WEEKNO")) {
						l2.setText("best" + all[index][1]);
					} else {
						l2.setText("best" + all[index][2]);
					}
					l3.setText((String) all[index][3]);
					l4.setText((String) all[index][5] + "·" + all[index][6] + "·" + all[index][7].toString().substring(0, 10));
					ImageIcon icon = new ImageIcon((String) all[index][8]);
					imageLabel.setIcon(icon);

				} else {
					index++;
					if (wy.equals("WEEKNO")) {
						l2.setText("best" + all[index][1]);
					} else {
						l2.setText("best" + all[index][2]);
					}
					l3.setText((String) all[index][3]);
					l4.setText((String) all[index][5] + "·" + all[index][6] + "·" + all[index][7].toString().substring(0, 10));
					ImageIcon icon = new ImageIcon((String) all[index][8]);
					imageLabel.setIcon(icon);
				}
			}
		});

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b6.setFont(font);

		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(imageLabel);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);

		f.setVisible(true);
	}

	
	public static Object[][] receive(String wy) {
		
		miniprojectDAO dao = new miniprojectDAO();
		ArrayList<miniprojectVO> list = dao.list(wy);

		Object[][] all = new Object[list.size()][9]; // 이와 같이 전부 스트링이면 스트링이라해도된다.

		if (list.size() == 0) {
			System.out.println("검색결과 없음. ");

		} else {
			System.out.println("검색결과는 전체 " + list.size() + "개 입니다.");

			for (int i = 0; i < all.length; i++) {// 13개의 가방, 13개의 행
				all[i][0] = list.get(i).getBookid();
				all[i][1] = list.get(i).getWeekno();
				all[i][2] = list.get(i).getYearno();
				all[i][3] = list.get(i).getBooktitle();
				all[i][4] = list.get(i).getPrice();
				all[i][5] = list.get(i).getWriter();
				all[i][6] = list.get(i).getPublisher();
				all[i][7] = list.get(i).getDate();
				all[i][8] = list.get(i).getPic();
			}
		}
		
		return all;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}