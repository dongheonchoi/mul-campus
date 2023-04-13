package 컬렉션;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class 속도비교2 {

	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();
		/*
		 * Timer t = new Timer(); TimerTask t2 = new TimerTask() { int count = 0;
		 * 
		 * @Override public void run() { if (count < 10) { System.out.println("끝" +
		 * count); count++; }else { t.cancel(); } } }; t.schedule(t2, 1/10 , 1);
		 */
		
		String[] s1 = new String[50000];
		String[] s2 = new String[50000];
		
		for (int i = 0; i < s2.length; i++) {
			s1[i] = "str" + i;
			s2[i] = "str" + i;
		}
		
		int answer = 0;
		
		List<String> s11 = Arrays.asList(s1);
        List<String> s22 = Arrays.asList(s2);
        
        
        for(int i = 0; i < s1.length; i++){
            if(s22.contains(s11.get(i))) answer++;
        }
        
        System.out.println(answer);
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("시간차이(ms) : "+secDiffTime);
		
	}

}
