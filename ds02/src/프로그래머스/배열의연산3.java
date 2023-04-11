package 프로그래머스;

import java.util.Arrays;

public class 배열의연산3 {

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		int[] numbers = {1, 2, -3, 4, -5};
		Arrays.sort(numbers);
		
		int answer = sol.solution(numbers); // int[]
		
		System.out.println(answer);
	}
}

class Solution5 {
	public int solution(int[] numbers) {
		int answer = numbers[0]*numbers[1];
		if (numbers[0]*numbers[1] < numbers[numbers.length-1]*numbers[numbers.length-2]) {
			answer = numbers[numbers.length-1]*numbers[numbers.length-2];
		}
		return answer;
	}
}