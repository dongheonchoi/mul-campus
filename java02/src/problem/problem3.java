package problem;

import javax.swing.JOptionPane;

public class problem3 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("정수를 입력해주세요");
		String num2 = JOptionPane.showInputDialog("정수를 입력해주세요");
		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		if (num11 > num22) {
			System.out.println(num11 + "이 더큽니다");
		}else {
			System.out.println(num22 + "이 더큽니다");
		}
		
		

	}

}
