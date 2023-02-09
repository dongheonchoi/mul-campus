package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int data =0;
		
		while (true) {
			int ran = r.nextInt(10); 
			System.out.println("생각한 정답은??");
			data = sc.nextInt();
			
			if (data == ran) {
				System.out.println("정답입니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("오답입니다.");
				System.out.println("다시 시도해주세요");
				
				
				
				
			}
			
		}
		
		
		sc.close();
		
		
		
	}

}