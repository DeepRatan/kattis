/**
 * kattis.com
 * Problem: Knowing the position of the ball in the cup.
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 21-Aug-2019
 */
package com.kattis.open;
import java.util.Scanner;
public class TrikProblem {
	public static void main(String[] args) {
		int ballPosition = 1;
		Scanner sc = new Scanner(System.in);
		char[] moves = sc.nextLine().toCharArray();
		
		for(int i=0;i<moves.length;i++){
			if(moves[i]=='A')
				if(ballPosition==1)
					++ballPosition;
				else if(ballPosition==2)
					--ballPosition;
			
			if(moves[i]=='B')
				if(ballPosition==2)
					++ballPosition;
				else if(ballPosition==3)
					--ballPosition;
			
			if(moves[i]=='C')
				if(ballPosition==1)
					ballPosition=3;
				else if(ballPosition==3)
					ballPosition=1;
			
		}
		sc.close();
		System.out.println(ballPosition);
	}

}
