package JadenCase문자열만들기;

public class Solution {
	public String solution(String s) {
//        String str = s.toLowerCase();
//        String[] arr = str.split("");
//        String answer = "";
//        
//        for (int i = 0; i < arr.length; i++) {
//        	if(i == 0) {
//        		arr[0] = arr[0].toUpperCase();
//        	}
//			if(arr[i].equals(" ")) {
//				arr[i+1] = arr[i+1].toUpperCase();
//			}
//		}
//        StringBuilder sb = new StringBuilder();
//        for (Object obj : arr) {
//            sb.append(obj);
//        }
//        
//        for (String x : arr) {
//        	answer += x;
//		}
		
		String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }
}
