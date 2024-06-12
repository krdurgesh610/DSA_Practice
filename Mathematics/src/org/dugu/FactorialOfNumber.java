package org.dugu;

public class FactorialOfNumber {

//	================> Iterative Solution <=================

	static int factorialOfNumber(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

//	================> Recursive Solution <=================

	static int facto(int n) {
		if (n == 0)
			return 1;

		return n * facto(n - 1);
	}

	// ===================> Main Method Started <==============

	public static void main(String[] args) {
		int n = 6;

		System.out.println(factorialOfNumber(n));

		System.out.println(facto(n));
	}
}
