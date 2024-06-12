package org.dugu;

import java.util.Scanner;

public class PrintDivisors {

	static void divisor(int n) {
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);

				if (i != n / i) {
					System.out.println(n / i);
				}
			}
		}
	}

	static void printDivisor(int n) {
		int i;
		for (i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		for (; i >= 1; i--) {
			if (n % i == 0) {
				System.out.println(n / i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();

		divisor(n);
		System.out.println("======================================");
		printDivisor(n);

	}

}
