package com.practice.datastructues.recursion;

import java.util.Scanner;

public class TowersOfHanoii {

	public static void solve(int numberOfDiscs, String startPole, String auxPole, String endPole) {

		if (numberOfDiscs == 1) {
			System.out.println("Disk1 From:" +startPole + "->" + endPole);
		}

		// Move the n-1 discs from start pole to auxiliary pole making endpole as auxiliary
		solve(numberOfDiscs-1, startPole, endPole, auxPole);
		
		//Move the nth disc from startPole to endPole
		System.out.println("Disk" + numberOfDiscs + "From:" + startPole + "->" + endPole);

		//Move the n-1 discs form auxPole to endPole making startPole as auxiliary
		solve(numberOfDiscs-1, auxPole, startPole, endPole);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of discs");
		int numberOfDiscs = scanner.nextInt();
		solve(numberOfDiscs, "A", "B", "C");
		scanner.close();

	}

}
