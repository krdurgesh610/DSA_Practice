package org.dugu;

public class FrequenciesOfElement {

	static void printFreq(int[] arr) {
		int n = arr.length;
		int freq = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1]) {
				freq++;
			} else {
				System.out.println("Frequencies of " + arr[i - 1] + " is " + freq);
				freq = 1;
			}
		}
		System.out.println("Frequencies of " + arr[n - 1] + " is " + freq);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10, 10, 10 };
		printFreq(arr);
	}
}
