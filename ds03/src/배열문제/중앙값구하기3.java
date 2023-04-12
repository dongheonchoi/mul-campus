package 배열문제;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class 중앙값구하기3 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		System.out.println(arr.get(0));
		System.out.println(arr.size());
		
		Integer[] intA = arr.toArray(new Integer[0]);
		
	}

}