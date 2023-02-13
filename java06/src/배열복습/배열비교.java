package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열비교 {

	public static void main(String[] args) {
		
		//정렬을 할 때는 Arrays 
		Random r = new Random(42); 
		int[] jumsu = new int[10000];		
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1;
		}
		Arrays.sort(jumsu);
		
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		System.out.println("최대값 : " + jumsu[jumsu.length -1]);
		System.out.println("최소값 : " + jumsu[0]);
		
		
		int sum30 =0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 = sum30 + jumsu[i];
		}
		
		System.out.println("상위 30%평균: " + (sum30 / 3000.0));
		
		
		int sumLow = 0;
		for (int i = 0; i < 3000; i++) {
			sumLow = sumLow +jumsu[i];
		}
		
		System.out.println("하위 30% 평균: " + (sumLow / 3000.0));
		
		
	}

}
