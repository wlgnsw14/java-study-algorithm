package 다음큰숫자;

public class Solution {
	public int solution(int n) {
		// 효율성 테스트 초과
//        int answer = 0;
//        int numBinaryCnt = 0;
//        int binaryCnt = 0;
//        String numBinaryStr = Integer.toBinaryString(n);
//        String[] numBinaryArr = numBinaryStr.split("");
//        for (String str : numBinaryArr) {
//			if(str.equals("1")) {
//				numBinaryCnt++;
//			}
//		}
//        for (int i = n+1; i < 1000000; i++) {
//        	binaryCnt = 0;
//        	String binaryStr = Integer.toBinaryString(i);
//        	String[] binaryArr = binaryStr.split("");
//        	for (String s : binaryArr) {
//    			if(s.equals("1")) {
//    				binaryCnt++;
//    			}
//    		}
//        	if(numBinaryCnt == binaryCnt) {
//        		answer = i;
//        		break;
//        	}
//		}
//        return answer;
		
		int count = Integer.bitCount(n);
		
		while(true) {
			n++;
			if(count == Integer.bitCount(n)) {
				return n;
			}
		}
    }
}
