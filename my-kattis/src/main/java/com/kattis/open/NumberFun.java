package com.kattis.open;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.stream.Stream;

public class NumberFun {
	static String p = "Possible";
	static String i = "Impossible" ;
	public static void main(String[] args){
		Scanner sc = new Scanner(new BufferedInputStream(System.in)) ;
		int iterations = Integer.parseInt(sc.nextLine()) ;		
		for(int i=0;i<iterations;i++){
			System.out.println(result(sc.nextLine()));
		}
		sc.close();
	}
	
	private static String result(String str){
		String answer = i;
		int[] num = Stream.of(str.split("\\W+")).mapToInt(Integer::parseInt).toArray();
		if((num[0]+num[1]==num[2]) || (num[0]*num[1]==num[2])){
			answer = p ;
		}else{
			int n = num[0]<num[1]?num[0]:num[1];
			int d = num[0]>num[1]?num[0]:num[1];
			if((d-n==num[2]) || (d/n==num[2] && (d%n==0)))
				answer = p;
		}
		return answer;
	}
}
