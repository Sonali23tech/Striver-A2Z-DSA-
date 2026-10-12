import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here

        if(nums.size()<=1){
            return true;
        }

        return isSortedRec(nums , 0);
    }

    public boolean isSortedRec(ArrayList<Integer> nums , int ind){
        int n = nums.size();
        if(ind>=n-1){
            return true;
        }
        if(nums.get(ind) > nums.get(ind+1)){
            return false;
        }
        return isSortedRec(nums , ind+1);

    }
}


class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // Example input
        boolean sorted = solution.isSorted(nums);
        System.out.println("Is the array sorted? " + sorted);
    }
}