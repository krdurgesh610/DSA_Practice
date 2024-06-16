package org.dugu;

public class LeftRotateByDTimes {

//	==============================> Method 1 <=======================

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

//	===========================> Method 2 <=======================

	static void leftRotateByDTimes(int[] arr, int d) {
		int n = arr.length;
		int[] temp = new int[d];

		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		for (int i = d; i < n; i++) {
			arr[i - d] = arr[i];
		}

		for (int i = 0; i < d; i++) {
			arr[n - d + i] = temp[i];
		}
	}

//	================================================================

	static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int d = 2;
		printArray(arr1);
		LeftRotate(arr1, d);
		printArray(arr1);

		System.out.println("====================================");
		
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		printArray(arr2);
		leftRotateByDTimes(arr2, d);
		printArray(arr2);

	}
}
