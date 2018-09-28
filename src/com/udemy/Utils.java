package com.udemy;

import java.util.Random;

public class Utils {

	public static int[] getSortInput() {
		return (new Random()).ints((new Random()).ints(1, 5, 20).toArray()[0], -50, 50).toArray();
	}

	public static void Swap(int[] array, int i, int j) {
		if (i != j) {
			System.out.println("Swapping: " + i + ", " + j + " Values: " + array[i] + ", " + array[j]);
			int tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
		}
	}

	public static void PrintArray(String msg, int[] array) {
		String strOut = "";
		msg = (msg == null) ? "" : msg;
		for (int i = 0; i < array.length; i++) {
			strOut = strOut + ", " + array[i];
		}
		System.out.println((msg.length() > 0 ? msg + "\n" : "") + strOut.substring(2) + (msg.length() > 0 ? "\n" : ""));
	}

	public static void PrintArray(int[] array) {
		PrintArray("", array);
	}
}