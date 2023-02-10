package 배열응용;

public class familyarray {

	public static void main(String[] args) {

		String[] fam = { "아버지", "어머니", "누나", "나" };
		int[] age = { 58, 54, 30, 28 };
		double[] height = { 178, 160, 168, 172 };
		
		
		
		System.out.println("이름\t나이\t키");
		System.out.println("----------------------------------");
		
		
		for (int i = 0; i < 4; i++) {
			System.out.println(fam[i] + "\t" + age[i] + "\t" + height[i]);
			
		}

	
	
	}

}
