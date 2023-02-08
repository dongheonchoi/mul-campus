package 조건문;

import javax.swing.JOptionPane;

public abstract class 설문조사10명 {

	public static void main(String[] args) {
		
		int full = 0;
		int noFull = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른가요? 1)배부름 2)안배부름");
			if (data.equals("1")) {
				full++;
					
			}else if (data.equals("2"))
				noFull++;
		}
		System.out.println("배부른 사람 몇명" + full + "명");
		System.out.println("안배부른 사람 몇명" + noFull + "명");
		
	}

}
