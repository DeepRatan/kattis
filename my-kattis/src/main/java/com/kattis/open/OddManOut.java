package com.kattis.open;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.stream.Stream;

public class OddManOut {
	public static void main(String[] args){
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
//		No of test scenarios to execute
		int cases = Integer.parseInt(sc.nextLine());
		for(int i=0;i<cases;i++){
			int numGuests = Integer.parseInt(sc.nextLine());
			int[] guests = Stream.of(sc.nextLine().split("\\W+")).mapToInt(Integer::parseInt).toArray();
			int result = 0 ;			
			for(int j=0;j<numGuests;j++){				
				result^=guests[j];
			}
			System.out.println("Case #"+ (i+1)+": "+ (result>0 ? result: -1));
		}
		sc.close();
	}
}
