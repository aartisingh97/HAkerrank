package com.hakerrank.algorithms.ArraysCode;

import java.util.Arrays;

public class PrintArrayElementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "Red", "Blue" };
		System.out.println(str);
		int a[] = { 2, 4, 6, 9 };
		System.out.println(a);
		for (int i = 0; i < str.length; i++) {
			System.out.print("String array" + str[i]);
		}
		System.out.println();
		// By using Enhanced loop
		for (int i : a) {

			System.out.println("Int array by using Enhanced loop:-" + i);
		}
		System.out.println("String can be printed as list it will override toString ()" + Arrays.asList(str));
		System.out.println("primitive array can not be printed as list " + Arrays.asList(a));

		System.out.println("By using toString method" + Arrays.toString(str));
		System.out.println("By using toString method" + Arrays.toString(a));

		// 2D array
		int[][] twoD = { { 1, 2, 3 }, { 5, 6, 7 } };
		System.out.println("Printing 2D array using Arrays.deeoToString():- " + Arrays.deepToString(twoD));
		Arrays.asList(str).stream().forEach(s -> System.out.println("Using Stream()" + s));
		Arrays.stream(str).forEach(System.out::println);
	}

}
