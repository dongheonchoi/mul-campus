package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char firstName ='홍';
		int age = 28;
		double height = 172.6;
		boolean man = true;
		
		//기본데이터x ==> 너무 많이 쓰기 때문에 기본형처럼 쓸 수 있다. 
		String name = "홍길동"; //여러글자는 이중따옴표
		//문자열
		
		
		System.out.println("성은 " + firstName);
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 키는 " + height);
		System.out.println("나는 남자가 " + man);
		System.out.println("나는 이름은 " + name);
		

	}

}
