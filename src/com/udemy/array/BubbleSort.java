package com.udemy.array;

import com.udemy.Utils;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input = Utils.getSortInput();
		Utils.PrintArray("Input: ", input);
		int loops = 0;
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - 1 - i; j++) {
				loops++;
				if (input[j] < input[j + 1]) {
					Utils.Swap(input, j, j + 1);
					Utils.PrintArray(input);
				}
			}
		}
		Utils.PrintArray("Output: ", input);
		System.out.println("Loops: " + loops);
	}
}