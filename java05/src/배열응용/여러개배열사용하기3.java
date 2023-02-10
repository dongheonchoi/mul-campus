package 배열응용;

import java.util.Scanner;

public class 여러개배열사용하기3 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String[] tour1 = new String[3];
		String[] tour2 = new String[3];
	
		for (int i = 0; i < 3; i++) {
			
			System.out.print("작년에 가고 싶으셨던곳을 우선 순위에 따라 입력하세요");
			tour1[i] = sc.nextLine();
			
		}

		for (int i = 0; i < 3; i++) {
			
			System.out.print("올해 가고 싶은곳을 우선 순위에 따라 입력하세요");
			tour2[i] = sc.nextLine();
			
		}
		
		
		int count = 0;
		
		for (int i = 0; i < tour2.length; i++) {
			if (tour1[i].equals(tour2[i])) {
				count++;
			}
		}
		
		System.out.println("작년과 올해의 우선순위가 같은 곳은" + count);
		
		sc.close();
		
	}
}
