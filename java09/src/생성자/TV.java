package 생성자;

public class TV {

		public int ch; //0
		public int vol; //0
		public boolean onoff; //false
		
		
		
		
		
		
		//다른 생성자 메서드가 없으면 부품만들때(객체 생성) 자동으로 생성됨.
		//기본 생성자(default constructor)
		public TV() { //무조건 실행이 된다.
			System.out.println("TV객체가 하나 생성됨");
		}
		//객체생성할 때마다 꼭 실행시키고 싶은 내용이 있으면 기본 생성자를 눈에 보이게 
		//다시만들어 주세요(명시적으로!!)
		
//		public  TV(int ch , int vol , boolean onoff) {//매개변수 (파라미터)
//			//무더기영역에 저장된 멤버변수에 값을 넣어주는 역활
//			this.ch = ch; //this.을 하면 전역변수로 인식을한다
//			this.vol = vol;
//			this.onoff = onoff;
//			
//			
//		}
		
		public TV(int ch, int vol, boolean onoff) {
			
			this.ch = ch;
			this.vol = vol;
			this.onoff = onoff;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		public void 채널을바꾸다() {
			int change = 1; //지역변수, local변수, 로컬변수는 자동초기화 X
			System.out.println(ch + "에서" + change + "로 바꾸다.");
			
		}
		

		public void 유튜브보다() { //메서드를 만드는 것 ==> 메서드 정의한다.
			System.out.println("볼륨" + vol + "을 키워서 동영상을 보다.");
		}	
			
		
		
	}


