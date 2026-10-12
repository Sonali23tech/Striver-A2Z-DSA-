
import java.util.*;

class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
      HashMap<Integer , Integer> mp = new HashMap<>();

        for(int num: nums){
            mp.put(num , mp.getOrDefault(num,0)+1);
        }

        int maxFreq=0;
        int minFreq=Integer.MAX_VALUE;
        int max_result = Integer.MAX_VALUE;
        int min_result = Integer.MIN_VALUE;
        for(var entry: mp.entrySet()){
            int ans = entry.getKey();
            int freq = entry.getValue();

            if(freq> maxFreq || (freq == maxFreq && ans < max_result)){
                maxFreq = freq;
                max_result = ans;

            }

            if(freq< minFreq || (freq == minFreq && ans < min_result)){
                minFreq = freq;
                min_result = ans;

            }
        }
        return maxFreq+minFreq;
     
    }
}

class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 4, 5, 5, 6};
        int result = solution.sumHighestAndLowestFrequency(nums);
        System.out.println(result);
    }
}