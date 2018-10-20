package com.github.kmaslowiec;

import java.util.Arrays;

/**
 * 
 * Third task for Lions Academy at Consileon Polska
 * 
 * @author Konrad Maslowiec
 * @email kmaslowiec@gmail.com
 * 
 **/

public class TaskThree {

	private int a;
	private int b;
	private int c;
	private int result;
	private String stringResult;

	public TaskThree(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;

		greenTicket(a, b, c);
		System.out.println(toString());

	}

	/**
	 * Checks the passed numbers. 
	 * If the numbers are all different from each other, the result is 0. 
	 * If all of the numbers are the same, the result is 20. 
	 * If two of the numbers are the same, the result is 10.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return 0,10 or 20
	 */
	public int greenTicket(int a, int b, int c) {
		int[] array = { a, b, c };
		int flag = 0;

		for (int i = 0; i < array.length; i++) {
			for (int k = i + 1; k < array.length; k++) {
				if (array[i] != array[k]) {
					flag++;
				}
			}
		}

		switch (flag) {
		case 0:
			result = 20;
			stringResult = "all of the numbers are the same";
			break;
		case 2:
			result = 10;
			stringResult = "two of the numbers are the same";
			break;
		case 3:
			result = 0;
			stringResult = "the numbers are all different from each other";
			break;

		}
		return result;

	}

	/**
	 * Prints the result number and the message
	 */
	@Override
	public String toString() {
		return "Task Three: Green Lottery Numbers: " + a + " " + b + " " + c + " result: " + result + ", "
				+ stringResult;

	}

}
