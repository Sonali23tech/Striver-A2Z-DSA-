class Solution {
	public void pattern10(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <  i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.pattern10(5);
	}
}
