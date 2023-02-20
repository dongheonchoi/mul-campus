package 상속;

public class 예외처리 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될 거야.");
		
		
		
		
		try {
			System.out.println("2. 문제 발생>>" + 10/0);
			
		} catch (Exception e) {
			System.out.println("관리자에게 메일보내기");
		
		}
		System.out.println("3. 이것도 프린트가 안되나요.");
	
	
	
	
	}

}
