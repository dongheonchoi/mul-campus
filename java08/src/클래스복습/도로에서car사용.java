package 클래스복습;

public class 도로에서car사용 {

	public static void main(String[] args) {

		car car1 = new car();

		car1.color = "검정색";
		
		System.out.println(car1.color);
		
		car1.run();
		
		car car2 = new car();
		
		car2.color = "빨간색";
		
		System.out.println(car2.color);
		
		car2.run();
		car2.up();
		
	}

}
