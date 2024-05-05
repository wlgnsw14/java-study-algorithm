package 이진변환반복하기;

import java.util.Arrays;

public class Solution {
	
	static int[] answer = new int[2];
    public int[] solution(String s) {

        answer[0] = 0;
        answer[1] = 0;
        forEachBin(s);

        return answer;
    }

    private static String forEachBin(String bin){
        if(bin.equals("1"))
            return "";

        String[] strArr = bin.split("0");
        System.out.println("strArr : "+Arrays.toString(strArr));
        String[] str0Arr = bin.split("1");
        System.out.println("str0Arr : "+Arrays.toString(str0Arr));
        String strLen = "";
        String str0Len = "";
        

        for(String str : str0Arr) //제거된 0의 개수 길이 구하기
            str0Len += str;
        
        for(String str : strArr) // 1로 이루어진 길이
            strLen += str;
        
        System.out.println("strLen : "+strLen);
        System.out.println("str0Len : "+str0Len);

        bin = Integer.toBinaryString(strLen.length()); // 이진 변환 결과

        answer[1] += str0Len.length(); // 답에 0의 개수 더하기
        answer[0]++; // n 번 이진 변환 횟수

        return forEachBin(bin);
    }
}
