package org.dugu;

public class LargestElement {

	static int largestElementIndex(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < n; j++) {
				if (arr[j] > arr[i]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				return i;
			}
		}
		return -1;
	}

//	=========================> Efficient Solution <=================

	static int largestIndex(int[] arr) {
		int n = arr.length;
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 3, 9, 15, 2, 55 };
		System.out.println(largestElementIndex(arr));
		System.out.println("===================");
		System.out.println(largestIndex(arr));
	}
}
