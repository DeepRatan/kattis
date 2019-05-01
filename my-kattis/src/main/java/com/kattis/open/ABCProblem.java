package com.kattis.open;

import java.util.HashMap;
import java.util.Map;
/**
 * kattis.com
 * Problem: Problem to arrange the digit in a specific order as given on the console.
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 01-May-2019
 */
import java.util.Scanner;

public class ABCProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner lineScanner = new Scanner(scanner.nextLine());
		int[] intToCompare = new int[3];
		int counter = 0;
		while(lineScanner.hasNext()){
			intToCompare[counter] = lineScanner.nextInt();
			counter++;
		}
		String orderOfDigits = scanner.nextLine();
		for(int j=intToCompare.length-1;j>=0;j--){
		for(counter=0; counter<j;counter++){
			if(intToCompare[counter] > intToCompare[counter+1]){
				int temp = intToCompare[counter+1];
				intToCompare[counter+1] = intToCompare[counter];
				intToCompare[counter] = temp;
			}			
		}
		}
		Map<String,Integer> digitToCharMapping = new HashMap<String,Integer>();
		String[] strArray = {"A","B","C"};
		
		for(counter=0;counter<=2;counter++){
			digitToCharMapping.put(strArray[counter], intToCompare[counter]);
		}
		for(counter=0;counter<=2;counter++){
			System.out.print(digitToCharMapping.get(orderOfDigits.substring(counter, counter+1)) + " ");
		}
		lineScanner.close();
		scanner.close();
	}
}