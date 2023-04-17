package 문자열;

import java.util.Arrays;
import java.util.HashSet;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		String s = "abcabcadc";
		
		//1. 일단 문자열을 하나씩 구분을 할 예정
		// 	 1-1) toCharArray()
		//	 1-2) split("")
		//	 1-3) charAt(index)
		//2. 어떤 문자들이 들어있는지 목록을 만들자.
		//	 중복을 없애면 목옥을 구할 수 있을 것 같다.
		// 	 HashSet을 사용하면 될듯 하다.
		HashSet<String> set = new HashSet<String>();
		String[] s2 = s.split("");
		System.out.println(Arrays.toString(s2));
		for (String x : s2) {
			set.add(x);
		}
		System.out.println(set.size());
		System.out.println(set); //[a , b, c, d]
		
		
		
	}

}
