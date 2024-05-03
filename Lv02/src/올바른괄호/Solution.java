package 올바른괄호;

import java.util.LinkedList;

public class Solution {
	boolean solution(String s) {
		// 효율성에서 문제
//        boolean answer = false;
//        Stack<String> stack = new Stack<String>();
//        String[] split = s.split("");
//        
//        for (String str : split) {
//			if(!stack.isEmpty() && str.equals(")") && stack.peek().equals("(")) {
//				stack.pop();
//				System.out.println("pop에 들어온 : "+stack);
//			}else {
//				stack.push(str);
//				System.out.println("push에 들어온 : "+stack);
//			}
//		}
//        
//        return stack.isEmpty() ? true : false;
		
		
		// char가 효율성측면에서 좋다.
		boolean answer = false;
		LinkedList<Character> list = new LinkedList<>();
		
		for (char str : s.toCharArray()) {
			if(str == '(') { // char 비교연산시 '' 주의
				list.add(str);
			}else {
				if(list.isEmpty()) return false;
				list.pollLast();
			}
		}
				
		return list.isEmpty();
    }
}
