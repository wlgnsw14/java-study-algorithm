package 문자열다루기기본;

public class Solution {
	public boolean solution(String s) {
        return !s.matches(".*[a-zA-Z]+.*") && (s.length()==4 || s.length()==6) ? true : false;
    }
}
