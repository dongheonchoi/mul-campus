package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i =5; i <= 300; i++) {
			
			if (i % 5 == 0) {
				sum = sum + i;
			}
			
		}
		System.out.println(sum);
		
		
		
		String sum2 = "" ;
		for (int i = 0; i < 4; i++) {
			String data = JOptionPane.showInputDialog("먹고 싶은 음식을 입력하세요");
			sum2 = sum2 + data + "랑 ";
		}
		System.out.println(sum2);
		
		
		
	}

}
