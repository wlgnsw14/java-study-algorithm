package Ä«Æê;

public class Solution {
	public int[] solution(int brown, int yellow) {
        int x=1;
        while(true){
        	System.out.println("x : "+x);
            int y = (brown/2)-x+2;
            if(x*y-brown==yellow){
                return new int[]{y,x};
            }
            x++;
        }
    }
}
