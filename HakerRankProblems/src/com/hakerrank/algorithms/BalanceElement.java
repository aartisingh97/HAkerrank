package com.hakerrank.algorithms;

public class BalanceElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 8, 3, 5, 3, 6, 6 };

		for (int i = 0; i < a.length; i++) {
			boolean duplicateflag = false;
			// int number = a[i];
			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j] && i != j) {
//					if ( {
					duplicateflag = true;
//					}
				}
			}
			if (duplicateflag == false) {
				System.out.println("Entered array is not a balance array: " + a[i]);
			}
		}

	}

}
