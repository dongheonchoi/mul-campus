package 상속응용;

public class 골뱅이달러앤드스레드사용 {

	public static void main(String[] args) {

		
		
		달러스레드 dollar = new 달러스레드();
		앤드스레드 and = new 앤드스레드();
		골뱅이스레드 www = new 골뱅이스레드();
		
		
		dollar.start();
		and.start();
		www.start();
		
		
	}

}
