package org.dugu;

public class ReverseArray {

	static void reverseArray(int[] arr) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
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
		int[] arr = { 10, 5, 2, 8 };
		printArray(arr);
		reverseArray(arr);
		printArray(arr);
	}
}
