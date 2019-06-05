package com.kattis.open;
/**
 * kattis.com
 * Problem: Decoding and Encoding a String Problem
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 03-June-2019
 */
import java.util.Scanner;
public class RunLenghtEncodingProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("\\s+");
		StringBuilder strBuilder = new StringBuilder();
		int length = input[1].length();
		char[] charAry = input[1].toCharArray();
		if(input[0].equals("D")){			
			for(int i=1;i<length;i+=2){
				char c = charAry[i-1];
				int itr = Integer.parseInt(String.valueOf(charAry[i]));				
				for(int j=0;j<itr;j++) 
					strBuilder.append(c);
			}
		}else{
			int counter = 0;
			for(int i=0;i<length;i++){				
				if(strBuilder.length()==0) {
					strBuilder.append(charAry[i]);
					counter+=1;
				}
				else{
					if(charAry[i] == charAry[i-1]){
						counter+=1;
					}else{
						strBuilder.append(counter);
						strBuilder.append(charAry[i]);
						counter=1;
					}
				}
			}
			strBuilder.append(counter);
		}
		System.out.println(strBuilder);
		scanner.close();
	}
}