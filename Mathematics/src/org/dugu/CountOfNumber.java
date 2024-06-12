package org.dugu;

public class CountOfNumber {
	
//	================================> Method <====================================

	static void count(int x) {
		int rem = 0;
		while (x != 0) {
			x /= 10;
			rem++;
		}
		System.out.println(rem);
	}
//===============================> Main Method Started <================================
	
	public static void main(String[] args) {
		int x = 852123456;
		count(x);
	}
}
