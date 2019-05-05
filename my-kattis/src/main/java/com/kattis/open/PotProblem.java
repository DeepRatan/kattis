package com.kattis.open;

/**
 * kattis.com
 * Problem: Pot Problem where a teacher gives it students to calculate sum
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 05-May-2019
 */

import java.util.Scanner ;

public class PotProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum =0;
		/*String n = scanner.nextLine();
		String[] strArray = new String[Integer.parseInt(n)] ;
		
		for(int i=0 ; i<Integer.parseInt(n);i++){
			strArray[i] = scanner.nextLine();
			sum+=(int)Math.pow(Integer.parseInt(strArray[i].substring(0, strArray[i].length()-1)), (Integer.parseInt(strArray[i].substring(strArray[i].length()-1))));
		}*/
//		Improved code
		int n = scanner.nextInt();
		for(int i=0; i<n;i++){
			int p = scanner.nextInt();
			sum+=Math.pow(p/10, p%10);
		}
		scanner.close();
		System.out.println(sum);
	}
}