package 확인문제;

public class 딸 {
	
	public String name;
	public String gender;
	
	public static int wallet = 10000;
	public static int count;
	
	
	public void tv보다() {
		System.out.println("9시엔 뉴스를 본다.");
		
		
		
	}

	public 딸(String name, String gender) {
		this.name = name;
		this.gender = gender;
		wallet -= 1000;
		count++;
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	
	
	
	
	
}
