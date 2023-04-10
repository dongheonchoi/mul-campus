package 문자열;

import java.util.Arrays;

public class 처리방법들2 {

	public static void main(String[] args) {
		String s = "나는 프로그래머프야";
		String s2 = "진짜!!";
		
		System.out.println(s + s2);
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(0));
		System.out.println(s.endsWith("야"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,8));
		System.out.println(s.contains(s2));
		System.out.println(s.lastIndexOf("프"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.replace("나", "너"));
		
		
		String tel = "     011-245-1234   ";
		tel = tel.trim();
		System.out.println(tel);

		String[] tel2 = tel.split("-");
		System.out.println(Arrays.toString(tel2));
		
		if (tel2[0].equals("011")) {
			System.out.println("SK");
		}else if (tel2[0].equals("019")) {
			System.out.println("LG");
		}else {
			System.out.println("apple");
		}
		
		if (tel2[1].length() >= 4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
		
		if ((tel2[0]+tel2[1]+tel2[2]).length() >= 10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지않은 전화번호");
		}
		
		
	}

}
