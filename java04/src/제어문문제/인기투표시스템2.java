package 제어문문제;


import java.util.Scanner;

public class 인기투표시스템2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int data =0;
		int iu = 0;
		int bts = 0;
		int nj = 0;
		
		while (true) {			
			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >>>");
			data = sc.nextInt();
			if (data == 4) {
				System.out.println("시스템을 종료합니다");
				System.out.println("----------------");
				System.out.println("아이유"+ iu +"표");
				System.out.println("BTS"+ bts +"표");
				System.out.println("뉴진스"+ nj +"표");
				break;
			}else if (data == 2) {
				bts = bts + 1;
			}else if (data == 3) {
				nj = nj + 1;
			}else {
				iu = iu+1;
			}
			
				
				
				
			}
			
		sc.close();
		}
		
		
		
		
}

