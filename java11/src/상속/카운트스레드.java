package 상속;

public class 카운트스레드  extends Thread{
	
	
	@Override
	public void run() {
		
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트 >> " + i);
			//cpu에게 스레드 쉬는 시간 텀을 알려주기
			//thread를 잠깐재울 수 있다.
			//cpu는 외부자원입니다.
			//자바가 외부자원을 연결할 때는 위험하다고 인식
			//만약 문제가 생기면, 어떨게 할지 코드를 해주어야한다.
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
			
		}
	
	
	}
	
	
	
	
}
