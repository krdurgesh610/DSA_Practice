package org.dugu;

public class MaxHCF {

	static int MaximumHCF(int a, int b) {
		
//		==================================================> Method 1
	/*	
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	 */
		
//		=====================================================> Method 2

		if (b == 0)
			return a;
		else
			return MaximumHCF(b, a % b);
	}

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		System.out.println(MaximumHCF(a, b));
	}

}
