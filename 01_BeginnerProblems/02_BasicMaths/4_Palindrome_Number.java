//url: https://leetcode.com/problems/palindrome-number/


class Solution {
    public boolean isPalindromeBrute(int x) {
        int rev=0;
        int n=x;
        while(x>0){
            int digit = x%10;
            rev=rev*10+digit;
            x=x/10;
        }

        if(rev==n){
            return true;
        }

        return false;
    }


//using forward and backward pointers
    public boolean isPalindromeUsingPointers(int x) {
         if (x < 0) {
            return false;
        }
        String s = Integer.toString(x);
        int right = s.length()-1;

        int left =0;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


// using half comparison

    public boolean isPalindromeOptimized(int x) {
         if(x <  0 ||  x %10== 0 & x!=0){
            return false;
         }

        int revHalf =0;
    

        while(x> revHalf){
            revHalf =revHalf *10 + x%10;
            x/=10;
        } 
 
      return x== revHalf ||   x == (revHalf/10);
    }
}

class main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindromeBrute(121));
        System.out.println(sol.isPalindromeUsingPointers(1221));
        System.out.println(sol.isPalindromeOptimized(12321));
    }
}