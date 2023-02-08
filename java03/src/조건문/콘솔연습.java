package 조건문;

import java.util.Scanner;

public class 콘솔연습 {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);// 컴퓨터의 키보드

		System.out.print("이름 입력 >>");
		String data = sc.next();
		
		System.out.print("나이 입력>>");
		int data2 = sc.nextInt(); 
		
		
		System.out.print("취미 입력>>");
		String data3 = sc.next();
		
		System.out.println("나의 이름은 " + data);
		System.out.println("나의 나이는 " + data2);
		System.out.println("나의 취미는 " + data3);
		
		
		
		sc.close();
	}

}
