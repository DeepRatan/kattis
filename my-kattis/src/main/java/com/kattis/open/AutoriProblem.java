package com.kattis.open;
/**
 * kattis.com
 * Problem: Autori Problem.
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 28-April-2019
 */

import java.util.Scanner ;

public class AutoriProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().split("-");
		for(String l:line) System.out.print(l.substring(0, 1));		
		scanner.close();
	}

}
