package ������ȯ�ݺ��ϱ�;

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
        

        for(String str : str0Arr) //���ŵ� 0�� ���� ���� ���ϱ�
            str0Len += str;
        
        for(String str : strArr) // 1�� �̷���� ����
            strLen += str;
        
        System.out.println("strLen : "+strLen);
        System.out.println("str0Len : "+str0Len);

        bin = Integer.toBinaryString(strLen.length()); // ���� ��ȯ ���

        answer[1] += str0Len.length(); // �信 0�� ���� ���ϱ�
        answer[0]++; // n �� ���� ��ȯ Ƚ��

        return forEachBin(bin);
    }
}
