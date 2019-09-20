package com.kattis.open;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class SibiceProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		int n = sc.nextInt(), w=sc.nextInt(), h=sc.nextInt();
		double len = Math.sqrt((w*w)+(h*h));
		for(int i=0;i<n;i++){
			if(len>=sc.nextInt()){
				System.out.println("DA");
			}else
				System.out.println("NE");
		}
		sc.close();
	}
}
