package º°Ç¥Ãâ·ÂÇÏ±â10;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String answer = "";
		
		int n = 4;
		int cnt = 1;
		int num = 1;
		
		for (int i = 1; i <= n; i++) {
			if(i%2==0) {
				// Â¦¼ö (--)
				for (int j = num; j <= n; j++) {
					System.out.print("*"+" ");
				}
				System.out.println("num++");
				num++;
				System.out.println(" ");
			}else {
				// È¦¼ö (++)
				for (int k = 1; k <= cnt; k++) {
					System.out.print("*"+" ");
				}
				System.out.println("cnt++");
				cnt++;
				System.out.println(" ");
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if(i%2==1) {
				// Â¦¼ö (--)
				for (int j = num; j <= n; j++) {
					System.out.print("*"+" ");
				}
				num--;
				System.out.println(" ");
			}else {
				// È¦¼ö (++)
				for (int k = 1; k <= cnt; k++) {
					System.out.print("*"+" ");
				}
				cnt--;
				System.out.println(" ");
			}
		}
		
		
		
		// answer = sol.solution(3);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Á¤´ä");
		System.out.println("*"+" ");
		System.out.println("*"+" "+"*"+" "+"*"+" ");
		System.out.println("*"+" "+"*"+" ");
		System.out.println("*"+" "+"*"+" ");
		System.out.println("*"+" "+"*"+" "+"*"+" ");
		System.out.println("*"+" ");
	}

}
