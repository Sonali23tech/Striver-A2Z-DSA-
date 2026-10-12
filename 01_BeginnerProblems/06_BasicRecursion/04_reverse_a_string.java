

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        //your code goes here
        revStringRec( s, 0, s.size()-1);
        return s;
    }

    public void revStringRec(ArrayList<Character> s , int start , int end){
        if(start>=end){
            return;
        }

        char tm = s.get(start);
        s.set(start , s.get(end));
        s.set(end , tm);

        revStringRec(s ,start+1 , end-1); 
    }
}


class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Character> s = new ArrayList<>(Arrays.asList('h', 'e', 'l', 'l', 'o')); // Example input
        ArrayList<Character> reversed = solution.reverseString(s);
        System.out.println("Reversed string is: " + reversed);
    }
}