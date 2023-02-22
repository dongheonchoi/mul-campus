package 형변환;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.BoldAction;

public class 형변환확인문제 {

	public static void main(String[] args) {

		
		ArrayList me = new ArrayList();
		
		me.add(1000);//Object <-업캐스팅- Integer <-오토박싱- int
		me.add(189.1);//Object <- Double <- double
		me.add(false);//Object <- Boolean <- boolean
		me.add('남');//Object <- Character <- char
	
		System.out.println(me);
		int money = (int)me.get(0);  //int <-오토언박싱- Integer <-다운캐스팅- Object
		double height = (double)me.get(1);//double <- Double <- Object
		boolean food = (boolean)me.get(2);//boolean <- Boolean <- Object
		char gender = (char)me.get(3); //char <- Character <- Object
		
		
		
		System.out.println(money + 2000);
		System.out.println(height + 10);
		
		
		if (food) { // (조건) : 조건이  true이면
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");
		}
		
		
		if (gender == '남') {
			System.out.println("주민번호는 1, 3이예요");
		}else {
			System.out.println("주민번호는 2, 4예요");
		}
		
		
		
		
	}

}
