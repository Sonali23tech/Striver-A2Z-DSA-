//url:  https://www.naukri.com/code360/problems/number-of-digits_4538242

import java.util.* ;
import java.io.*; 





class Solution {
    static int countDigitBrute(long x) {
        int count=0;
        x = Math.abs(x);
        if(x==0)
            return 1;
        while(x>0){
            x=x/10;
            count++;
  
        }
        return count;
    }


//recursion
    static int countDigitRec(long x) {
        x = Math.abs(x);
        if(x/10==0)
            return 1;
        else
            return 1+ countDigitRec(x/10);
    }


//log10+ 1 formula
    static int countDigitLog(long x) {
        x = Math.abs(x);
        return (int)Math.floor(Math.log10((double)x))+1;
    }
}



class main {
	public static void main(String[] args) {
                Solution sol = new Solution();
		System.out.println(sol.countDigitBrute(5));
                System.out.println(sol.countDigitRec(15));
                System.out.println(sol.countDigitLog(115));
	}
}