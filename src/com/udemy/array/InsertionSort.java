package com.udemy.array;

import com.udemy.Utils;

public class InsertionSort {

	public static void main(String[] args) {
		int[] input = Utils.getSortInput();
		Utils.PrintArray("Input: ", input);
		//myLogic(input);
		int loops = 0;
		for (int i = 1; i < input.length; i++) {
			if (input[i] < input[i - 1]) {
				int tmp = input[i];
				int j = i;
				for (; j > 0 && tmp < input[j - 1]; j--) {
					input[j] = input[j - 1];
				}
				input[j] = tmp;
				Utils.PrintArray(input);
			}
		}
		Utils.PrintArray("Output: ", input);
		System.out.println("Loops: " + loops);
	}

	private static void myLogic(int[] input) {
		int loops = 0;
		for (int i = 1; i < input.length; i++) {
			if (input[i] < input[i - 1]) {
				int tmp = input[i];
				for (int j = i - 1; j >= 0; j--) {
					loops++;
					if (tmp < input[j]) {
						input[j + 1] = input[j];
						if (j == 0) input[j] = tmp;
					} else {
						input[j + 1] = tmp; break;
					}
				}
				Utils.PrintArray(input);
			}
		}
		Utils.PrintArray("Output: ", input);
		System.out.println("Loops: " + loops);
	}
}

/*

20, 35, -15, 7, 55, 1, -22

20, 35, -15, 7, 55, 1, -22
-15, 20, 35, 7, 55, 1, -22
-15, 7, 20, 35, 55, 1, -22
-15, 7, 1, 20, 35, 55, -22
-22, -15, 7, 1, 20, 35, 55

*/