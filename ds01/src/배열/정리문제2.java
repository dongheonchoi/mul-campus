package 배열;

import java.util.Random;

public class 정리문제2 {

	public static void main(String[] args){
		
		
		Random r = new Random();
		
		
		int[] num = new int[20];
		for (int i = 0; i < 5; i++) {
			num[i] = r.nextInt(900);
		}
		
		int temp = num[0];
		for (int i = 0; i < num.length; i++) {
			if (temp < num[i]) {
				temp = num[i];
			}
		}
		System.out.println(temp);
	}

}
