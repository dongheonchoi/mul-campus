package 순차문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		//기본 순차문 / 입력 --> 처리 --> 출력
		//입력 -> 부품사용
		
		String data1 = JOptionPane.showInputDialog("당신의 취미는?");
		String data2 = JOptionPane.showInputDialog("언제 하시나요?");
	
		//처리 -> 글자연결
		String result = data1 + " " + data2;
		//출력 -> 모니터 화면에 보이고 싶음
		System.out.println(result);
	}

}
