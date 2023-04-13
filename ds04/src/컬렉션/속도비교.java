package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class 속도비교 {

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
        for(int i = 0; i < s1.length; i++){
            for(int j = 0; j<s2.length; j++){
                if(s1[i].equals(s2[j])) {
                	answer++;
                	break;
                }
            }
        }
        
       System.out.println(answer);
       long afterTime = System.currentTimeMillis();
       long secDiffTime = (afterTime - beforeTime);
       System.out.println("시간차이(ms) : "+secDiffTime);
	}

}
