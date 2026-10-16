class Solution {
    public int linearSearch(int nums[], int target) {
		//Your code goes here
        for(int i=0;i<nums.length;i++){
            if(target== nums[i]){
                return i;
            }
        }
        return -1;
    }
}


class main{
        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums = {1, 2, 3, 4, 5};
            int target = -1;
            int result = solution.linearSearch(nums, target);
            System.out.println(result);
        }
}