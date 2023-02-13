package 배열복습;

import java.util.Random;

public class 배열정렬 {

	public static void main(String[] args) {
		//입력: 많은 양의 저장공간 (배열, 2개)
		//    배열 하나당 990개의 저장공간 필요 
		//    ==>실제생성된 저장공간개수(990+1+)*2
		//	   랜덤으로 데이터를 입력(Random)
		//    반복문으로 배열 위치를 옮기면서 데이터를 넣자
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
		
		Random r = new Random();
		
		for (int i = 0; i < 내답안.length; i++) {
			답안지[i] = r.nextInt(4)+1;
			내답안[i] = r.nextInt(4)+1;
			
		}
		
		System.out.println("번호\t:\t 답안\t\t 내답");
		System.out.println("-----------------------------------");
		for (int j = 0; j < 내답안.length; j++) {
			System.out.println(j + "\t:\t" + 답안지[j] + "\t<->\t" + 내답안[j]);			
		}
		
		
		//처리: 
		//두 배열의 같은 인덱스가 같은 문앙을 비교
		//동일하면 1점씩 획득
		int jumsu = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (내답안[i] == 답안지 [i]) {
				jumsu++;
			}
		}
		System.out.println("토익점수는 " + jumsu + "점");
		
		
		
		//출력
		
		
		
		
		
	}

}
