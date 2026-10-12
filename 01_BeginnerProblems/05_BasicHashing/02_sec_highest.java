import java.util.*;

class Solution {
    public int secondMostFrequentElement(int[] nums) {
        HashMap<Integer , Integer> mp = new HashMap<>();

        for(int num: nums){
            mp.put(num , mp.getOrDefault(num,0)+1);
        }

        int fir_freq=0;
        int sec_freq=0;
        boolean hasHighest = false;
        boolean hasSecond = false;
        int fir_result = Integer.MAX_VALUE;
        int sec_result =1;
        for(var entry: mp.entrySet()){
            int ans = entry.getKey();
            int freq = entry.getValue();
        if(!hasHighest){
            fir_result = ans;
            fir_freq = freq;
            hasHighest =true;
        }

        else if(freq> fir_freq){
            sec_freq= fir_freq;
            fir_freq=freq;
            sec_result= fir_result;
            fir_result = ans;

            hasSecond = true;
        }

        else if(freq == fir_freq){
            if(ans< fir_result){
                fir_result = ans;
            }
            
        }
            
        else{
            if(!hasSecond  || freq > sec_freq || (freq == sec_freq && ans < sec_result)){
                sec_freq = freq;
                sec_result = ans;
                hasSecond = true;
    
            }
        }

           
            
        }
 return sec_freq == 0 ? -1 : sec_result;     
     
    }
}

class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,1};
        int result = solution.secondMostFrequentElement(nums);
        System.out.println(result);
    }
}