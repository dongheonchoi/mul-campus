package 배열심화;

public class 깊은복사응용 {

	public static void main(String[] args) {
		int[] num3 = {300, 200, 300};
//		int[] num4 = num3; //참조형의 얉은 복사

		int[] num4 =num3.clone();//참조형의 깊은 복사
		
		System.out.println(num3);
		System.out.println(num4);
		
		num3[0] = 999;
		
		for (int i = 0; i < num3.length; i++) {
			System.out.println(num3[i] + "");
		}
		System.out.println();
		for (int i = 0; i < num4.length; i++) {
			System.out.println(num4[i] + " ");
		}
		
		
		
	}

}
