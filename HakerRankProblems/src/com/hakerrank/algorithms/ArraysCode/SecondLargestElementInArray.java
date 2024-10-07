package com.hakerrank.algorithms.ArraysCode;

import java.util.SortedSet;
import java.util.TreeSet;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 2, 6, 5, 9, 5, 9 };
		SortedSet<Integer> set = new TreeSet<Integer>();
		for (int i : arr) {
			set.add(i);

		}
		set.remove(set.last());

		System.out.println("Second largest Elemt in array:-" + set.last());

	}

}
