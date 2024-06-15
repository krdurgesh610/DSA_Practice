package org.dugu;

public class RemoveDuplicates {

	static int removeDuplicate(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];
		int res = 1;
		temp[0] = arr[0];
		for (int i = 1; i < n; i++) {
			if (temp[res - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}

		for (int i = 0; i < res; i++) {
			arr[i] = temp[i];
		}
		return res;

	}

//	========================> Efficient Solution <==============================

	static int remDups(int[] arr) {
		int n = arr.length;
		int size = 1;
		for (int i = 1; i < n; i++) {
			if (arr[size - 1] != arr[i]) {
				arr[size] = arr[i];
				size++;
			}
		}
		return size;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 20, 20, 20, 10, 20, 30, 30, 40, 30, 40 };

//		int n = removeDuplicate(arr);
//
//		System.out.println(n);
//
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}

		System.out.println();

		System.out.println("=============================================");

		int size = remDups(arr);

		System.out.println(size);

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
