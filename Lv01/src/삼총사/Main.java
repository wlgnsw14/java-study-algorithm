package ªÔ√—ªÁ;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int answer = 0;
		
		answer = sol.solution(new int[] {-2, 3, 0, 2, -5});
		System.out.println("2=="+answer);
		
		answer = sol.solution(new int[] {-3, -2, -1, 0, 1, 2, 3});
		System.out.println("5=="+answer);
		
		answer = sol.solution(new int[] {-1, 1, -1, 1});
		System.out.println("0=="+answer);
	}

}
