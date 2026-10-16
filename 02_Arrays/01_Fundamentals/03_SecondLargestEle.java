class Solution {
    public int secondLargestElement(int[] nums) {
        int fLargest = Integer.MIN_VALUE;;
        int sLargest = Integer.MIN_VALUE;;
        for(int i=0;i<nums.length;i++){
            if(nums[i]> fLargest){
                sLargest = fLargest;
                fLargest =  nums[i];
            }

            else if(nums[i] < fLargest && nums[i] > sLargest){
                sLargest = nums[i];
            }
        }
        return sLargest != Integer.MIN_VALUE ? sLargest : -1;
    }
}

class main{
        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums = {10, 2, 3, 4, 5};
            int result = solution.secondLargestElement(nums);
            System.out.println(result);
        }
}