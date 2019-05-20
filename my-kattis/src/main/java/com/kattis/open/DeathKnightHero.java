package com.kattis.open;

/**
 * kattis.com
 * Problem: DeathKnightHero - To Find the number of fights won by the knight
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 20-May-2019
 */

import java.util.Scanner;
import java.util.stream.IntStream;

public class DeathKnightHero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfInputs = Integer.parseInt(scanner.nextLine());
		String input;
		int noOfWins = noOfInputs;
		for (int i = 0; i < noOfInputs; i++) {
			input = scanner.nextLine();			
			if (input.contains("CD"))
				noOfWins -= 1;
			
		}
		System.out.println(noOfWins);
		scanner.close();
	}
}