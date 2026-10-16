class Solution {
    public int largestElement(int[] nums) {
        int largest = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]> largest){
                largest = nums[i];
            }
        }

        return largest;
    
    }
}


class main{
        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums = {10, 2, 3, 4, 5};
            int result = solution.largestElement(nums);
            System.out.println(result);
        }
}