package com.practice.datastructues.recursion;

public class Factorial {

	public static int factorial(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {

		System.out.println("Factorial(4): " + factorial(4));
		
	}

}
