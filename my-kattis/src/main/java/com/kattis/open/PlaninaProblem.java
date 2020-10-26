package com.kattis.open;

public class PlaninaProblem {
	public static void main(String[] args){
		int value = 2;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int numIterations = sc.nextInt();
		for(int i=0;i<numIterations;i++){
			value = value + (value-1);
		}
		System.out.println(value*value);
		sc.close();
	}
}
