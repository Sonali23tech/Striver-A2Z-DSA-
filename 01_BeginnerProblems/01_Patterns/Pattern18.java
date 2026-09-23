
class Solution {
    public void pattern12(int n) {
       // int val=1;
        for(int i=0;i<n;i++){
            for(int j=n-1-i;j<=n-1;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }

    }
}


class  main{


    public static void main(String args[]){

        Solution sol = new Solution();
        sol.pattern12(4);


    }
    
}