package Çà·ÄÀÇµ¡¼À;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int[][] answer = {};
		
		answer = sol.solution(new int[][] {{1,2},{2,3}}, new int[][] {{3,4},{5,6}});
		System.out.println("[[4,6],[7,9]]=="+Arrays.toString(answer));
		
		answer = sol.solution(new int[][] {{1},{2}}, new int[][] {{3},{4}});
		System.out.println("[[4],[6]]=="+Arrays.toString(answer));
	}

}
