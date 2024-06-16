package org.dugu;

public class LeftRotateByDTimes {

	static void leftRotateOne(int[] arr) {
		int n = arr.length;
		int temp = arr[0];
		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = temp;
	}

	static void LeftRotate(int[] arr, int d) {
		for (int i = 1; i <= d; i++) {
			leftRotateOne(arr);
		}
	}

	static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int d = 5;
		printArray(arr);
		LeftRotate(arr, d);
		printArray(arr);
	}
}
