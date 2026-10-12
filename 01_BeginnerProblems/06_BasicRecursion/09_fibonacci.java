class Solution {
    public int fib(int n) {
        //your code goes here
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}


class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10; // Example input
        int result = solution.fib(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }
}