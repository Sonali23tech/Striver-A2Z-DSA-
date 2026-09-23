class Solution {
	public void pattern20(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= 2*(n-i-1); j++) {
				System.out.print((" "));
			}

			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
        for (int i = 0; i < n; i++) {
			for (int j = 1; j <=n-i-1; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < 2*(i+1); j++) {  
				System.out.print(" ");
			}

		for (int j = 1; j <=n-i-1; j++) {
				System.out.print("*");
			}

		System.out.println();
		 }
    }
}

class main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.pattern20(4);
	}
}
