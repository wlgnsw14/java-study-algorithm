package ���ڿ������������ι�ġ�ϱ�;

import java.util.Arrays;

public class Solution {
	public String solution(String s) {
		// for������ ������ ���
//        char[] charArr = s.toCharArray();
//        Arrays.sort(charArr);
//        for (int i = 0; i < charArr.length / 2; i++) {
//            char str = charArr[i];
//            charArr[i] = charArr[charArr.length - 1 - i];
//            charArr[charArr.length - 1 - i] = str;
//        }
//        return new String(charArr);
        
		// StringBuilder reverse�� ������ ���
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        String str = new String(charArr);
        
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String answer = sb.toString();
        return answer;
    }
}
