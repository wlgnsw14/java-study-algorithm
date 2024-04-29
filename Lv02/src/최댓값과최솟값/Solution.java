package ÃÖ´ñ°ª°úÃÖ¼Ú°ª;

public class Solution {
	public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split(" ");
        
        int[] numArr = new int[strArr.length];
        
        for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(strArr[i]);
		}
        
        int max = numArr[1];
        int min = numArr[1];
        
        for (int i : numArr) {
			if(i >= max) {
				max = i;
			}
			if(i <= min) {
				min = i;
			}
		}
        answer = min+" "+max;
    
        
        return answer;
    }
}
