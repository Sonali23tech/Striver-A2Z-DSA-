//url: https://leetcode.com/problems/largest-odd-number-in-string/


class Solution {

    public String largestOddNumberBrute(String num) {
        String ans="";
        for(int i=0;i<num.length();i++){
            for(int j=i;j<num.length();j++){
                String sub = num.substring(i,j+1);
                if((sub.charAt(sub.length()-1) - '0') % 2 != 0){
                    if(ans.equals("") || sub.length() > ans.length()){
                        ans = sub;
                    }

                }

            }
        }

        return ans;
    }
    public String largestOddNumber(String num) {
        int n= num.length()-1;
        while(n>=0){
            if((num.charAt(n) - '0')%2!=0){
                return  num.substring(0, n+1);
            }
            n--;
        }
                return "";
    }

}

class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        String num = "123456";
        System.out.println(solution.largestOddNumber(num));
        System.out.println(solution.largestOddNumberBrute(num));
    }
}    