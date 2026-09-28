import java.util.HashMap;

class Solution{
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> mp= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sc= s.charAt(i);
            char tc= t.charAt(i);
            if((mp.containsKey(sc) && mp.get(sc) != tc)||
                (!mp.containsKey(sc) && mp.values().contains(tc))){
                         return false;
                }

            mp.put(sc ,tc);

        }

        return true;
        
    }

    public boolean isIsomorphicBrute(String s, String t){
        for(int i=0;i<s.length();i++){
            char sc= s.charAt(i);
            char tc= t.charAt(i);
            for(int j=0;j<i;j++){
                if(s.charAt(j)==sc && t.charAt(j)!=tc){
                    return false;
                }
                else if(s.charAt(j)!=sc && t.charAt(j)==tc){
                    return false;
            }

        }
        }
        return true;
    }
}


class main{
    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "egg";
        String t = "add";
        System.out.println(solution.isIsomorphic(s, t));
        System.out.println(solution.isIsomorphicBrute(s, t));
    }
}