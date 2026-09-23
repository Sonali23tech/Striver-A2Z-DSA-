class Solution {
    public void pattern8(int n) {
        for(int i=0;i<n;i++){

            // spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


class main{

    public static void main(String args[]){

        Solution sol = new Solution();
        sol.pattern(5);

    }
    
}
