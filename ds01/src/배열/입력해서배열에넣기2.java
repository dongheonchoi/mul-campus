package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] numbers = new double[5];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble();
		}
		sc.close();
		for (double x : numbers) {
			System.out.println(x);
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				System.out.println(22.2 +"는 " + (i + 1) + "번째에 있습니다");
			}else if (numbers[i] == 33.3) {
				System.out.println(33.3 +"는 " + (i + 1) + "번째에 있습니다");
			}
		}

	}

}
