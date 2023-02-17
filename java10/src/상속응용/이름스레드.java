package 상속응용;

public class 이름스레드 extends Thread{
	
	
	@Override
	public void run() {
		
		for (int i = 1; i <= 50000; i++) {
			
			System.out.println("*" + i);
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
