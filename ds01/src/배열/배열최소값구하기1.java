package 배열;

public class 배열최소값구하기1 {

	public static void main(String[] args) {
		int[] s = {90, 80, 20, 60, 70};
		int temp = s[0];
		
		for (int X : s) {
			if (X < temp) {
				temp = X;
			}
		}
		System.out.println(temp);
	}

}
