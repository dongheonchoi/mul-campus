package 컬렉션;
import java.util.Arrays;
import java.util.List;

public class 배열과컬렉션변환2 {

	public static void main(String[] args) {
		String[] 냉장고음식 = {"감자","고구마","우유","감자","양파"} ;
		
		List<String> 냉장고2 = Arrays.asList(냉장고음식);
		
		냉장고2.lastIndexOf("감자");
		
		System.out.println(Arrays.toString(냉장고음식));
		if (냉장고2.contains("양파")) {
			System.out.println("양파는 안사도 된다.");
		}else {
			System.out.println("양파사서 냉장고에 넣어야 한다.");
		}
		
		냉장고2.set(냉장고2.indexOf("우유"), "춘식이우유");
		System.out.println(Arrays.toString(냉장고음식));
		System.out.println(냉장고2);
		
		냉장고2.set(냉장고2.indexOf("양파"), "양파즙");
		System.out.println(Arrays.toString(냉장고음식));
		
		System.out.println(냉장고2);
		
		//String[]냉장고음식2 = (String[])냉장고2.toArray();
		//System.out.println(Arrays.toString(냉장고음식2));
		//굳이 해줄 필요없다.
	
	}
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
	
}