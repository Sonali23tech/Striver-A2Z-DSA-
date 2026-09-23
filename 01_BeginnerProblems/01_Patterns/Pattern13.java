
class Solution {
    public void pattern13(int n) {
        int val=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }

    }
}


class  main{


    public static void main(String args[]){

        Solution sol = new Solution();
        sol.pattern13(4);


    }
    
}