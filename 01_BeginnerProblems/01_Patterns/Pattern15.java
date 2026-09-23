
class Solution {
    public void pattern15(int n) {
       // int val=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }

    }
}


class  main{


    public static void main(String args[]){

        Solution sol = new Solution();
        sol.pattern15(4);


    }
    
}