
class Solution {
    public void pattern5(int n) {
       // int val=1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


class  main{


    public static void main(String args[]){

        Solution sol = new Solution();
        sol.pattern5(4);


    }
    
}