package ±Ö°í¸£±â;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
	public int solution(int k, int[] tangerine) {
        int answer = 0;
        int num = 0;
        int oper = 0;
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(tangerine);
        for (int i = 0; i < tangerine.length; i++) {
        	if(i == tangerine.length-1) {
				if(tangerine[i] == tangerine[i-1]) {
					num ++;
					list.add(num);
				}else if(tangerine[i] != tangerine[i-1]) {
					num = 1;
					list.add(num);
				}
			}else {
				if(tangerine[i] == tangerine[i+1]) {
					num ++;
				}else if(tangerine[i] != tangerine[i+1]) {
					num ++;
					list.add(num);
					num = 0;
				}
			}
		}
        Collections.sort(list);
        Collections.reverse(list);
        for (Integer n : list) {
			oper += n;
			answer ++;
			if(oper >= k) {
				break;
			}
		}
        return answer;
    }
}
