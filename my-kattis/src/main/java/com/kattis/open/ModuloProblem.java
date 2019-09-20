package com.kattis.open;
/**
 * kattis.com
 * Problem: Modulo Problem
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 02-Sep-2019
 */

import java.io.BufferedInputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ModuloProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		int divisor = 42, numerator=0;
		Set<Integer> modulo = new HashSet<>();
		for(int i=1;i<=10;i++){
			numerator = Integer.parseInt(sc.nextLine());
			modulo.add(numerator%divisor);
		}
		System.out.println(modulo.size());
		sc.close();
	}

}
