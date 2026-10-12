import java.util.*;

class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer , Integer> mp = new HashMap<>();

        for(int num: nums){
            mp.put(num , mp.getOrDefault(num,0)+1);
        }

        int maxFreq=0;
        int result = Integer.MAX_VALUE;
        for(var entry: mp.entrySet()){
            int ans = entry.getKey();
            int freq = entry.getValue();

            if(freq> maxFreq || (freq == maxFreq && ans < result)){
                maxFreq = freq;
                result = ans;

            }
        }
        return result;
     
    }
}


class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 4, 5, 5, 6};
        int result = solution.mostFrequentElement(nums);
        System.out.println(result);
    }   
}