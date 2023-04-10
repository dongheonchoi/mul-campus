package 배열;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class 랜덤배열최대값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(100);
		
		int[] numbers = new int[10];
		int[] numbers2 = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(1000);
			numbers2[i] = r.nextInt(1000);
		}
		
		//오름차순으로 정렬한 다음 맨앞(최소값)
		//                  맨뒤(최대값)
		Arrays.sort(numbers);
		
		
		System.out.println("최소값은 "+numbers[0] + " 최대값은 " + numbers[numbers.length-1]);
	
		if(Arrays.equals(numbers, numbers2)) {
			System.out.println("2개의 배열이 같습니다.");
		}else {
			System.out.println("2개의 배열이 다릅니다.");			
		}
		
		String result = Arrays.toString(numbers);
		String result2 = Arrays.toString(numbers2);
		System.out.println(result);
		System.out.println(result2);
		System.out.println("스트링의 글자수 :" + result.length());
		System.out.println("배열의 개수 :" + numbers.length);
	}
	
}
