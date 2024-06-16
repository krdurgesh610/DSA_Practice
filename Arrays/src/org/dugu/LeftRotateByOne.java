package org.dugu;

public class LeftRotateByOne {

	static void leftRotate(int[] arr) {
		int n = arr.length;
		int temp = arr[0];
		for (int i = 1; i < n; i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1] = temp;
	}

	static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 10, 13, 15, 17, 18, 20 };
		printArray(arr);
		leftRotate(arr);
		printArray(arr);
	}
}
