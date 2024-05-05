package 이진변환반복하기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] answer = {};
		
		answer = sol.solution("110010101001");
		System.out.println("[3,8]=="+Arrays.toString(answer));
		
		answer = sol.solution("01110");
		System.out.println("[3,3]=="+Arrays.toString(answer));
		
		answer = sol.solution("1111111");
		System.out.println("[4,1]=="+Arrays.toString(answer));
	}

}
