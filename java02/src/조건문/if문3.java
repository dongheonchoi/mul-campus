package 조건문;

public class if문3 {

	public static void main(String[] args) {

		int myNum = 99;

		if (myNum > 80) {
			System.out.println("최우수");
		} else if (myNum > 70) {
			System.out.println("우수");
		} else if (myNum > 60) {
			System.out.println("보통");
		} else {
			System.out.println("미달");
		}

		int myTour = 10;
			
		switch (myTour) {
		case 10:
			System.out.println("vvip");
			break;

		case 6:
			System.out.println("vip");
			break;

		default:
			System.out.println("Normal");
			break;
		}
		
		
		


	}
}
