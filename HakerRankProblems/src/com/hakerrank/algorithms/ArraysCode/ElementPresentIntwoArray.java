package com.hakerrank.algorithms.ArraysCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ElementPresentIntwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = { 1, 2, 3, 9, 8, 7 };
		Integer[] arr2 = { 4, 1, 2, 10, 15 };
		Integer[] arr3 = { 5, 1, 2, 4, 10 };
		HashSet<Integer> hset = new HashSet<>();
		List<Integer> l1 = Arrays.asList(arr1);
		List<Integer> l2 = Arrays.asList(arr2);
		List<Integer> l3 = Arrays.asList(arr3);
		hset.addAll(l1);
		hset.addAll(l2);
		hset.addAll(l3);
		List<Integer> finalList = new ArrayList<>();
		for (Integer number : hset) {
			if ((l1.contains(number) && l2.contains(number)) || (l1.contains(number) && l3.contains(number))
					|| (l2.contains(number) && l3.contains(number))) {
				finalList.add(number);

			}
		}
		System.out.println(finalList);
	}

}
