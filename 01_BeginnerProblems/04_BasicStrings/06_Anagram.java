import java.util.HashMap;

class Solution {  
    public boolean anagramStrings(String s, String t) {
        //your code goes here
        HashMap<Character , Integer> sMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            sMap.put(ch,sMap.getOrDefault(ch, 0) + 1);
        }

        for(int i=0;i<t.length();i++){
            char dh= t.charAt(i);
            sMap.put(dh,sMap.getOrDefault(dh, 0) -1);
        }

        for(var p: sMap.entrySet()){
            if(p.getValue()!=0){
                return false;
            }
        }

        return true;
    }
}

class main{
    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "listen";
        String t = "silent";
        System.out.println(solution.anagramStrings(s, t));
    }
}