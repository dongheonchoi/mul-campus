package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {

		String data1 = JOptionPane.showInputDialog("몸무게를 입력하세요");
		String data2 = JOptionPane.showInputDialog("키를 입력하세요");
		

		double data11 = Double.parseDouble(data1);
		double data22 = Double.parseDouble(data2);

		
		double result1 =data11 / (data22*data22);

		System.out.println("당신의 bmi는 " + result1);
		JOptionPane.showMessageDialog(null, result1);
	}

}
