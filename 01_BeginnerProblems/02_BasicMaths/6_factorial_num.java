//url: https://www.naukri.com/code360/problems/factorial_975273

//using while loop 
class Solution {
	public static void factorialUsingLoop(int n) {
		// Write your code here
		long fact=1;
		while(n>0){
			fact = fact * n;
			n--;
		
		}
		System.out.println(fact);
	}



//recusrsion
public static long factorialRec(int n) {
      if (n == 0 || n == 1) return 1;
      return n * factorialRec(n - 1);
  }

}


class main{
    public static void main(String[] args) {
        Solution.factorialUsingLoop(5);
        System.out.println(Solution.factorialRec(10));
    }
}

