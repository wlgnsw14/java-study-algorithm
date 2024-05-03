package ¿Ã¹Ù¸¥°ýÈ£;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		boolean answer = false;
		
		answer = sol.solution("()()");
		System.out.println("true=="+answer);
		
		answer = sol.solution("(())()");
		System.out.println("true=="+answer);
		
		answer = sol.solution(")()(");
		System.out.println("false=="+answer);
		
		answer = sol.solution("(()(");
		System.out.println("false=="+answer);
	}

}
