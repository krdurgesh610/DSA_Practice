package org.dugu;

public class SecondLargestNumber {

	static int largestNo(int[] arr) {
		int n = arr.length;
		int large = 0;

		for (int i = 1; i < n; i++)
			if (arr[i] > arr[large])
				large = i;
		return large;
	}

	static int secondLargestNo(int[] arr) {
		int n = arr.length;
		int large = largestNo(arr);
		int res = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] != arr[large]) {
				if (res == -1)
					res = i;
				else if (arr[i] > arr[res])
					res = i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 2, 20, 12, 20 };
		System.out.println(secondLargestNo(arr));
	}
}
