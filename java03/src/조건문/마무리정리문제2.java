package 조건문;

import java.util.Scanner;

public class 마무리정리문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과 구매 갯수 입력하세요");
		int apple = sc.nextInt();
		
		System.out.print("사과 가격을 입력하세요");
		int appleCost = sc.nextInt();

		System.out.print("딸기 구매 갯수 입력하세요");
		int sb = sc.nextInt();
		
		System.out.print("딸기 가격을 입력하세요");
		int sbCost = sc.nextInt();
		
		System.out.println("사과 구매 가격은 " + (apple * appleCost) + "입니다.");
		System.out.println("딸기 구매 가격은 " + (sb * sbCost) + "입니다.");
		System.out.println("전체 구매 가격은 " + (sb * sbCost + apple * appleCost) + "입니다.");
		
		
	
	sc.close();
	}

}
