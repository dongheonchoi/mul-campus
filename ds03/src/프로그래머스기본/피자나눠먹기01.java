package 프로그래머스기본;
public class 피자나눠먹기01 {

}
////////////////////////////////////////////////////
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(i * 6 % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}