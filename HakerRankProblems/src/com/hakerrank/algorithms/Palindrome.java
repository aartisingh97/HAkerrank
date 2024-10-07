package com.hakerrank.algorithms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1001, r = 0, sum = 0;
		while (n != 0) {
			r = n % 10;
			sum = sum + r * 10;
			n = n / 10;
		}
		// System.out.println("Number " + sum);
		if (n == sum) {
			System.out.println("Number is palindrome" + sum);
		} else {
			System.out.println("Number is not palindrome" + sum);
		}
	}

}
