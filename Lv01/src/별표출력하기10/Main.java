package ��ǥ����ϱ�10;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String answer = "";
		
		int n = 3;
		int even = 1;
		int odd = 1;
		
		for (int i = 1; i <= n; i++) {
			if(i%2==0) {
				// ¦�� (--)
				for (int j = even; j <= n; j++) {
					System.out.print("*"+" ");
				}
				even++;
				System.out.println(" ");
			}else {
				// Ȧ�� (++)
				for (int k = 1; k <= odd; k++) {
					System.out.print("*"+" ");
				}
				odd++;
				System.out.println(" ");
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if(n%2==1) {
				if(i%2==0) {
					// ¦�� (--)
					even--;
					for (int j = even; j <= n; j++) {
						System.out.print("*"+" ");
					}
					System.out.println(" ");
				}else {
					// Ȧ�� (++)
					odd--;
					for (int k = 1; k <= odd; k++) {
						System.out.print("*"+" ");
					}
					
					System.out.println(" ");
				}
			}else {
				if(i%2==0) {
					// ¦�� (--)
					odd--;
					for (int k = 1; k <= odd; k++) {
						System.out.print("*"+" ");
					}
					
					System.out.println(" ");
				}else {
					// Ȧ�� (++)
					even--;
					for (int j = even; j <= n; j++) {
						System.out.print("*"+" ");
					}
					System.out.println(" ");
				}
			}
		}
		
		
		
		// answer = sol.solution(3);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("����");
		System.out.println("*"+" ");
		System.out.println("*"+" "+"*"+" "+"*"+" ");
		System.out.println("*"+" "+"*"+" ");
		System.out.println("*"+" "+"*"+" ");
		System.out.println("*"+" "+"*"+" "+"*"+" ");
		System.out.println("*"+" ");
	}

}
