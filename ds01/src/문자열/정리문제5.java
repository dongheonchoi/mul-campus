package 문자열;

public class 정리문제5 {

	public static void main(String[] args) {
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		
		if (s1.equals(s2)) {
			System.out.println("동일합니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		if (s1.length() > s2.length()) {
			System.out.println("s1의 문자열이 큽니다.");
		}else if(s1.length() < s2.length()) {
			System.out.println("s2의 문자열이 큽니다.");
		}else {
			System.out.println("두 문자열의 길이는같습니다.");
		}
		
	}

}
