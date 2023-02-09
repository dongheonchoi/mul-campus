package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class 부품만들기1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 400);
		
		//물흐르듯이 순서대로 배치해주는 부품을 램에 복사
		//FlowLayout
		//f에 물흐르듯이 배치해주는 부품을 쓰겠다고 조립
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b = new JButton();
		b.setText("로그인 하시겠습니까");

		

		
		JLabel text1 = new JLabel();
		text1.setText("아이디");

		JLabel text2 = new JLabel();
		text2.setText("패스워드");

		JLabel result = new JLabel();
		//result.setText("로그인 결과");
		
		JTextField input1 = new JTextField(10); //(10)10은 열글자까지 칠수 있다.
		JTextField input2 = new JTextField(10);
		
		
		
		ImageIcon icon = new ImageIcon("로그인.png");
		ImageIcon ok = new ImageIcon("ok.png");
		ImageIcon no = new ImageIcon("no.png");
		
		b.setIcon(icon);
		b.setBackground(Color.GREEN);
		
		Font font = new Font("D2Coding", 1, 20);
		text1.setFont(font);
		text2.setFont(font); 
		result.setFont(font); 

		result.setForeground(Color.red);
		
		
		b.setFont(font);

		
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(b);
		f.add(result);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					String id = input1.getText();
					String pw = input2.getText();
					if (id.equals("root") && pw.equals("1234")) {
						//JOptionPane.showMessageDialog(f, "로그인 성공");
						//result.setText("로그인 성공");
						result.setIcon(ok);
					}else {
						//JOptionPane.showMessageDialog(f, "로그인 실패");
						input1.setText("");
						input2.setText("");
						result.setIcon(no);
						//result.setText("로그인 실패");
						
					}
				
				
				
			}
		});
		
		
		
		
		
		f.setVisible(true);
	}

}