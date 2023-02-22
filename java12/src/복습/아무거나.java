package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class 아무거나 {

	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		list.add("홍길동"); //object <- String (자동형변환)
		list.add(100); 
		list.add(11.22); 
		list.add(new JButton());
		 
		 
		String name = (String)list.get(0);
	
		int age = (Integer)list.get(1);
	
	
	}

}
