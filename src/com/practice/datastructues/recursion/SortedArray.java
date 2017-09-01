package com.practice.datastructues.recursion;

public class SortedArray {

	public static int isSorted(int[] inputArray, int n) {
		if (n == 1) {
			return 1;
		}
		return (inputArray[n - 1] < inputArray[n - 2]) ? 0 : isSorted(inputArray, n - 1);
	}

	public static void main(String[] args) {

		int[] inputArray = { 1, 2, 3, 4, 5 };
		System.out.println("SortedArray:" + isSorted(inputArray, inputArray.length));
	}

}
