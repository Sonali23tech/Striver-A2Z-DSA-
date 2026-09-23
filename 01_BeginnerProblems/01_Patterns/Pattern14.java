
class Solution {
    public void pattern14(int n) {
        int val=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+j));
                val++;
            }
            System.out.println();
        }

    }
}


class  main{


    public static void main(String args[]){

        Solution sol = new Solution();
        sol.pattern14(4);


    }
    
}