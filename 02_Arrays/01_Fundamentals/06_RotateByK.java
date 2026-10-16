class Solution {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
          k = k % n;
        int[] temp = new int[k];
        for(int i=0; i<k;i++){
            temp[i] = nums[i];
        }
        int j=0;
        for(int i =k;i<n;i++){
            nums[j++] = nums[i];
        }

        for(int i = 0;i<k;i++){
            nums[n-k+i] = temp[i];
        }
    }
}


class main{
        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums = {1, 2, 3, 4, 5};
            int k = 2;
            solution.rotateArray(nums, k);
            for(int num : nums){
                System.out.print(num + " ");
            }
        }
}