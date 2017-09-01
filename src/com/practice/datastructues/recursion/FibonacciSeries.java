package com.practice.datastructues.recursion;

public class FibonacciSeries {

	public static int fib(int n) {
		
		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {

		// Get the nth fibonaccii number

		System.out.println("FibonacciSeries.Get(6th): " + fib(6));
	}

}
