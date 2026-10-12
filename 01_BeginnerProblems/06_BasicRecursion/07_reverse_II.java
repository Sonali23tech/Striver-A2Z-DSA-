class Solution {
    public int[] reverseArray(int[] nums) {
        //your code goes here

        revArrayRec(nums , 0 , nums.length-1);
        return nums;
    }

    public void revArrayRec(int[] num , int start , int end){
        if(start>=end){
            return;
        }


        int temp = num[start];
        num[start] = num[end];
        num[end] = temp;

        revArrayRec(num , start+1 , end-1);
    }
}


class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5}; // Example input
        int[] reversed = solution.reverseArray(nums);
        System.out.println("Reversed array is: " + java.util.Arrays.toString(reversed));
    }
}