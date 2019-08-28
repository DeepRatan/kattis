package com.kattis.open;
/**
 * kattis.com
 * Problem: find the different Alphabets in a string.
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 28-Aug-2019
 */
import java.io.BufferedInputStream;
import java.util.Scanner;
public class AlphabetSpamProblem {
	private static void outputRatio(int group, int total) {
		System.out.println((double)group/total);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		char[] input = sc.nextLine().toCharArray();
		int len = input.length;
		
		int spaces = 0, lowerCaseLetters = 0, upperCaseLetters = 0, symbols = 0, temp = 0 ;

		for(char c: input){
			temp = (int)c;
			if(temp==95){
				++spaces;
				}else if(temp>=65 && temp <=90) {
					++upperCaseLetters;
				}else if(temp>=97 && temp<=122){
					++lowerCaseLetters;	
				}else			
					++symbols;
			}
		
		sc.close();
		outputRatio(spaces,len);
		outputRatio(lowerCaseLetters,len);
		outputRatio(upperCaseLetters,len);		
		outputRatio(symbols,len);
	}
}
