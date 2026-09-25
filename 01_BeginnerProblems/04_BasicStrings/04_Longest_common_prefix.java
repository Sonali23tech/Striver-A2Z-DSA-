


class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;

        for(int charInd=0; charInd< strs[0].length(); charInd++){
            for(int ind = 1; ind < len; ind++){
                if(strs[ind].charAt(charInd) != strs[0].charAt(charInd) || (strs[ind].length() <= charInd)){
                    return strs[0].substring(0, charInd);
                }
                }

            }
            return strs[0];


        }

   
    }

class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
}