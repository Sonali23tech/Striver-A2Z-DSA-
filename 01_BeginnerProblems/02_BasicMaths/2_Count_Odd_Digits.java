 //url: not found

class Solution {

    public int countOddDigit(int n) {

        int count=0;
        n = Math.abs(n);

        if (n == 0) {
            return 1;
        }
            
        while(n>0){
            int remain = n % 10;
            n=n/10;
            if(remain%2 !=0)
            count++;
        }

        return count;

    }

}

class main{
    public static void main(String args[]){
        Solution obj = new Solution();
        System.out.println(obj.countOddDigit(1111));
    }
}