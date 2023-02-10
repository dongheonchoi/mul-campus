package 배열기본;

public class 많은양만들어보기 {

	public static void main(String[] args) {
		
		String[] hobby = {"run", "book", "swim", "walk"};
		System.out.println(hobby);
		System.out.println("0: " + hobby[0]);
		System.out.println("1: " + hobby[1]);
		System.out.println(hobby.length);
		System.out.println(hobby[3]);
		System.out.println(hobby[hobby.length-1]);
		
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(i + ": " + hobby[i]);
		}
		
		//for-each 문 : 알아서 처음부터 인덱스를 하나씩 증가하면서 하나씩 꺼내온다.
		
		for (String x : hobby) {
			System.out.println(x);
		}
		
		
		
		String[] jobs = new String[5];
		System.out.println(jobs);
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페주인";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
		System.out.println(jobs[4]);
		
		for (String x : jobs) {
			System.out.println(x);
		}
	
	}

}
