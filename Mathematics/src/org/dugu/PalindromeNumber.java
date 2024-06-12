package org.dugu;

public class PalindromeNumber {
	
//	================================> Method <====================================

	void palindromeNumber(int n) {
		int temp = n;
		int rev = 0;
		int rem = 0;
		while (n != 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number");
		}
	}
	
	//=============================> Main Method Started <================================

	public static void main(String[] args) {
		int n = 12321;
		PalindromeNumber p = new PalindromeNumber();
		p.palindromeNumber(n);
	}
}
