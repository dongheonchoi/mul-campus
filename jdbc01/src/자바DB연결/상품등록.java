package 자바DB연결;

import java.util.Scanner;

import 화면DB연결.ProductVO;

public class 상품등록 {

	public static void main(String[] args) {
		//win6실행
		Scanner sc = new Scanner(System.in); //스캐너 생성
		System.out.println("id/name/content 순으로 입력하세요"); //문장 출력	
		
		String id = sc.next(); 
		String name = sc.next(); 
		String content = sc.next(); 
		
		
		//1. 가방을 만들기
		ProductVO bag = new ProductVO();
		
		//2. 가방에 데이터를 넣기
		bag.setId(id);
		bag.setName(name);
		bag.setContent(content);
		
		//3. 가방을 전달
		ProductDAO dao = new ProductDAO();
		dao.insert(bag);
		
		
	}

}
