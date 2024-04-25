package ±Ö°í¸£±â;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int answer = 0;
		
		answer = sol.solution(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3});
		System.out.println("3=="+answer);
		
		answer = sol.solution(4, new int[] {1, 3, 2, 5, 4, 5, 2, 3});
		System.out.println("2=="+answer);
		
		answer = sol.solution(2, new int[] {1, 1, 1, 1, 2, 2, 2, 3});
		System.out.println("1=="+answer);
	}

}
