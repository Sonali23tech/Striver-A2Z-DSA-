// URL: https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1



class Solution {
    public static int gcdBrute(int a, int b) {
        // code here
        int gcd=1;
        int mini = Math.min(a,b);
        for(int i=2;i<=mini;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        
        return gcd;
    }


    public static int gcdBackLoop(int a, int b) {
        int mini = Math.min(a,b);
        for(int i=mini;i>1;i--){
            if(a%i==0 && b%i==0){
              return i;
            }
        }
        
        return 1;
        
        
    }

     public static int gcd(int a, int b) {
        
        while(a >0 && b>0){
            if(a>b){
            a=a%b;
        }
        
        else{
            b=b%a;
        }
            
        }
        
        return a!=0 ? a:b;
        
        
    }



}


class main{
    public static void main(String[] args) {
        System.out.println(Solution.gcdBrute(10, 15));
        System.out.println(Solution.gcdBackLoop(10, 15));
        System.out.println(Solution.gcd(10, 15));
    }
}
