package 짝지어제거하기;

import java.util.Stack;

public class Solution {
	public int solution(String s){
		String[] strArr = s.split("");
        Stack<String> stack = new Stack<>();

        for (String str : strArr) {
            if (!stack.isEmpty() && stack.peek().equals(str)) {
                stack.pop();
                System.out.println("pop에 들어온 : "+stack);
            } else {
                stack.push(str);
                System.out.println("push에 들어온 : "+stack);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
