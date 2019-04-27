package com.kattis.open;

/**
 * kattis.com
 * Problem: Bijele Problem of Chess board pieces
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 26-April-2019
 */
import java.util.Scanner;

public class BijeleProblem {
	public static void main(String[] args) {
		int[] chess = {1,1,2,2,2,8};
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("\\W+");
		
		int i=0;
		for(String str:input){
			System.out.print(chess[i] - Integer.parseInt(str)  + " ");
			i++ ;
		}
		scanner.close();
	}
}