package Â¦¼ö´Â½È¾î¿ä;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int[] answer = {};
		
		answer = sol.solution(10);
		System.out.println("[1,3,5,7,9]="+Arrays.toString(answer));
		
		answer = sol.solution(15);
		System.out.println("[1,3,5,7,9,11,13,15]="+Arrays.toString(answer));
		
	}

}
