class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else if(nums[i]==0){
                count =0;
            }
            maxCount = Integer.max(maxCount , count);
        }
        return maxCount;
    }
}

class main{
        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums = {1, 1, 0, 1, 1, 1};
            int result = solution.findMaxConsecutiveOnes(nums);
            System.out.println(result);
        }
}