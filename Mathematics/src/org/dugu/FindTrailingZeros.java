package org.dugu;

public class FindTrailingZeros {

	static int findTrailingZeros(int n) {
		if (n < 0)
			return -1;

		int count = 0;

		for (int i = 5; i <= n; i *= 5)
			count = count + n / i;

		return count;

	}

	public static void main(String[] args) {
		int n = 150;
		System.out.println("Count of trailing 0s in " + n + "! is " + findTrailingZeros(n));
	}

}
