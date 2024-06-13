package org.dugu;

public class IsSorted {

	static boolean SortedOrNot(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[i])
					return false;
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 13, 20 };
		System.out.println(SortedOrNot(arr));
	}
}
