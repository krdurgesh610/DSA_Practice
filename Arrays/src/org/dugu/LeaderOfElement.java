package org.dugu;

public class LeaderOfElement {

//	=========================> Method 1 <============================

	static void leaderNumber(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] <= arr[j]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.print(arr[i] + " ");
			}
		}
	}

//	============================> Method 2 <===================================

	static void leaderNumberInArray(int[] arr) {
		int n = arr.length;
		int current_leader = arr[n - 1];
		System.out.print(current_leader + " ");

		for (int i = n - 2; i > 0; i--) {
			if (current_leader < arr[i]) {
				current_leader = arr[i];
				System.out.print(current_leader + " ");
			}
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
		int[] arr = { 7, 10, 4, 10, 5, 6, 5, 2 };

//		leaderNumber(arr);

		leaderNumberInArray(arr);
	}
}
