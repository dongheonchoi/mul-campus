package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {

		컴퓨터 com1 = new 컴퓨터(120000, "samsung" , 32);
		컴퓨터 com2 = new 컴퓨터(200000, "samsung" , 45);
		
		System.out.println(com1);
		System.out.println(com2);
		
		
	}

}
