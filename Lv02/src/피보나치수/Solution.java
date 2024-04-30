package 피보나치수;

public class Solution {
	public int solution(int n) {
        int answer = 0;
        
        int[] fivo = new int [n+1];
        fivo[0] = 0;
        fivo[1] = 1;
        
        for (int i = 2; i <= n; i++) {
			fivo[i] = (fivo[i-2]%1234567) + (fivo[i-1]%1234567);
			answer = fivo[n];
		}
        return answer%1234567;
    }
}
