package org.dugu;

public class LCMofTwoNumber {

	static int GCD(int a, int b) {
		if (b == 0)
			return a;
		return GCD(b, a % b);
	}

	static int LCM(int a, int b) {
		return (a * b) / GCD(a, b);
	}

	static int LCMOf2Number(int a, int b) {

//		=================================> Method 1

		int res = Math.max(a, b);
		while (true) {
			if (res % a == 0 && res % b == 0)
				return res;
			res++;
		}

	}

	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		System.out.println(LCMOf2Number(a, b));
		System.out.println(LCM(a, b));
	}
}
