package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import javax.swing.JOptionPane;

public class 반환값받아오기 {

	public static void main(String[] args) {
//		전화기 tel = 전화기();
//		tel.인터넷하다();
//		tel.전화통화하다();
		반환값연습 re = new 반환값연습(); //메서드 12개
		re.add2(); //void
		
		int result1 = re.add(200, 100); // int 300
		System.out.println("더한 값은 " + result1);
		
		
//		String data = JOptionPane.showInputDialog("입력"); //aaa입력시 data aaa저장
//		String data2 = JOptionPane.showMessageDialog(null, "출력갑"); //에러 발생 showmessagedialog는 void
		
		double result2 = re.add(22.1 ,10);
		System.out.println("더한 값은 " + result2);
		
		String result3 = re.add("잠이", "온다");
		System.out.println("더한 값은 " + result3);
		
		String result4 = re.add(1, "시간 잤다");
		System.out.println("더한 값은 " + result4);
		
		int[] result5 = re.add(); //{1, 2, 3} 
		result5[0] = 100;
		System.out.println(result5[0]);
		System.out.println(result5[1]);
		System.out.println(result5[2]);
		
		Date result6 = re.getDate();
		System.out.println(result6.getMinutes());
		System.out.println(result6.getSeconds());
		//요일 0: 일요일, 1: 월요일
		System.out.println(result6.getDay());
		//==> 리턴이 없는 값은 프린트 불가!!
		//==> result6.getMinutes()는 리턴이 있어서 프린트 가능
		
		int result7 = re.getHour();
		System.out.println(result7 + "시 입니다. 수업중.");
		
		int result8 = re.getRandom2();
		System.out.println("랜덤 정수 " + result8);
		
		ArrayList result9 = re.getList();
		System.out.println(result9.get(0));
		result9.set(0, "양파");
		System.out.println(result9);

//		System.out.println(result9.get(0).getClass().getName());
//		String str = result9.get(0);
		
		
		
		HashSet result10 = re.getSet();
		System.out.println(result10);
		
		
		
	}

}
