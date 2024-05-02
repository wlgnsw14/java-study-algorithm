package 짝지어제거하기;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int answer = 0;
		
		answer = sol.solution("baabaa");
		System.out.println("1=="+answer);
		
		answer = sol.solution("cdcd");
		System.out.println("0=="+answer);
	}

}
