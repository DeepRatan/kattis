package com.kattis.open;

import java.io.BufferedInputStream;
import java.text.ParseException;
import java.util.Scanner;

public class SpavanacProblem {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in)) ;
		int h = scanner.nextInt(), m = scanner.nextInt();
		if(m>=45){
			System.out.println(h +" " + (m-45));
		}else{
			int mm = 60 - (45-m);
			if(h==0){
				System.out.println(23+" "+mm);
			}else{
				System.out.println((h-1)+" "+mm);
			}
		}		
		scanner.close();
	}

}
