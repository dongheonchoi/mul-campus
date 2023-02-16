package 생성자;

public class 나의일지 {

	public static void main(String[] args) {
		//총 12개의 변수가 다이나믹 생성, 멤버변수 ==> 객체생성 할때마다 다이나믹하게 무더기영역에 생긴 변수
		//인스턴스 변수라고 부른다.
		
		Day day1 = new Day("자바공부", 8, "수원");
		System.out.println(day1);
		System.out.println(Day.count);
		Day day2 = new Day("산책", 1, "호수공원");
		System.out.println(day2);
		System.out.println(Day.count);
		Day day3 = new Day("시험요약정리", 2, "자취방");
		System.out.println(day3);
		System.out.println(Day.count);
		
		System.out.println(Day.sum);
	}

}
