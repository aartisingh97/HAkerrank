package com.hakerrank.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
 * The distance between two array values is the number of indices between them. Given , find the minimum distance between any pair of equal elements in the array. If no such value exists, return .

Example

There are two matching pairs of values:  and . The indices of the 's are  and , so their distance is . The indices of the 's are  and , so their distance is . The minimum distance is .

Function Description

Complete the minimumDistances function in the editor below.

minimumDistances has the following parameter(s):

int a[n]: an array of integers
Returns

int: the minimum distance found or  if there are no matching elements
Input Format

The first line contains an integer , the size of array .
The second line contains  space-separated integers .

Constraints

Output Format

Print a single integer denoting the minimum  in . If no such value exists, print .

Sample Input

STDIN           Function
-----           --------
6               arr[] size n = 6
7 1 3 4 1 7     arr = [7, 1, 3, 4, 1, 7]
Sample Output

3
Explanation
There are two pairs to consider:

 and  are both , so .
 and  are both , so .
The answer is .
 */

class Result {

	/*
	 * Complete the 'minimumDistances' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static int minimumDistances(List<Integer> a) {
		// Write your code here
		int minDis = Integer.MAX_VALUE, currentIndex = 0, previousIndex = 0;
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < a.size(); i++) {

			currentIndex = i;

			if (hmap.containsKey(a.get(i))) {
				previousIndex = hmap.get(a.get(i));
				minDis = Math.min((currentIndex - previousIndex), minDis);
			}
			hmap.put(a.get(i), i);
		}
		return (minDis == Integer.MAX_VALUE ? -1 : minDis);
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aTemp[i]);
			a.add(aItem);
		}

		int result = Result.minimumDistances(a);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
