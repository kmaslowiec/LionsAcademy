package com.github.kmaslowiec;

import java.util.Arrays;

/**
 * 
 * First task for Lions Academy at Consileon Polska
 * 
 * @author Konrad Maslowiec
 * @email kmaslowiec@gmail.com
 * 
 **/
public class TaskOne {

	private String[] words;
	private int len;
	private int count = 0;

	public TaskOne(String[] words, int len) {

		this.words = words;
		this.len = len;

		wordsCount(words, len);
		System.out.println(toString());

	}

	/**
	 * Given an array of strings, return the count of the number of strings with the
	 * given length.
	 * 
	 * @param words
	 * @param len
	 * @return the number of strings with the given length
	 */
	public int wordsCount(String[] words, int len) {
		this.len = len;
		this.words = words;
		for (int i = 0; i < words.length; i++) {

			if (words[i].length() == len) {
				count++;
			}

		}

		return count;

	}

	/**
	 * Prints the Passed Array, requested length and result
	 */
	@Override
	public String toString() {
		return "Task One: Array Passed: " + Arrays.toString(words) + " searched length: " + len + " result: " + count;
	}

}
