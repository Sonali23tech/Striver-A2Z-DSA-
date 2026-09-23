


class Solution {
    public int[] divisors(int n) {
      //ArrayList<Integer> div = new ArrayList<>();
       int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
              count++;
            }
        }

        int[]  arr= new int[count];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
              arr[index++] = i;
            }
        }

        return arr;

    }

    public int[] divisorsOptimized(int n) {
      //ArrayList<Integer> div = new ArrayList<>();
       int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
              count++;
            }
        }

        int[]  arr= new int[count];
        int index=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
              arr[index++] = i;

              if(i != n/i){
                  arr[index++] = n/i;
              }
            }

        }

        return arr;

    }
}

class  main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] divisors = sol.divisorsOptimized(12);
        
        for (int div : divisors) {
            System.out.print(div + " ");
        }
    }
}