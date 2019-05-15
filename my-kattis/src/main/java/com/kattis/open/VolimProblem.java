package com.kattis.open;

/**
 * kattis.com
 * Problem: Volim Problem
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 15-May-2019
 */

import java.util.Scanner;
public class VolimProblem {
	public static void main(String[] args) {
		int timeToExplode = 210 ;
		int timeWithContestant = 0;
		int counter=0;
		Scanner scanner = new Scanner(System.in);
		int contestant = Integer.parseInt(scanner.nextLine());
		int questions = Integer.parseInt(scanner.nextLine()) ;
		
		String[] timeSpent = new String[questions] ;

		while(counter<questions){			
			timeSpent[counter] = scanner.nextLine();
			counter+=1;
		}
		scanner.close();

		for(String s: timeSpent){
			//Split the string into two			
			int time = Integer.parseInt(s.substring(0, s.indexOf(" ")));
			char c = s.charAt(s.indexOf(" ")+1);
			timeWithContestant+=time;
			if(timeWithContestant >= timeToExplode){
				System.out.println(contestant);
				break;
			}else if(c =='T' && contestant == 8){
				contestant = 1;
			}else if(c == 'T'){
				contestant+=1;
			}
		}
	}		
}