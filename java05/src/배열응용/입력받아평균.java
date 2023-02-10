package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		//입력을 여러번 여러개 받아서 저장공간에 넣고 싶을때 배열 사용
		
		
		int[] jumsu = new int[5];
		
		
		
		for (int i = 0; i < jumsu.length; i++) {
			
			String data = JOptionPane.showInputDialog("숫자를 입력하세여");
			
			jumsu[i] = Integer.parseInt(data);
			
			
		}
		for (int i : jumsu) {
			System.out.print(i + " ");
		}
		int sum = 0; 
		for (int i : jumsu) {
			sum = sum + i; 
		}
		System.out.println("");
		System.out.println("전체 평균 : " + ((double)sum / jumsu.length));

		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.println(i);
			}
		}
		
			
		int max = 0;
		int min = jumsu[0];
		
		for (int j = 0; j < jumsu.length; j++) {
			
			if (jumsu[j] > max ) {
				max = jumsu[j];
			}
			
		for (int j2 = 0; j2 < jumsu.length; j2++) {
			if (jumsu[j2] < min ) {
				min = jumsu[j2];
			}
		}
			
			
		} 
				
		System.out.println("최대값은 " + max);	
		System.out.println("최소값은 " + min);	
			
	}

}
