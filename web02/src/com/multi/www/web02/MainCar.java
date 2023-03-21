package com.multi.www.web02;

public class MainCar {

	public static void main(String[] args) {
		//값이 다따로 들어가는 경우 이와 같이 프로토타입으로 만들기
		Car car = new Car("빨강", 10, 200); //12바이트
		Car car2 = new Car("파랑", 20, 250); //12바이트
		Car car3 = new Car("검정색", 30, 300); //12바이트
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
		
	}

}
