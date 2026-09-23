// url: https://leetcode.com/problems/perfect-number/


class Solution {
    public boolean checkPerfectNumberBrute(int num) {
        int div =0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                div= div+ i;
            }
        }
        return num == div;
        
    }



//sqrt

    public boolean checkPerfectNumberOptimized(int num) {
        if(num<=1){

            return false;

        }

        int perf =1;                         
        for(int i=2; i*i <=num;i++){
            if(num%i==0){
                perf= perf+i;
                if(i * i !=num){
                    perf+= num/i;
                }
            }
        }

        return perf==num;
        
    }
}

class main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.checkPerfectNumberBrute(28));
        System.out.println(sol.checkPerfectNumberBrute(27));
        System.out.println(sol.checkPerfectNumberOptimized(28));
        System.out.println(sol.checkPerfectNumberOptimized(27));
    }
}