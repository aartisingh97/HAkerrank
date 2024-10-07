package com.hakerrank.algorithms.ArraysCode;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6=1+2+3=6, 6 can be divided by 1,2,3
		int n, sum = 0;
		System.out.println("Please enter the number you want to check it is perfect or not: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n == sum) {
			System.out.println(n + " is a perfect number");
		} else {
			System.out.println(n + " is not a perfect number");
		}

	}

}
