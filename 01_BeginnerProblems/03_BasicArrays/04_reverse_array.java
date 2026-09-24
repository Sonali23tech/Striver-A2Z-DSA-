//https://www.naukri.com/code360/problems/reverse-an-array_8365444?leftPanelTabValue=PROBLEM


class Solution {
    // using extra space
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int[] abc= new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            abc[j++] = nums[i];
        }

        return abc;

    }

    public static int[] reverseArraytemp(int n, int []nums) {
        // Write your code here.
        int left=0;
        int right=n-1;
        while(left<right){
            int temp = nums[left];
            nums[left]= nums[right];
            nums[right] = temp;

            left++;
            right--;
        }



        return nums;

    }
    public static int[] reverseArrayOptimized(int n, int []nums) {
        // Write your code here.
        int left=0;
        int right=n-1;
        for(int i=0;i<n/2;i++){
            int temp = nums[i];
            nums[i]= nums[n-i-1];
            nums[n-i-1] = temp;

        }



        return nums;

    }

    
}

class main{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        Solution solution = new Solution();
        //int[] reversedArray = solution.reverseArray(n, array);
        int[] reversedArrayTemp = solution.reverseArraytemp(n, array);
        //int[] reversedArrayOptimized = solution.reverseArrayOptimized(n, array);

        //for(int num : reversedArray){
        //    System.out.print(num);
        //}
        //System.out.println();
        for(int num : reversedArrayTemp){
            System.out.print(num);
        }
        // System.out.println();
        // for(int num : reversedArrayOptimized){
        //     System.out.print(num);
        // }
    }
}