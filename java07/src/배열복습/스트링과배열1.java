package 배열복습;

import java.lang.Character.Subset;

public class 스트링과배열1 {

	public static void main(String[] args) {
		
		String s = "간자,고구마,양파";
		String[] s2 =s.split(",");
		System.out.println(s2.length);
		System.out.println(s2[0]);
		String ss = "감자 고구마 양파";
		String[] s22 = s.split(" ");
		System.out.println(s22[2]);
		
		
		String s3 = "    홍길동";
		System.out.println(s3.trim());
		String s4 = s3.trim();
		System.out.println(s4.length());
		
		String s5 = s3.replace("    ", "");
		System.out.println(s5.length());
		
		String s6 = "홍길동";
		char[] s7 = s6.toCharArray();
		
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
