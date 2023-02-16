package 확인문제;

public class 내차들 {

	public static void main(String[] args) {

		CoffeeTruck mycar = new CoffeeTruck();
		
		mycar.price = 7000;
		mycar.적재중량 = 1500;
		
		mycar.달리다();
		mycar.짐을싣다();
		
		System.out.println(mycar);

	}

}
