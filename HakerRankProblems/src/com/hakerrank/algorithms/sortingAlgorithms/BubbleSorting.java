package com.hakerrank.algorithms.sortingAlgorithms;

public class BubbleSorting {
	public static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" " + a[i]);
		}
	}

	public static void bubbleSort(int a[], int n) {
		int temp;
		int times = 0;
		for (int i = 0; i < n - 1; i++) {
			times = i;
			System.out.println("How many time comparision needed:-" + (i + 1));
			boolean isSorted = true;
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				System.out.println((times + 1) + " Passes required");
				return;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 7, 1, 9, 6, 8, 5 };
		int n = a.length;
		printArray(a, n);
		System.out.println("Arrays after sorting");
		bubbleSort(a, n);
		printArray(a, n);
	}

}
