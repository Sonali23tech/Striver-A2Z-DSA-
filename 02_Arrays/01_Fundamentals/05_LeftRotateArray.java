class Solution {
    public void rotateArrayByOne(int[] nums) {

        int first = nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }

        nums[nums.length -1] = first;
        
    }
}

class main{
        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums = {1, 2, 3, 4, 5};
            solution.rotateArrayByOne(nums);
            for(int num : nums){
                System.out.print(num + " ");
            }
        }
}