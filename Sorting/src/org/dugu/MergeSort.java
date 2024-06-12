package org.dugu;

import java.util.Arrays;

public class MergeSort {

//	====================================================================

	static void sort(int a[], int b[]) {
		int m = a.length;
		int n = b.length;
		int c[] = new int[m + n];
		for (int i = 0; i < m; i++)
			c[i] = a[i];
		for (int j = 0; j < n; j++)
			c[m + j] = b[j];

		Arrays.sort(c);

		for (int i = 0; i < (m + n); i++)
			System.out.print(c[i] + " ");

	}

//	=======================================================================

	public static void main(String[] args) {
		int a[] = { 10, 15, 20 };
		int b[] = { 5, 6, 6, 15 };

		sort(a, b);

	}
}
