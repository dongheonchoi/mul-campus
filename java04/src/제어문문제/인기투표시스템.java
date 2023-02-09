package 제어문문제;



import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표시스템 {

	public static void main(String[] args) {
		JFrame album = new JFrame();
		album.setSize(200,650);
		
		FlowLayout f = new FlowLayout();
		album.setLayout(f);
		
		JLabel title = new JLabel();
		title.setText("아이유 앨범 인기 투표");

		ImageIcon image1 = new ImageIcon("라일락.jpg");
		ImageIcon image2 = new ImageIcon("에잇.jpg");
		ImageIcon image3 = new ImageIcon("love poem.jpg");
		
		JButton b1 = new JButton();
		//b1.setText("라일락");
		b1.setIcon(image1);
		JButton b2 = new JButton();
		//b2.setText("에잇");
		b2.setIcon(image2);
		JButton b3 = new JButton();
		//b3.setText("Love poem");
		b3.setIcon(image3);
		
		
		
		JLabel text1 = new JLabel();
		text1.setText("1. 라일락");
		JLabel text2 = new JLabel();
		text2.setText("2. 에잇");
		JLabel text3 = new JLabel();
		text3.setText("3. Love poem");
		
		

		
		JLabel result1 = new JLabel();
		JLabel result2 = new JLabel();
		JLabel result3 = new JLabel();
		

		
		album.add(title);
		album.add(b1);
		album.add(text1);
		album.add(result1);
		album.add(b2);
		album.add(text2);
		album.add(result2);
		album.add(b3);
		album.add(text3);
		album.add(result3);
		
		
		b1.addActionListener(new ActionListener() {
			int lilac = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				lilac++;
				result1.setText(lilac + "표");
				
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			int eight = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				eight++;
				result2.setText(eight + "표");
				
			}
		});
		b3.addActionListener(new ActionListener() {
			int lovePoem = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				lovePoem++;
				result3.setText(lovePoem + "표");
				
			}
		});
		
	album.setVisible(true);
		
		
	}
		
		
		
		
}

