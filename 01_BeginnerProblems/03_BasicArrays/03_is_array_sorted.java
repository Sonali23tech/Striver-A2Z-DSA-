//url: https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1


class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int len = arr.length;
        boolean isSorted = true;
        int first = arr[0];
        for(int i=1;i<len;i++){
            if(arr[i]<first){
                isSorted = false;
            }
            first = arr[i];
        }
        return isSorted;
    }   

    public boolean isSortedBrute(int[] arr) {
        int len = arr.length;
        for(int i=1;i<len;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}


class main{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        boolean result = solution.isSorted(array);
        boolean resultBrute = solution.isSortedBrute(array);
        System.out.println(result);
        System.out.println(resultBrute);
    }
}