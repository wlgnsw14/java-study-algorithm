package 귤고르기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
//	public int solution(int k, int[] tangerine) {
//        int answer = 0;
//        int num = 0;
//        int oper = 0;
//        List<Integer> list = new ArrayList<Integer>();
//        Arrays.sort(tangerine);
//        for (int i = 0; i < tangerine.length; i++) {
//        	if(i == tangerine.length-1) {
//				if(tangerine[i] == tangerine[i-1]) {
//					num ++;
//					list.add(num);
//				}else if(tangerine[i] != tangerine[i-1]) {
//					num = 1;
//					list.add(num);
//				}
//			}else {
//				if(tangerine[i] == tangerine[i+1]) {
//					num ++;
//				}else if(tangerine[i] != tangerine[i+1]) {
//					num ++;
//					list.add(num);
//					num = 0;
//				}
//			}
//		}
//        Collections.sort(list, Collections.reverseOrder());
//        for (Integer n : list) {
//			oper += n;
//			answer ++;
//			if(oper >= k) {
//				break;
//			}
//		}
//        return answer;
//    }
	
	public int solution(int k, int[] tangerine) {
        int answer = 0;
        // 귤종류는 10^5, 원소갯수는 10^7
        // 아이디어1 : hashmap으로 저장하고 해당 hashmap의 value들을 int로 만들것 그 뒤 array.sort
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: tangerine){
            if(map.get(i) != null){
                 map.put(i,map.get(i)+1);
            }else{
                 map.put(i,1);
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (Integer value : map.values()) {
            arr.add(value);
        }

        Collections.sort(arr,Collections.reverseOrder());
        for(Integer a : arr){
            // System.out.println(a);
            answer++;
            k = k - a;
            if((k) <= 0){
                break;
            }
        }

        return answer;
    }
}
