package com.kattis.open;

import java.util.Scanner;

public class LastFactoralDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		int noOfTestCases = Integer.parseInt(scanner.nextLine());
		int[] answer = new int[noOfTestCases];
		for(int i=0;i<noOfTestCases;i++){
			int findfactorOfNumber = Integer.parseInt(scanner.nextLine());
			int factor = 1;
			for(int j=1;j<=findfactorOfNumber;j++){
				factor *=j; 
			}
			answer[i]=factor%10;
		}
		scanner.close();
		for(int i: answer) System.out.println(i);
	}

}
