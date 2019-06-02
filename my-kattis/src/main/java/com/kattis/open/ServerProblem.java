package com.kattis.open;
/**
 * kattis.com
 * Problem: Jobs which can complete for a give time on server
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 02-June-2019
 */
import java.util.Scanner;
public class ServerProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] initialInput = scanner.nextLine().split("\\W+");
		String[] jobTimings   = scanner.nextLine().split("\\W+");
		int totalServerRunTime = Integer.parseInt(initialInput[1]) ;
		int noOfJobsWhichCanBeCompleted = 0;
		int timeSpent = 0;
		for(String s: jobTimings){
			timeSpent+=Integer.parseInt(s);
			if(timeSpent > totalServerRunTime) break;
			noOfJobsWhichCanBeCompleted+=1;
		}
		System.out.println(noOfJobsWhichCanBeCompleted);
		scanner.close();
	}
}
