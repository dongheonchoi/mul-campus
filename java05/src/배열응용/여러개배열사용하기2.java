package 배열응용;

public class 여러개배열사용하기2 {
	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		int count1 = 0;
		int count2 = 0;

		
		
		int sum1 = 0;
		int sum2 = 0;
		
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count1++;
			}else if (term1[i] == term2[i]) {
				count2++;
			}
			
			if (term2[i] == 100) {
				System.out.println("번호: "+ i+1 + "이름: " + names[i]);
			}
		
			
		}
		
		System.out.println("2학기에 성적이 오른 학생수는 " + count1 + "명입니다.");
		System.out.println("1,2학기 성적이 같은 학생수는 " + count2 + "명입니다.");
		
		
		
		
		for (int i = 0; i < term2.length; i++) {
			sum1 = sum1 + term1[i];
			sum2 = sum2 + term2[i];
		}
		
		if (sum1 > sum2) {
			System.out.println((double)sum1/5 + "로 1학기 성적이 높습니다");
		}else if (sum1 < sum2) {
			System.out.println((double)sum2/5 + "로 2학기 성적이 높습니다");
		}else {
			System.out.println((double)sum1/5 + "로 두학기의 성적은 동일합니다.");
		}
		
		
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println(names[i] + "의 1학기 성적은" + term1[i] + "이고 2학기의 성적은 "+ term2[i] +"입니다." );
			}
		}
		
		
		
		
		
		
	}
}
