package 상속;

public class 원더우먼 extends 우먼{
	
	boolean 늙다;
	
	public void space() {
		sleep();
		
		System.out.println("이름은" + name);
		
		System.out.println("우주를 날다.");
	}
	
	
	public void jump() {
		System.out.println("높이 뛰다");
	}

	@Override
	public String toString() {
		return "원더우먼 [늙다=" + 늙다 + ", ability=" + ability + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
