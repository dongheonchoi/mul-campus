package 확인문제;

public class 조리시간 extends Thread{

	
	
	
	@Override
	public void run() {

		int[] time = { 200, 405 , 505 , 125, 305 };
		
		
		for (int i = 0; i < time.length; i++) {
			
			System.out.println("남은시간 >> " + time[i]);
			
			time[0] -=5 ;
			time[1] -=5 ;
			time[2] -=5 ;
			time[3] -=5 ;
			time[4] -=5 ;
			
			if (i == time.length - 1) {
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
