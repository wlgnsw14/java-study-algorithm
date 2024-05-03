package �ùٸ���ȣ;

import java.util.LinkedList;

public class Solution {
	boolean solution(String s) {
		// ȿ�������� ����
//        boolean answer = false;
//        Stack<String> stack = new Stack<String>();
//        String[] split = s.split("");
//        
//        for (String str : split) {
//			if(!stack.isEmpty() && str.equals(")") && stack.peek().equals("(")) {
//				stack.pop();
//				System.out.println("pop�� ���� : "+stack);
//			}else {
//				stack.push(str);
//				System.out.println("push�� ���� : "+stack);
//			}
//		}
//        
//        return stack.isEmpty() ? true : false;
		
		
		// char�� ȿ�������鿡�� ����.
		boolean answer = false;
		LinkedList<Character> list = new LinkedList<>();
		
		for (char str : s.toCharArray()) {
			if(str == '(') { // char �񱳿���� '' ����
				list.add(str);
			}else {
				if(list.isEmpty()) return false;
				list.pollLast();
			}
		}
				
		return list.isEmpty();
    }
}
