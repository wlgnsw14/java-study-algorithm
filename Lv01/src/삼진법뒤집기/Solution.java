package 삼진법뒤집기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	public int solution(int n) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        
        while (n > 0) {
			list.add(n%3);
			n /= 3;
		}
        Collections.reverse(list);
        
        int pow = 1;
        for (int num : list) {
            answer += num * pow;
            pow *= 3;
        }
        
        return answer;
    }
}
