package 제어문문제;

import java.util.Random;

public class 로또번호생성기2 {

	public static void main(String[] args) {
		
		
		
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(45) + 1));
		}
		Random r2 = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r2.nextInt(9) + 2));
		}
		Random r3 = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r3.nextInt(28) + 3));
		}
	}

}