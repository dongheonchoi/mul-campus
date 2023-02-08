package 조건문;

import java.util.Scanner;

public class 마무리정리문제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작값을 입력하세요");
		int start = sc.nextInt();

		System.out.print("종료값을 입력하세요");
		int end = sc.nextInt();
		
		System.out.print("점프 값을 입력하세요");
		int jump = sc.nextInt();
		
		
		int a = 0;
		for (int i = start; i <= end; i += jump) {
			a = a +i;
			System.out.println(a);
			if ( a> 100) {
				break;
			
			
			}
			
		}
		

		
		
		sc.close();
	}

}
