package 확인문제;

public class 음식 extends Thread{

	
	
	
	
	
	

	@Override
	public void run() {
		
		String[] food = {
				"파스타","수육","피자","치킨","불고기"
		};
		
		for (int i = 0; i < food.length; i++) {
			System.out.println("음식 >> " + food[i]);
			
			if (i == food.length - 1) {
				i = 0;
			}
			
			
			
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
			
		}
	
	
	}
}
