
class Solution {
    public void pattern12(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            for(int j=0;j<= 2*(n-i-1);j++){
                System.out.print(" ");
            }
            for (int j = i+1; j >= 1; j--){
                System.out.print(j);
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