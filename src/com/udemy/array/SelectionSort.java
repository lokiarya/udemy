package com.udemy.array;

import com.udemy.Utils;

public class SelectionSort {

	public static void main(String[] args) {
		int[] input = Utils.getSortInput();
		Utils.PrintArray("Input: ", input);
		int loops = 0;
		for (int i = input.length - 1; i > 0; i--) {
			int selected = 0;
			for (int j = 1; j <= i; j++) {
				loops++;
				selected = (input[j] > input[selected]) ? j : selected;
			}
			Utils.Swap(input, selected, i);
			Utils.PrintArray(input);
		}
		Utils.PrintArray("Output: ", input);
		System.out.println("Loops: " + loops);
	}
}