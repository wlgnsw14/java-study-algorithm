package ¦���������ϱ�;

import java.util.Stack;

public class Solution {
	public int solution(String s){
		String[] strArr = s.split("");
        Stack<String> stack = new Stack<>();

        for (String str : strArr) {
            if (!stack.isEmpty() && stack.peek().equals(str)) {
                stack.pop();
                System.out.println("pop�� ���� : "+stack);
            } else {
                stack.push(str);
                System.out.println("push�� ���� : "+stack);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
