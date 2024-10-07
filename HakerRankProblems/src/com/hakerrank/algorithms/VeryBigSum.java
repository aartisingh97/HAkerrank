package com.hakerrank.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

class Result2 {

	/*
	 * Complete the 'aVeryBigSum' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * LONG_INTEGER_ARRAY ar as parameter.
	 */

	public static long aVeryBigSum(List<Long> ar) {
		// Write your code here
		long big_sum = 0;
		for (int i = 0; i < ar.size(); i++) {
			big_sum = big_sum + ar.get(i);
		}
		return big_sum;
	}

}

public class VeryBigSum {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int arCount = Integer.parseInt(bufferedReader.readLine().trim());

		String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Long> ar = new ArrayList<>();

		for (int i = 0; i < arCount; i++) {
			long arItem = Long.parseLong(arTemp[i]);
			ar.add(arItem);
		}

		long result = Result2.aVeryBigSum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}