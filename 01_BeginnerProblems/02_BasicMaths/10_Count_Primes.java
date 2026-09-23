// URL: https://leetcode.com/problems/count-primes/

//works for small values of n
class Solution {
    public int countPrimes(int n) {

        if(n<=1){
            return 0;
        }
        int count=0;
        for(int i=2;i<n;i++){
                boolean isPrime = true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }

            }
            if(isPrime){
                count++;

            }

        }

        return count;
        
    }



//sieve of Eratosthenes would be more efficient for large values of n

public int CountPrimesSeive(int n){
    if(n<=1){
        return 0;
    }

    boolean[]  seive = new boolean[n];
    for(int i=2;i*i<=n;i++){
        if(!seive[i]){
            for(int j=i*i;j<n;j+=i){
                seive[j] = true;
            }
        }
    }
    int count = 0;
    for(int i=2;i<n;i++){
        if(!seive[i]){
            count++;
        }
    }
    return count; 
}
}


class main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countPrimes(10));
        System.out.println(sol.CountPrimesSeive(10));
    }
}



// //Using n = 10 as the example. Expected output: 4 (primes: 2, 3, 5, 7).

//   ---
//   Initial state:
//   isComposite = [F, F, F, F, F, F, F, F, F, F]
//   index         0   1   2   3   4   5   6   7   8   9
//   count = 0

//   ---
//   i = 2 → isComposite[2] is false → count = 1
//   - Inner loop: j = 2*2 = 4, mark multiples of 2
//     - j=4 → mark, j=6 → mark, j=8 → mark, j=10 → stop
//   isComposite = [F, F, F, F, T, F, T, F, T, F]

//   i = 3 → isComposite[3] is false → count = 2
//   - Inner loop: j = 3*3 = 9, mark multiples of 3
//     - j=9 → mark, j=12 → stop
//   isComposite = [F, F, F, F, T, F, T, F, T, T]

//   i = 4 → isComposite[4] is true → skip

//   i = 5 → isComposite[5] is false → count = 3
//   - Inner loop: j = 5*5 = 25 → 25 >= 10, no iterations

//   i = 6 → isComposite[6] is true → skip

//   i = 7 → isComposite[7] is false → count = 4
//   - Inner loop: j = 7*7 = 49 → 49 >= 10, no iterations

//   i = 8 → isComposite[8] is true → skip

//   i = 9 → isComposite[9] is true → skip

//   ---
//   Return count = 4 ✓