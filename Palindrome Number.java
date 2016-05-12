public class Solution {
	public boolean isPalindromde(int x) {
		if (x < 0) {
			return false;
		}
		return x == reverse(x);
	}

	private int reverse(int n) {
		int result = 0;
		while (n != 0) {
			int temp = result * 10 + n % 10;
			if (temp / 10 != result) {
				result = 0;
				break;
			}
			result = temp;
			n = n / 10;
		}
	}
}