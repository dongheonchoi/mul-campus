package 컬렉션;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		String[] s = {"apple","banana","apple","banana","melon","apple"};
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String key : s) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
		System.out.println(map);
		int maxValue = 0;
		String maxKey = "";
		for (String key : map.keySet()) {
			//System.out.println(map.get(key));
			if(map.get(key) > maxValue) {
				maxValue = map.get(key);
				maxKey = key;
			}
		}
		System.out.println(maxKey + "의 득표수는 " + maxValue);
		System.out.println(map.keySet());
	
	}

}
