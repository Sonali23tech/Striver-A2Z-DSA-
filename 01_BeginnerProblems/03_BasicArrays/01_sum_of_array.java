//url: https://www.naukri.com/code360/problems/print-array-sum_625032

class Solution {
    public static long solve(int n, int[] a) {
        // Write your code here.
        long sum=0;

        for(int i=0;i<n;i++){
            sum+= a[i];
        }

        return sum;
    }
}


class main{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        long sum = Solution.solve(n, array);
        System.out.println(sum);
    }
}