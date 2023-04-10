package 문자열;

import java.util.Arrays;

public class 정리문제6 {

	public static void main(String[] args) {
		String s5 = "[10,30,20,40,50]";
		
		System.out.println(s5.length());
		
		System.out.println(s5.substring(1,15));
		
		String[] str = s5.substring(1,15).split(",");
		
		int[] arrInt = new int[str.length];
		
		int int1 = 0;
		for (int i = 0; i < str.length; i++) {
			arrInt[i] = Integer.parseInt(str[i]);
			int1 = int1 + Integer.parseInt(str[i]);
		}
		Arrays.sort(arrInt);
		System.out.println(int1);
		System.out.println(Arrays.toString(arrInt));
	}

}
