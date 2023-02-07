package problem;

import javax.swing.JOptionPane;

public class problem2 {

	public static void main(String[] args) {
		String food = JOptionPane.showInputDialog("자장면, 라면, 회 중 먹고 싶은 저녁은?");
		
		if (food.equals("자장면")) {
			System.out.println("중국집으로가요");
		}else if (food.equals("라면")) {
			System.out.println("중국집으로가요");
		}else if (food.equals("회")) {
			System.out.println("횟집으로 가요");
		}else {
			System.out.println("그냥안먹어요.");
		}

	}

}
