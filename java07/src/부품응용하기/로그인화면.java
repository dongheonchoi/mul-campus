package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		// font , flowlayout
		// jframe, imageicon 3개, imagelabel
		// idlabel, pwlabel, id입력값, pw입력값
		// 로그인버튼, reset버튼

		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(400, 800);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("D2Coding", 1, 30);

		JLabel top = new JLabel();
		JLabel id = new JLabel("아 이 디 :");
		JLabel pw = new JLabel("패스워드 :");
		id.setFont(font);
		pw.setFont(font);

		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");

		top.setIcon(icon1);

		JTextField idText = new JTextField(20);
		JTextField pwText = new JTextField(20);

		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.green);
		reset.setBackground(Color.green);

		reset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// reset을 눌렀을 때 idText, pwText에 공백을 넣기
				idText.setText("");
				pwText.setText("");

			}
		}); // reset add end

		login.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// 
				String id2 = idText.getText(); //"root"
				String pw2 = pwText.getText(); //"1234"
				
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(null,"로그인 성공");	
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
					f.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null,"로그인 실패");					
					
				}
				
				
			}
		}); //login add end

		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);

		f.setVisible(true);
	}

}
