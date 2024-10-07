package com.hakerrank.algorithms.ArraysCode;

public class firstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 2, 6, 5, 9, 5, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("First Occurence:" + a[i]);

				}
			}

		}

	}

}
