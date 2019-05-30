package com.kattis.open;

import java.util.Scanner;

public class FacktorProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("\\W+");
		int noOfArticles = Integer.parseInt(input[0]);
		int impact = Integer.parseInt(input[1]);
		int citations = (noOfArticles * impact) - ((noOfArticles > 1)?noOfArticles-1:0);
		System.out.println(citations);
		scanner.close();
	}
}
