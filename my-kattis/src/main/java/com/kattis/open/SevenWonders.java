package com.kattis.open;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class SevenWonders {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in)) ;
		char[] ch = sc.nextLine().toCharArray();
		int t=0,c=0,g=0;
		for(char c1 :ch){
			switch (c1){
				case 'T':
					t+=1;
					break;
				case 'C':
					c+=1;
					break;
				case 'G':
					g+=1;
					break;
				default:
					break;						
			}
		}
		int sum = (t*t) + (c*c) + (g*g) ;
		if(t!=0 && c!=0 && g!=0){
			if(t<=c && t<=g)
				sum+=7*t;
			else if(c<=t && c<=g)
				sum+=7*c;
			else
				sum+=7*g;
			System.out.println(sum);
		}else{
			System.out.println(sum);
		}
		sc.close();
	}
}
