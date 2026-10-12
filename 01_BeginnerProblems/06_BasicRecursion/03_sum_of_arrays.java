class Solution {
    public int arraySum(int[] nums) {
        //your code goes here
        return recSum(nums , 0);
    }

    public int recSum(int[] nums ,int ind){
        if(ind== nums.length){
            return 0;
        }

        return nums[ind] + recSum(nums , ind+1);
    }
}


class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5}; // Example input
        int sum = solution.arraySum(nums);
        System.out.println("Sum of array elements is: " + sum);
    }
}