package 숫자의표현;

public class Solution {
	public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int oper = 0;
            for (int j = i; j <= n; j++) {
                oper += j;
                if (oper == n) {
                    answer++;
                    break;
                } else if (oper > n) {
                    break;
                }
            }
        }
        
        return answer;
    }
}
