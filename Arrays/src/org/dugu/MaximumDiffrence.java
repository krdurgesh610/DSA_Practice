package org.dugu;

public class MaximumDiffrence {

//	===================> Method 1 <=====================

	static int maxDiff(int[] arr) {
		int n = arr.length;
		int max = arr[1] - arr[0];
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] - arr[i] > max) {
					max = arr[j] - arr[i];
				}
			}
		}
		return max;
	}

//	======================> Method 2 <========================

	static int maximumDiff(int[] arr) {
		int n = arr.length;
		int max = arr[1] - arr[0];
		int min = arr[0];
		for (int i = 1; i < n; i++) {
			if ((arr[i] - min) > max) {
				max = arr[i] - min;
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 90, 10, 110 };
		System.out.println(maxDiff(arr));
		System.out.println("===============================");
		System.out.println(maximumDiff(arr));
	}
}
