package 조건문;

import javax.swing.JOptionPane;

public abstract class 인기조사10명 {

	public static void main(String[] args) {
		
		int iu = 0;
		int newJ = 0;
		int bts = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("1.아이유 2.뉴진스 3.bts");
			if (data.equals("1")) {
				iu++;
				
			}else if (data.equals("2")) {
				newJ++;
				
			}else if (data.equals("3")) {
				bts++;
			}
		}
		System.out.println("iu를 좋아하는사람" + iu +"명");
		System.out.println("뉴진스를 좋아하는사람"+ newJ+ "명");
		System.out.println("bts를 좋아하는 사람" + bts +"명");
		
	}

}
