package com.hakerrank.algorithms.ArraysCode;

public class PrimeNumber {

	public static void prime(int n) {
		boolean primeflag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				primeflag = false;
				break;
			}
		}
		if (primeflag == true) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;
		for (int i = 2; i < n; i++) {
			prime(i);
		}
	}

}
