package 부품만들기;

public class 강아지사용하기 {

	
	public static void main(String[] args) {
		
		강아지 dog1 = new 강아지();
		dog1.age = 3;
		dog1.name = "초코";
		dog1.신나다();
		
		System.out.println("dog1의 나이 : " + dog1.age);
		System.out.println("dog1의 이름 : " + dog1.name);
		
		
		강아지 dog2 = new 강아지();
		dog2.age = 13;
		dog2.name = "쿠키";
		dog2.사료를먹다();
		System.out.println("dog2의 나이 : " + dog2.age);
		System.out.println("dog2의 이름 : " + dog2.name);
		
	}
	
	
		
}


