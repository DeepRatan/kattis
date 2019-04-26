package com.kattis.open;

import java.util.Scanner;

/**
 * kattis.com
 * Problem: R2 Problem
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 26-April-2019
 */

public class R2Problem {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] line = reader.nextLine().split("\\W+");
		reader.close();
		int a = Integer.parseInt(line[0]) ;
		int mean = Integer.parseInt(line[1]);
		int b = (mean*2) - a ;
		System.out.println(b);
	}
}
