package ���ڿ��ٷ��⺻;

public class Solution {
	public boolean solution(String s) {
        return !s.matches(".*[a-zA-Z]+.*") && (s.length()==4 || s.length()==6) ? true : false;
    }
}
