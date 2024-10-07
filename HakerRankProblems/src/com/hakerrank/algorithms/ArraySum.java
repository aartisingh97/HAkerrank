package com.hakerrank.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Result {

	/*
	 * Complete the 'simpleArraySum' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY ar as parameter.
	 */

	public static int simpleArraySum(int[] ar) {
		// Write your code here
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;
	}

}

public class ArraySum {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		// FileWriter ostream = new FileWriter("nyccrash.txt");// this will write o/p in
		// file
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int arCount = Integer.parseInt(bufferedReader.readLine().trim());

		String[] arItems = bufferedReader.readLine().split(" ");

		int[] ar = new int[arCount];

		for (int arItr = 0; arItr < arCount; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = Result.simpleArraySum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
