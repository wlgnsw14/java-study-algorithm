package 제일작은수제거하기;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
            	System.out.println("num = "+num);
                min = num;
            }
        }
        System.out.println("min = "+min);
        
        int cnt = 0;
        for (int num : arr) {
            if (num != min) {
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];
        int idx = 0;
        for (int num : arr) {
            if (num != min) {
            	answer[idx++] = num;
            }
        }
        
        return answer;
    }
}

