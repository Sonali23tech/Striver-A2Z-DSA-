//url: https://leetcode.com/problems/reverse-string/



class Solution {
    public void reverseString(char[] s) {
        
        char[]  temp = new char[s.length];
        for(int i=s.length-1;i>=0;i--){
            temp[s.length-1-i] = s[i];
        }

        for(int i=0;i<s.length;i++){
            s[i] = temp[i];
        }
        
    }

    public void reverseStringPointers(char[] s) {
        int left=0;
        int right= s.length-1;
        while(left<right){
            char temp= s[left];
            s[left]= s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}



class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        for(char c : s){
            System.out.print(c);
        }
        System.out.println();
        solution.reverseStringPointers(s);
        for(char c : s){
            System.out.print(c);
        }
    }
}
