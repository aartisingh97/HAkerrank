package com.hakerrank.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

class Result1 {

	/*
	 * Complete the 'compareTriplets' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		// Write your code here
		int Alice_Score = 0, Bob_Score = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				Alice_Score++;
			}
			if (a.get(i) < b.get(i)) {
				Bob_Score++;
			}
		}
		List<Integer> ans = new ArrayList<>();
		ans.add(Alice_Score);
		ans.add(Bob_Score);
		return ans;
	}

}

public class CompareTriplets {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			int aItem = Integer.parseInt(aTemp[i]);
			a.add(aItem);
		}

		String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> b = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			int bItem = Integer.parseInt(bTemp[i]);
			b.add(bItem);
		}

		List<Integer> result = Result1.compareTriplets(a, b);

		for (int i = 0; i < result.size(); i++) {
			bufferedWriter.write(String.valueOf(result.get(i)));

			if (i != result.size() - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
