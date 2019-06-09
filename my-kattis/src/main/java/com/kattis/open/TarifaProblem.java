package com.kattis.open;
/**
 * kattis.com
 * Problem: Calculating the roll over unused data to next month for a users internet plan.
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 09-June-2019
 */

import java.util.Scanner;

public class TarifaProblem {
	public TarifaProblem(){}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in) ;
		int mbLimit = Integer.parseInt(scanner.nextLine());
		int noOfMonths = Integer.parseInt(scanner.nextLine()) ;
		int dataAvailable = 0;
		for(int i=0; i<noOfMonths;i++){
			dataAvailable+=mbLimit - Integer.parseInt(scanner.nextLine());			
		}
		System.out.println(dataAvailable+mbLimit);
		scanner.close();
	}

}
