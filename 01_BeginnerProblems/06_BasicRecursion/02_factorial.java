class Solution {
    public long factorial(int n) {
        //your code goes here
         if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
}

class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 5; // Example input
        long fact = solution.factorial(N);
        System.out.println("Factorial of " + N + " is: " + fact);
    }
}