package com.hakerrank.algorithms.sortingAlgorithms;

public class InsertionSorting {
	public static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" " + a[i]);
		}
	}

	public static void insertSort(int a[], int n) {
		// 0 1 2 3 4 5 6
		for (int i = 1; i < n; i++) {// 2, 7, 1, 9, 6, 8, 5
			// i=1//i=2//i=3//i=4
			int key = a[i]; // key=7//key=1//key=9//key=6
			int sortedPosition = i - 1; // index=0//index=1//index=2//index=3
			while (sortedPosition >= 0 && a[sortedPosition] > key) {// 7>1 //2>7//7>9=false//9>6=true
				a[sortedPosition + 1] = a[sortedPosition];// a[2]=7//a[1]=2//a[4]=9
				sortedPosition--;// 0//-1//
			}
			a[sortedPosition + 1] = key; // a[sortedPosition+1]=7// 2,7//a[0]=1:--1,2,7//1,2,7,9
		}
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int a[] = { 2, 7, 1, 9, 6, 8, 5 };
		int n = a.length;
		printArray(a, n);
		System.out.println();
		System.out.println("Arrays after sorting");
		insertSort(a, n);
		printArray(a, n);
	}

}
