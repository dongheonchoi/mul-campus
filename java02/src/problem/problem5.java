package problem;

import javax.swing.JOptionPane;

public class problem5 {

	public static void main(String[] args) {
		
		
		String num1 = JOptionPane.showInputDialog("수를 입력하세요");
		String num2 = JOptionPane.showInputDialog("수를 입력하세요");
		String a = JOptionPane.showInputDialog("연산자를 입력하세요");
		
		double num11 = Double.parseDouble(num1);
		double num22 = Double.parseDouble(num2);
		
		if (a.equals("+")) {
			System.out.println(num11 + num22);
		}else if (a.equals("-")) {
			System.out.println(num11 - num22);
		}else if (a.equals("/")) {
			System.out.println(num11 / num22);
		}else {
			System.out.println(num11 * num22);
		}
		
		
	}

}
