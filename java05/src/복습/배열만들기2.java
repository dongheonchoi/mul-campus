package 복습;

import java.util.Random;

public class 배열만들기2 {

	public static void main(String[] args) {
		int[] jumsu = new int[999];
		
		for (int i : jumsu) {
			System.out.println(i);
		}
		System.out.println("==============================");
		
		Random r = new Random();
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(4)+1;
			
		}
		for (int x : jumsu) {
			System.out.println(x);
		}
		
	}

}
