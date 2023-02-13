package 배열응용;

import java.awt.Button;
import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(800 , 800);
	
	
		JButton[] buttons = new JButton[500];
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i + "번" );
		}
		
		f.setLayout(null);
		f.setBackground(Color.green);
		
		Random n = new Random();
		
		Color[] colors = {Color.red, Color.magenta, Color.cyan ,Color.DARK_GRAY, Color.LIGHT_GRAY};
		
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setBounds(n.nextInt(800), n.nextInt(800), 100, 50);
			buttons[i].setBackground(colors[n.nextInt(5)]);
			f.add(buttons[i]);
		}
		f.getContentPane().setBackground(Color.BLUE);
		
		f.setVisible(true);
	}

}
