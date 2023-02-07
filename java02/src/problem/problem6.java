package problem;

import javax.swing.JOptionPane;

public class problem6 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("정수를 입력해주세요");
		String num2 = JOptionPane.showInputDialog("정수를 입력해주세요");
		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		double result = (double)num11/(double)num22;

		
		
		
		System.out.printf("%.2f", result); 
	

	}

}
