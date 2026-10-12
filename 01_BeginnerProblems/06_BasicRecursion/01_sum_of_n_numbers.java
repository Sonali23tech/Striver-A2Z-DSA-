
class Solution {
    public int NnumbersSum(int N) {
        //your code goes here
        if(N==0){
            return 0;
        }
        return N + NnumbersSum(N-1);
    }
}


class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 5; // Example input
        int sum = solution.NnumbersSum(N);
        System.out.println("Sum of first " + N + " numbers is: " + sum);
    }
}