package 생성자;

public class 은행통장사용 {

	public static void main(String[] args) {
		통장  여행통장= new 통장("홍길동" , "040216", 10000);
		통장  청약통장= new 통장("홍길동" , "040216", 20000);
		
//		System.out.println(여행통장.name);
//		System.out.println(여행통장.money);
		
		
		System.out.println(여행통장);
		System.out.println(청약통장);
	}

}
