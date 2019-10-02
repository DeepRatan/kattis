package com.kattis.open;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class SimonSays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in)) ;
		String input = null;
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
			input = sc.nextLine();
			if(input.startsWith("Simon says")) 
				System.out.println(input.substring(11));
		}
		sc.close();
	}
}
