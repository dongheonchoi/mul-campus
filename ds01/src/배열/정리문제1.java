package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 정리문제1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		int temp = num[0];
		for (int i = 0; i < num.length; i++) {
			if (temp > num[i]) {
				temp = num[i];
			}
		}
		System.out.println(temp);
		
		br.close();
	}

}
