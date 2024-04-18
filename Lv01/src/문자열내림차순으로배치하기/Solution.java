package 문자열내림차순으로배치하기;

import java.util.Arrays;

public class Solution {
	public String solution(String s) {
		// for문으로 뒤집는 방법
//        char[] charArr = s.toCharArray();
//        Arrays.sort(charArr);
//        for (int i = 0; i < charArr.length / 2; i++) {
//            char str = charArr[i];
//            charArr[i] = charArr[charArr.length - 1 - i];
//            charArr[charArr.length - 1 - i] = str;
//        }
//        return new String(charArr);
        
		// StringBuilder reverse로 뒤집는 방법
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        String str = new String(charArr);
        
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String answer = sb.toString();
        return answer;
    }
}
