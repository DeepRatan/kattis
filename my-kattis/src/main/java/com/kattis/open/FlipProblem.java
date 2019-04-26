package com.kattis.open;

import java.util.Scanner;

/**
 * kattis.com
 * Problem: Flip Problem (revers two given numbers and print the greatest one)
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 26-April-2019
 */

public class FlipProblem {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] arry = reader.nextLine().split("\\W+");
		reader.close();
		int[] intArry = new int[2];
		for(int i=0; i<arry.length;i++){
			intArry[i] = reverse(Integer.parseInt(arry[i]));
		}
		if(intArry[0] > intArry[1]){
			System.out.println(intArry[0]);
		}else
			System.out.println(intArry[1]);
	}
	
	static protected int reverse(int num){
		if(num < 10){
			return num;
		}		
		int reverseNum = 0 ;
		while(num !=0){
			reverseNum = reverseNum * 10 ;
			reverseNum = reverseNum + num%10 ;
			num = num/10;
		}
		return reverseNum;
	}
}
