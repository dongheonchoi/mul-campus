package 문자열;

import java.util.Arrays;
import java.util.List;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		
		String[] str = all.split(",");
		
		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].trim();
		}
		System.out.println("과목수 : " + str.length);
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("컴퓨터")) {
				System.out.println("컴퓨터의 인덱스 : " + i );
			}
		}
		
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < 3) {
				count++;
			}
		}
		System.out.println("과목명이 3글자 미만인 과목수 : " + count);
	
		List<String> list = Arrays.asList(str);
		System.out.println(list.indexOf("컴퓨터"));
	
	}

}
