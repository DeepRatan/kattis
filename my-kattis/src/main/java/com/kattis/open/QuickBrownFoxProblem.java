package com.kattis.open;

/**
 * kattis.com
 * Problem: Pangram Problem.
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 16-May-2019
 */
import java.util.ArrayList;
import java.util.Scanner ;
import java.util.stream.IntStream;

public class QuickBrownFoxProblem {
	public static void main(String[] args) {
		String pangram = "pangram" ;
		ArrayList<Integer> asciiNumb = new ArrayList<Integer>();		
		IntStream.range(97, 123).forEach(nbr -> asciiNumb.add(nbr));		
		Scanner scanner = new Scanner(System.in);
		int noOfLines = Integer.parseInt(scanner.nextLine());
		
		String[] inputLines = new String[noOfLines];
		for(int i=0;i<noOfLines;i++){
			inputLines[i] = scanner.nextLine();
		}
		for(String s: inputLines){			
			ArrayList<Integer>duplicateAryList = new ArrayList<>(asciiNumb);
			char[] ch = s.toLowerCase().replaceAll("\\W+","").toCharArray();
			for(char c: ch){
				int a = (int) c;
				duplicateAryList.remove((Object)a);
			}
			if(duplicateAryList.size() == 0) {
				System.out.println(pangram);
			}else{
				StringBuilder sb = new StringBuilder();
				sb.append("missing ");
				for(int i: duplicateAryList) sb.append((char)i);
				System.out.println(sb);
				sb = null ;
			}			
			duplicateAryList = null;
		}
		scanner.close();
	}
}