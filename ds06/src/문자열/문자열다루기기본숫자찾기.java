package 문자열;

import java.util.Arrays;

public class 문자열다루기기본숫자찾기 {

	public static void main(String[] args) {
		String s = "a234"; // false
		// String s = "1234"; //true
		boolean answer = true;

		// 0. 4글자, 6글자인지 판단해서 맞으면
		// 아래를 실행해주자.
		// 글자수를 구해주자.
		int size = s.length();
		if (size == 4 || size == 6) {

			try {
				Integer.parseInt(s);
			} catch (NumberFormatException e) {
				answer = false;
			}
		} else { //
			answer = false;
		}
		System.out.println(answer);

		// 2. 숫자로 바꾸어서 에러가 생기면
		// 문자가 포함되어 있음.

		String a = "Asdgfd";
		a = a.toLowerCase();
		System.out.println(a);
		
		StringBuilder sb = new StringBuilder();

		while (s.length() > 0) {
			if (s.indexOf(s.charAt(0)) == s.lastIndexOf(s.charAt(0))) {
				sb.append(s.charAt(0));
			}
			s = s.replace(String.valueOf(s.charAt(0)),"");
		}
		String s3 = "acb";
		String[] str = s3.split("");
		Arrays.sort(str);
 		s3 = String.join("", str);
 		System.out.println(s3);
 		sb.to
	}

}