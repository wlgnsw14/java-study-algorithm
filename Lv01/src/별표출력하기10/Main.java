package ��ǥ����ϱ�10;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String answer = "";
		
		int n = 4;
		int cnt = 1;
		int num = 1;
		
		for (int i = 1; i <= n; i++) {
			if(i%2==0) {
				// ¦�� (--)
				for (int j = num; j <= n; j++) {
					System.out.print("*"+" ");
				}
				System.out.println("num++");
				num++;
				System.out.println(" ");
			}else {
				// Ȧ�� (++)
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
				// ¦�� (--)
				for (int j = num; j <= n; j++) {
					System.out.print("*"+" ");
				}
				num--;
				System.out.println(" ");
			}else {
				// Ȧ�� (++)
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
		System.out.println("����");
		System.out.println("*"+" ");
		System.out.println("*"+" "+"*"+" "+"*"+" ");
		System.out.println("*"+" "+"*"+" ");
		System.out.println("*"+" "+"*"+" ");
		System.out.println("*"+" "+"*"+" "+"*"+" ");
		System.out.println("*"+" ");
	}

}
