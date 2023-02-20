package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 컬렉션확인문제 {

	public static void main(String[] args) {
		HashSet tourList = new HashSet();
		
		tourList.add("미국");
		tourList.add("중국");
		tourList.add("입본");
		tourList.add("스페인");
		tourList.add("이탈리아");
		
		System.out.println(tourList);
		
		
		HashMap home = new HashMap();
		
		home.put("안방", "TV");
		home.put("거실", "쇼파");
		home.put("부엌", "냉장고");
		home.put("현관", "신발");
		
		System.out.println(home);
		System.out.println(home.get("현관"));
		
		
		
		home.replace("거실", "책상");
		System.out.println(home);
		
		
		
		
		ArrayList today = new ArrayList();
		
		today.add("설겆이");
		today.add("방청소");
		today.add("공부");
		today.add("유튜브");
		today.add("잠");
		
		System.out.println(today);
		
		System.out.println(today.get(0));
		System.out.println(today.get(today.size()-1));
		
		today.set(1, "청소");
		System.out.println(today);

		
		
		
	}

}
