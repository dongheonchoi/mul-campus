package 배열;

import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class 랜덤배열최대값2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(100);
		
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(1000);
		}
		
		int temp = numbers[0]; 
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > temp) {
				temp = numbers[i];
			}
		}
		
		System.out.println(temp);
		
		
	}
	
}
