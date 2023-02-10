package 배열응용;

import java.util.Random;

public class 입력받아평균2 {

	public static void main(String[] args) {
		//입력을 여러번 여러개 받아서 저장공간에 넣고 싶을때 배열 사용
		
		
		int[] jumsu = new int[10000];
	
		
		
		int max = 0;
		int zero = 0;
		int sum = 0;
		int count = 0;
		Random x = new Random(42);
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = x.nextInt(451);
			sum = sum + jumsu[i];
			if (jumsu[i] == 0) {
				System.out.print(i + " "); //인덱스
				zero ++;
			}else if (jumsu[i] == 450) {
				max ++;
			}
			
			
		
		}
		
		System.out.println();
		System.out.println(max); //만점자수 
		System.out.println(zero);//0점자수
		System.out.println((double)sum/10000); //평균
		
		for (int i = 0; i < jumsu.length; i++) {
			if ((((double)sum/10000)+50) >= jumsu[i] && (((double)sum/10000)-50) <= jumsu[i]) {
				count ++;
			}
		
		}
		System.out.println(count); //평균 언저리인 사람수
		
		System.out.println();
		int num = 0;
		
		int num2 = 1;
			
			loop :
			for (int j = 450; j > -1; j--) {
				for (int i = 0; i < jumsu.length; i++) {
					if (jumsu[i] == j) {
						num = num + j;

					if (num2 < 3000) {
						num2 = num2 + 1;
					}else {
						break loop ;
					}
							
						
				}
				
				
			}
			
		}
		
		System.out.println((double)num/3000);
		
		
		
			
	}

}
