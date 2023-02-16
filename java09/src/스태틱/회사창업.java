package 스태틱;

public class 회사창업 {

	public static void main(String[] args) {
		
		직원 cowo1 = new 직원("홍길동", 25, "여");
		직원 cowo2 = new 직원("김길동", 24, "남");
		직원 cowo3 = new 직원("송길동", 26, "여");
		
		System.out.println(cowo1);
		System.out.println(cowo2);
		System.out.println(cowo3);
		System.out.println(직원.sum / (double)직원.count);
		
		

	}

}
