package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			if (i % 2 != 0) {
				continue;
			}else if (i == 8) {
			//	break;
				System.exit(0); //0: 정상종료
								//0이 아닌 값 비정상종료
			}
			System.out.println(i);
		}
		System.out.println("종료 되었습니다");
	}

}
