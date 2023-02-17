package 상속기본;

public class flycar extends car{
	
	boolean fly;
	
	public void fly() {
		System.out.println("하늘을 날다.");
	}

	public flycar(boolean fly) {
		this.fly = fly;
	}
	
	
	
}
