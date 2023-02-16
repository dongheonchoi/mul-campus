package 생성자;

public class Day {
	String doing;
	int time;
	String location;
	static int count; // 스태틱을 안붙이면 계속 새로운 count를 생성
	static int sum;
	
	public Day(String doing, int time, String location) {
		//new로 부품을 만드는 것 (객체생성)
		//객체생성할 때 마다 꼭 처리하고 싶은 내용이 있으면
		//생성자 메서드내에 써주세요
		//객체생성할때 생성자 메서드가 자동호출되기때문에 무조건 처리해줌.
		count ++;
		
		sum += time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}



	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
	
	
}
