package ����ǵ���;

public class Solution {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for (int i = 0; i < arr1[0].length; i++) {
        	for (int j = 0; j < arr1.length; j++) {
        		answer[j][i] += arr1[j][i];
        		answer[j][i] += arr2[j][i];
			}
		}
        
        return answer;
    }
}
