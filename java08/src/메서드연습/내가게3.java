package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		
		int price = 700;
		int count1 = 5; //오전에 온 손님수
		int count2 = 4; //오후에 온 손님수
		int sum1 = cal3.mul(price, count1);
		int sum2 = cal3.mul(price, count2);
		int sum3 = cal3.add(sum1, sum2);
		
		
		System.out.println(cal3.add(count1, count2));
		System.out.println(cal3.minus(count1, count2));
		System.out.println(cal3.mul(price, count1));
		System.out.println(cal3.mul(price, count2));
		System.out.println(cal3.add(sum1, sum2));
		System.out.println(cal3.div(sum3, cal3.minus(count1, count2)));
		
		
		
	}

}
