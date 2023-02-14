package 배열복습;

import java.lang.Character.Subset;

public class 스트링과배열3 {

	public static void main(String[] args) {
		
	String s = "011-245-1234";
	String s2 = s.trim();
	
	String[] s3 = s2.split("-");
	
	
	String carrier = " ";
	String newOld = " ";
	
	if (s3[0].equals("011")) {
		carrier = "sk";
	} else if (s3[0].equals("019")) {
		carrier ="LG";
	} else {
		carrier = "Apple";
	}
	
	System.out.println(carrier);
	
	if (s3.length >= 4) {
		newOld = "최신폰";
	}else {
		newOld = "올드폰";
	}
	
	System.out.println(newOld);
	
	
	
	int len = 0;
	
	for (int i = 0; i < s3.length; i++) {
		len = len + s3[i].length();
	}
	
	
	
	
	
	if (len >= 10) {
		System.out.println("유효한 전화번호");
	}else {
		System.out.println("유효하지 않은 전화번호");
	}
	
	
	
	
		
	}

}
