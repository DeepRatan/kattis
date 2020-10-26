package com.kattis.open;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class ColdDaysProblem {
	public static void main(String[] args){
		int count = 0;
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		int numberOfDays = sc.nextInt();
		for(int i=0; i<numberOfDays;i++){
			if(sc.nextInt() < 0)
				count++;
		}		
		System.out.println(count);
		sc.close();
	}
}
