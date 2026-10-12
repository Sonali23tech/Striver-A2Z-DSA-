class Solution {   
    public boolean palindromeCheck(String s) {
        //your code goes here
        return palindromaRec(s , 0 , s.length()-1 );
    }

    public boolean palindromaRec(String s , int start , int end){
        if(start>=end){
            return true;
        }

        if(s.charAt(start)!= s.charAt(end)){
            return false;
        }

        return palindromaRec(s , start+1 , end-1);
    }
}


class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "racecar"; // Example input
        boolean isPalindrome = solution.palindromeCheck(s);
    }
}