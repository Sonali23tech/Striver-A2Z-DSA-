class Solution {
    public boolean checkPrime(int num) {
        //your code goes here

        return checkPrimeRec(num , 2);
    }

    public boolean checkPrimeRec(int num , int ind){
        if(num<=2){
            return (num==2) ? true : false;
        }

        if(num%ind==0){
            return false;
        }
        if( ind*ind > num){
            return true;
        }

        return checkPrimeRec(num , ind+1);
    }
}


class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 29; // Example input
        boolean isPrime = solution.checkPrime(num);
        System.out.println("Is " + num + " a prime number? " + isPrime);
    }
}