package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	
	
	
	public void open() {
		
		JFrame f = new JFrame();
		f.setTitle("내 일기장 작성 화면");
		f.setSize(500,600);
		f.getContentPane().setBackground(Color.yellow);
	
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("D2Coding", 1, 30);
		
		
		
		JLabel date = new JLabel("오늘의 날짜");
		JLabel title = new JLabel("오늘의 제목");
		JLabel content = new JLabel("오늘의 내용");
		
		date.setFont(font);
		title.setFont(font);
		content.setFont(font);
		
		JTextField dateText = new JTextField(10);
		JTextField titleText = new JTextField(10);
		
		
		
		dateText.setFont(font);
		titleText.setFont(font);
		
		JTextArea contentText = new JTextArea(5, 10);
		contentText.setFont(font);
		
		
		JButton btn = new JButton("파일에 일기 저장");
		btn.setFont(font);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String date2 = dateText.getText();
				String title2 = titleText.getText();
				String content2 = contentText.getText();
				
				System.out.println(date2 + " " + title2 +" " + content2);
				
				//파일을 만들고, 자바프로그램과 file간의 연결통로(stream)을 만들어준다.
				//외부에 있는 파일, 네트워크나 cpu등을 자바에서 연결할 때는 아주 위험한 상황이라고 인식
				//그러한 상황에 문제가 발생하면 어떻게 처리할지를 꼭 써줘야한다.
				try {
					FileWriter file = new FileWriter(date2 +".txt");
					file.write(date2 + "\n"); 
					file.write(title2 + "\n"); 
					file.write(content2 + "\n");
					file.close();
				} catch (IOException e1) {
					System.out.println("파일로 저장하는 중 문제가 발생했습니다.");
				}
				
				
				
			}
		});
		
		
		
		
		f.add(date); f.add(dateText);
		f.add(title); f.add(titleText);
		f.add(content); f.add(contentText);
		f.add(btn);
		
		
		
		f.setVisible(true);
		
	}
	
	
	
	
}
