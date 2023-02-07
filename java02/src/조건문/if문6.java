package 조건문;

import java.util.Date;

public class if문6 {

	public static void main(String[] args) {
		//Date -  년월일시분초, java.utill.Date
		
		Date date = new Date();
		
		
		if (date.getYear() + 1900 >= 2000) {
			System.out.println("밀레니엄 세대시군요.");
		}else {
			System.out.println("밀레니엄 세대가 아니시군요.");
		}
		
		
		switch (date.getDay()) {
		case 6:		case 7:
			System.out.println("주말엔 쉽시다.");
			break;

		default:
			System.out.println("평일에는 공부를 합시다.");
			break;
		}
		
		switch (date.getMonth()+1) {
		case 2:
			System.out.println("28일까지");
			break;
		
		case 4:		case 6:		case 9: 	case 11:
			System.out.println("30일까지");
			break;
	
		default:
			System.out.println("31일까지");
			break;
		}
		
		
		
		
		
		
		
	}
}
