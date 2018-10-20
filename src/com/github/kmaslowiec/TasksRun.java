package com.github.kmaslowiec;

import java.util.Arrays;

/**
 * 
 * Runs all tasks for Lions Academy at Consileon Polska
 * 
 * @author Konrad Maslowiec
 * @email kmaslowiec@gmail.com
 * 
 **/

public class TasksRun {

	// create TaskOne objects
	private static TaskOne countOne;
	private static TaskOne countTwo;
	private static TaskOne countThree;
	// create TaskTwo objects
	private static TaskTwo wordsFrontOne;
	private static TaskTwo wordsFrontTwo;
	private static TaskTwo wordsFrontThree;
	// create TaskThree objects
	private static TaskThree greenTicketOne;
	private static TaskThree greenTicketTwo;
	private static TaskThree greenTicketThree;

	public static void main(String[] args) {

		// Task one:
		taskOne();
		// Task two:
		System.out.println("");
		taskTwo();
		// Task three
		System.out.println("");
		taskThree();

	}

	/**
	 * Helper class that prints the answers for Task One
	 */
	public static void taskOne() {

		String[] wordsCountOne = { "a", "bb", "b", "ccc", "dd", "f" };
		String[] wordsCountTwo = { "a", "bb", "b", "ccc" };
		String[] wordsCountThree = { "a", "bb", "b", "ccc" };

		countOne = new TaskOne(wordsCountOne, 1);
		countTwo = new TaskOne(wordsCountTwo, 3);
		countThree = new TaskOne(wordsCountThree, 4);

	}

	/**
	 * Helper class that prints the answers for Task Two
	 */
	public static void taskTwo() {

		String[] arrayFrontOne = { "a", "b", "c", "d" };
		String[] arrayFrontTwo = { "a", "b", "c", "d" };
		String[] arrayFrontThree = { "a", "b", "c", "d" };

		wordsFrontOne = new TaskTwo(arrayFrontOne, 1);
		wordsFrontTwo = new TaskTwo(arrayFrontTwo, 2);
		wordsFrontThree = new TaskTwo(arrayFrontThree, 3);

	}

	/**
	 * Helper class that prints the answers for Task Three
	 */
	public static void taskThree() {

		greenTicketOne = new TaskThree(1, 2, 3);
		greenTicketTwo = new TaskThree(2, 2, 2);
		greenTicketThree = new TaskThree(1, 1, 2);

	}
}
