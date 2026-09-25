


class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder  str = new StringBuilder();
        String rev="";
        int j=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }


        int left=0;
        int right= str.length()-1;

        while(left<right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public boolean isPalindromeUsingRev(String s){
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        StringBuilder rev = new StringBuilder(str).reverse();
        if(rev.toString().equals(str.toString())){
            return true;
        } else {
            return false;
        }
    }

    public boolean isPalindromeUsingTwoPointers(String s){
        StringBuilder str= new StringBuilder();
        int i=0;
        int j= s.length()-1;
        while(i<j)
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else {
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                    return false;
                }
                i++;
                j--;
            }
        
        return true;
    }
    

    }

class main{ 
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(solution.isPalindrome(s));
        System.out.println(solution.isPalindromeUsingRev(s));
        System.out.println(solution.isPalindromeUsingTwoPointers(s));
    }
}