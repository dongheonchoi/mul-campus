package 조건문;

import java.util.Scanner;

public class 콘솔입력2 {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);// 컴퓨터의 키보드

		System.out.print("나이 입력>>");
		int data = sc.nextInt(); 
		
		System.out.println("내년 나이는 " + (data+1));
		

		System.out.print("키를 입력 >>");
		double data2 = sc.nextDouble();
		
		System.out.println("당신의 키는 " + data2);
		System.out.println("내년 키는 " + (data2*2));
		
		
		System.out.print("저녁을 먹었는지 입력(true/false)>>");
		String data3 = sc.next();
		
		System.out.println("당신의 저녁 여부는 " + data3);

		System.out.println("올해의 목표는>>");
		sc.nextLine();
		String data4 = sc.nextLine();
		
		System.out.println("올해의 목표는 " + data4);
		
		
		
		
		
		
		
		sc.close();
	}

}
