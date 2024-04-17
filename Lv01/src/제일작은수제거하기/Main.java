package 제일작은수제거하기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] answer = {};
		
		answer = sol.solution(new int[] {4,3,2,1});
		System.out.println("[4,3,2]=="+Arrays.toString(answer));
		
		answer = sol.solution(new int[] {10});
		System.out.println("[-1]=="+Arrays.toString(answer));
	}

}
