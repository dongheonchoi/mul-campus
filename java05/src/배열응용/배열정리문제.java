package 배열응용;

import java.util.Scanner;


public class 배열정리문제 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
//		int[] arr = new int[5];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			
//			
//			
//		}
//		System.out.println(arr[0] + arr[2]);
		
		
		
		
		String[] arr2 = new String[3];
		
		for (int i = 0; i < arr2.length; i++) {
			
			arr2[i] = sc.nextLine(); 
			
		}
		
		System.out.println(arr2[0] + " 보다는 " + arr2[1]);
		
		
		sc.close();
			
	}

}
