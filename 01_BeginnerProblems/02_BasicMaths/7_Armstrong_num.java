// url: https://www.naukri.com/code360/problems/armstrong-number_1462443

class Solution 
{
	public static boolean isArmstrong(int num) {
      int original = num;
      int digits = (int)(Math.floor(Math.log10(num))+1);
      int armNum = 0;

      while (num > 0) {
          int digit = num % 10;
          armNum += (int) Math.pow(digit, digits);  
          num /= 10;
      }

      return original == armNum;
  }
}

class main{
    public static void main(String[] args) {
        System.out.println(Solution.isArmstrong(153));
        System.out.println(Solution.isArmstrong(123));
    }
}