package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for (; ;) {//while(true) //무한 루프
			System.out.println("잘쓰지않음");
			String data = JOptionPane.showInputDialog("종료할까요??y를 입력");
			
			if (data.equals("y")){
				System.out.println("안녕히 가세요!!");
				break;	//for 문의 break	
			}
		}
	}
	
	
}
