//url: not found

class Solution {

    public int largestDigit(int n) {
        int last=0;
        int flast=0;
        while(n>0){
            last = n%10;
            n/=10;
            if (last>flast){
                flast= last;
            }
        }
        return flast;

    }
};


class main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.largestDigit(12345));
    }
}