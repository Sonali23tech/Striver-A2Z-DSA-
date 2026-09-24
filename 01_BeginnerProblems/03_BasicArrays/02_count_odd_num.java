//url: https://www.geeksforgeeks.org/problems/count-odd-even/1


class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int n= arr.length;
        int countEven=0;
        int countOdd=-0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                countEven++;
            }
            
            else
            {
                countOdd++;
            }
        }
        
            return new int[]{countOdd, countEven};
    }
    public int[] countOddEvenAndOddOperator(int[] arr) {
        // Code here
        int n= arr.length;
        int countEven=0;
        int countOdd=-0;
        for(int i=0;i<n;i++){
            if((arr[i] & 1)==0){
                countEven++;
            }
            
            else
            {
                countOdd++;
            }
        }
        
            return new int[]{countOdd, countEven};
    }
}


class main{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        int[] result = solution.countOddEven(array);
        int[] result2 = solution.countOddEvenAndOddOperator(array);
        System.out.println(result2[0] + " " + result2[1]);
        System.out.println(result[0] + " " + result[1]);
    }
}