class Solution {
	public void pattern22(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				int dis = Math.min(Math.min(i, j), Math.min(2 * n - 2 - i, 2 * n - 2 - j));
				System.out.print((n - dis) + " ");
			}
			System.out.println();
		}
	}
}

class main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.pattern22(5);
	}
}
