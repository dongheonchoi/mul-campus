package 배열응용;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.JulianFields;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(750, 500);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();

		f.setLayout(flow);

		JButton[] btn = new JButton[100];

		Font font = new Font("D2Coding", Font.BOLD, 20);

		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.magenta);
		result.setFont(font);

		JLabel cost = new JLabel("오렌지 색은 8000원 마젠타 색은 10000원 입니다.");
		result.setForeground(Color.black);
		result.setFont(font);

		// 예약 여부를 저장하는 배열을 만들기
		int[] seat = new int[100];

		for (int i = 0; i < btn.length; i++) {

			btn[i] = new JButton("" + i);

			btn[i].setFont(font);

			if (i <= 60) {
				btn[i].setBackground(Color.orange);
				
			}else {
				btn[i].setBackground(Color.magenta);
				
			}
			
			
			
			f.add(btn[i]);

			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);

					if (seat[no] == 1) {
						result.setText("이미 예약된 자석입니다.");
						result.setForeground(Color.blue);
					}else {
						seat[no] = 1;
						result.setText(text + " 예약완료");		
						btn[no].setBackground(Color.red);
						btn[no].setEnabled(false);
					}

				}
			});

		}

		f.add(result);
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.BLUE);
		total.setForeground(Color.yellow);
		total.setFont(font);
		
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int totalSeat = 0;
				int totalCost = 0;
				
				for (int i = 0; i < seat.length; i++) {
					totalSeat = totalSeat + seat[i];
					if (i <= 60 && seat[i] == 1) {
						totalCost = totalCost + 8000;
					}else if(i > 60 && seat[i] == 1 ){
						totalCost = totalCost + 10000;
					}
					
				}
				JOptionPane.showMessageDialog(f, "총" + totalSeat + "좌석 총" + totalCost +"원 결제 하시겠습니까?");
				
				
				
			}
		});
		
		
		
		f.add(total);
		f.add(cost);
		f.setVisible(true);
	}

}
