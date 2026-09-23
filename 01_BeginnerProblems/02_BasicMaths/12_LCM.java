


class Solution {
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}   
class main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 12;
        int b = 18;
        int lcm = sol.lcm(a, b);
        System.out.println(lcm);
    }
}
