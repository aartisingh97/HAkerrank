package com.hakerrank.algorithms.ArraysCode;

import java.util.Arrays;

public class DeleteElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 2, 6, 5, 9, 5, 9 };
		System.out.println("Origional Array" + Arrays.toString(a));
		int wantToDelete = 9;
		int newArray[] = new int[a.length - 1];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] == wantToDelete) {
				continue;
			} else {
				// newArray[j++] = a[i];
				// OR
				newArray[j] = a[i];
				j++;

			}
		}
		System.out.println("New Array after deletion" + Arrays.toString(newArray));
	}

}
