package problem;


public class problem4 {

	public static void main(String[] args) {
		
		String no = "A100EX";
		
		char code = no.charAt(0);
		
		if (code == 'A') {
			System.out.println("기획부");
		}else if (code == 'B') {
			System.out.println("총무부");
		}else if (code == 'C') {
			System.out.println("개발부");
		}else {
			System.out.println("해당부서 없음");
		}

	}

}
