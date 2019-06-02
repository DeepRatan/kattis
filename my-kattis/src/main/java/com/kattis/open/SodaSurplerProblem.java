package com.kattis.open;
/**
 * kattis.com
 * Problem: Soda Surpler. How many soda bottle have been consumed.
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 02-June-2019
 */
import java.util.Scanner;
public class SodaSurplerProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("\\W+");
		int emptySodaBottles = Integer.parseInt(input[0]);
		int emptySodaBottlesFound = Integer.parseInt(input[1]);
		int bottlesRequiredToBuyMoreSoda = Integer.parseInt(input[2]);
		int bottlesToExchange = emptySodaBottles + emptySodaBottlesFound;
		int sodaBottles = 0 ;
		int remainingBottles = 0;
		int bottlesExchanged = 0;
		do{
			bottlesExchanged = bottlesToExchange/bottlesRequiredToBuyMoreSoda ;			
			sodaBottles += bottlesExchanged;
			remainingBottles = bottlesToExchange%bottlesRequiredToBuyMoreSoda;
			bottlesToExchange=bottlesExchanged+remainingBottles; 
		}while(bottlesExchanged > 0);
		System.out.println(sodaBottles);
		scanner.close();
	}
}