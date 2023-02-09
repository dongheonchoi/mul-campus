package 배열;

public class 배열다루기 {

	public static void main(String[] args) {

		int[] x = new int[5];
		System.out.println(x.length);
		x[0] = 100;
		System.out.println(x[0]);
		x[4] = 500;
		System.out.println(x[4]);
		x[2] = 200;
		System.out.println(x[2]);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < x.length; i++) {
			System.out.println(i+ ":" + x[i]+" ");
		}
		
		
		
	}

}
