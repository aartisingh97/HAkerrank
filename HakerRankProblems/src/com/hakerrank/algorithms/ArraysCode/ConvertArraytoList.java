package com.hakerrank.algorithms.ArraysCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArraytoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = { "Red", "Blue", "Green" };
		List list = Arrays.asList(s);
		System.out.println("Converted Array using AList()" + list);
		int a[] = { 3, 5, 7, 3, 4, 5 };
		// a primitive cannot be converted into list directly
		// so first converting int to Integer[]
		Integer[] boxedArray = Arrays.stream(a).boxed().toArray(Integer[]::new);
		List<Integer> listint = new ArrayList<>();
		Collections.addAll(listint, boxedArray);
		System.out.println("Converted Array to list by converting primitive to generic datatype" + listint);

		// using loop
		int z[] = { 2, 4, 5, 7, 5, 3 };
		List<Integer> listByLoop = new ArrayList<>();
		for (int arr : z) {
			listByLoop.add(arr);
		}
		System.out.println("Converted Array using for loop" + listByLoop);

	}

}
