package 확인문제;

public class CoffeeTruck extends Truck{

	
	public void 짐을싣다() {
		System.out.println(적재중량 + "Kg만큼 커피와 기계를 싣다");
	}

	@Override
	public String toString() {
		return "CoffeeTruck [적재중량=" + 적재중량 + ", price=" + price + "]";
	}
	
	
	
}
