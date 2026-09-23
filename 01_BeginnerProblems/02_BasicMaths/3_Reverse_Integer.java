//url: https://leetcode.com/problems/reverse-integer/

//brute force approach

class Solution {
    public int reverseBrute(int x) {
    long reversed = 0;

    while (x != 0) {
        int digit = x % 10;
        reversed = reversed * 10 + digit;
        x /= 10;

        if (reversed > Integer.MAX_VALUE ||
            reversed < Integer.MIN_VALUE) {
            return 0;
        }
    }

    return (int) reversed;
}



//using reverse() function - optimal

public int reverseFunction(int x) {
   boolean isNegative = false;
        if(x<0){
            isNegative= true;
        }
  

        String s =  String.valueOf(Math.abs((long)x));
        String reverse = new StringBuilder(s).reverse().toString();


        long reversedInt = Long.parseLong(reverse);
         if (reversedInt > Integer.MAX_VALUE) return 0;
        
        return isNegative== true ? (int)(-1 * reversedInt) : (int)reversedInt;
}

}

class main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverseBrute(123));
        System.out.println(sol.reverseFunction(123));


    }
}