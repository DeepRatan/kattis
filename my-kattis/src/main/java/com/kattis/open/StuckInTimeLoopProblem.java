package com.kattis.open;
/**
 * kattis.com
 * Problem: Stuck In A Time Loop.
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 28-April-2019
 */

import java.util.Scanner;

public class StuckInTimeLoopProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String magicChant ="Abracadabra";
		for(int i=1; i<=n ;i++)
			System.out.println(i+" "+magicChant);
		scanner.close();
	}
}