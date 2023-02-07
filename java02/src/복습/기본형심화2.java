package 복습;

public class 기본형심화2 {

	public static void main(String[] args) {
		//정수형 4가지
		//-128~127, 1바이트 byte
		//-3만~3만, 2바이트 short
		//-21억~21억, 4바이트 int
		//21억 이상, 8바이트 long
		
		byte age = 127;
		short days = 100;
		int money = 100000;
		long bank = 2300000000L; //long은 끝에 l이나 L을 써야 에러가 안남.
		
		//실수형 변수 2가지
		float height = 170.4F; // f,F끝에 써야함.
		//소수점 4자리까지 4바이트 float
		double weight= 43.33333333;
		//소수점 8자리 이상 8바이트 double
		
		//문자1 char
		//논리형 boolean
	}

}
