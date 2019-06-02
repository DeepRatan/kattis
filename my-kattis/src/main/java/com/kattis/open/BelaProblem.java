package com.kattis.open;
/**
 * kattis.com
 * Problem: Calculating the score of a card game.
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 31-May-2019
 */
import java.util.Scanner;
public class BelaProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int indexOfSpace = input.indexOf(' ');
		int hands = Integer.parseInt(input.substring(0, indexOfSpace))*4;
		String dominantSuit = input.substring(indexOfSpace+1);
		String suit = null; 
		String value = null ;
		int score = 0;
		for(int i=0;i<hands;i++){
			String line = scanner.nextLine();
			value = line.substring(0, 1);
			suit = line.substring(1);			
			switch (value){
			case "A" : score+=11;break;
			case "K" : score+=4; break;
			case "Q" : score+=3; break;
			case "J" : score+=(suit.equals(dominantSuit)?20:2); break;
			case "T" : score+=10; break ;
			case "9" : score+=(suit.equals(dominantSuit)?14:0); break;
			default  :
				break;
			}			
		}
		System.out.println(score);
		scanner.close();
	}
}