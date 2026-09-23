// URL: https://www.geeksforgeeks.org/problems/prime-number2314/1

class Solution {
    static boolean isPrimeBrute(int n) {
        // code here
        if(n<=1){
            return false;
        }
        int count =0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                
                return false;
            }

        }
        
        return true;
        
    }


    static boolean isPrime(int n) {
        // code here
        if(n<=1){
            return false;
        }
        int count =0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                
                return false;
            }

        }
        
        return true;
        
    }




}

class main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPrimeBrute(7));
        System.out.println(sol.isPrimeBrute(10));
        System.out.println(sol.isPrime(7));
        System.out.println(sol.isPrime(10));
    }
}