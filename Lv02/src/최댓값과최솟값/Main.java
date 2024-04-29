package ÃÖ´ñ°ª°úÃÖ¼Ú°ª;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String answer = "";
		
		answer = sol.solution("1 2 3 4");
		System.out.println("1 4=="+answer);
		
		answer = sol.solution("-1 -2 -3 -4");
		System.out.println("-4 -1=="+answer);
		
		answer = sol.solution("-1 -1");
		System.out.println("-1 -1=="+answer);
	}

}
