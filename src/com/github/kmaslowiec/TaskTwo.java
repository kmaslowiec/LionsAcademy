package com.github.kmaslowiec;

import java.util.Arrays;

/**
 * 
 * Second task for Lions Academy at Consileon Polska
 * 
 * @author Konrad Maslowiec
 * @email kmaslowiec@gmail.com
 * 
 **/

public class TaskTwo {

	private String[] words;
	private String[] resultArray;
	private int n;

	public TaskTwo(String[] words, int n) {

		this.words = words;
		this.n = n;

		if (n <= words.length && n > 0) {
			wordsFront(words, n);
			System.out.println(toString());
		} else {
			System.out.println("Second argument cannot be longer or shorter that the array's length");
		}

	}

	/**
	 * Given an array of strings, return a new array containing the first N strings.
	 * N will be in the range 1..length.
	 * 
	 * @param words
	 * @param n
	 * @return a new array containing the first N strings
	 */

	public String[] wordsFront(String[] words, int n) {

		resultArray = new String[n];
		System.arraycopy(words, 0, resultArray, 0, n);
		return resultArray;

	}

	/**
	 * Prints the Passed Array, requested length and result
	 */
	@Override
	public String toString() {
		return "Task Two: Array Passed: " + Arrays.toString(words) + " N is: " + n + " result: "
				+ Arrays.toString(resultArray);
	}
}
