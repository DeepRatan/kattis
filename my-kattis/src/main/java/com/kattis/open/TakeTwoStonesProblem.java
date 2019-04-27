package com.kattis.open;

/**
 * kattis.com
 * Problem: Two Stone Problem.
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 27-April-2019
 */

import java.util.Scanner;

public class TakeTwoStonesProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfStones = scanner.nextInt();
		
		String alice = "Alice" ;
		String bob = "Bob" ;
		String winner = null ;
		for(int i=numberOfStones;i>=0; i-=2){
			if(i==2 || i==1){
				if(i%2 !=0)
					winner = alice;
				else
					winner = bob ;
			}
		}		
		System.out.println(winner);
		scanner.close();
	}
}