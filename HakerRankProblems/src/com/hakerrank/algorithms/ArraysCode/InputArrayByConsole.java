package com.hakerrank.algorithms.ArraysCode;

import java.util.Arrays;
import java.util.Scanner;

public class InputArrayByConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:-");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element:-");
			array[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
