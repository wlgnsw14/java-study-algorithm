package 문자열다루기기본;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		boolean answer = false;
		
		answer = sol.solution("a234");
		System.out.println("false=="+answer);
		
		answer = sol.solution("1234");
		System.out.println("true=="+answer);
		
	}

}
