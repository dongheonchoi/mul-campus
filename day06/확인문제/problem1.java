package 확인문제;

import javax.swing.JOptionPane;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String what = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		
		String result = "오늘 " + day + "에 수업후 나는 " + what + "할 예정.";
		
		System.out.println(result);
		
				
		
		
	}

}
