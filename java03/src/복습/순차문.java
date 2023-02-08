package 복습;

import javax.swing.JOptionPane;

public abstract class 순차문 {

	public static void main(String[] args) {
		// 두 개의 숫자를 입력을 받아서 처리해서 출력
		String n1 = JOptionPane.showInputDialog("숫자 1 입력");
		String n2 = JOptionPane.showInputDialog("숫자 2 입력");
		
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		System.out.println(n11/n22);
	}

}
