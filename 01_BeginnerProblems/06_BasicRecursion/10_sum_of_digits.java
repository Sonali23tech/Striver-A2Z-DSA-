class Solution {
    public int addDigits(int num) {
        //your code goes here
        while(num < 10){
            return num;
        }

        int res=0;
        while(num>0){
            int d = num%10;
            num/=10;
            res+=d;
        }

        int ans = addDigits(res);
        return ans;
    }
}


class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 12345; // Example input
        int result = solution.addDigits(num);
        System.out.println("Sum of digits of " + num + " is: " + result);
    }
}