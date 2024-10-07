package com.math.problem;

public class MissingNumber {
	public static int findMissingNumber(int arr[], int n) {
		int sum = n * (n + 1) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
		}

		return sum;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 7, 5, 6, 2 };

		int missingNum = findMissingNumber(arr, arr.length + 1);
		System.out.println("Missing Number is:" + missingNum);
	}

}
