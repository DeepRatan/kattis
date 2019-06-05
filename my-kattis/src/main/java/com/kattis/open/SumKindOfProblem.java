package com.kattis.open;
/**
 * kattis.com
 * Problem: Summing numbers
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 05-June-2019
 */
import java.util.Scanner;
public class SumKindOfProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfInputs = Integer.parseInt(scanner.nextLine());
		String[] inputs = new String[noOfInputs];
		for(int i=0;i<noOfInputs;i++){
			inputs[i] = scanner.nextLine();			
		}		
		for(String s: inputs){
			int s1 =0, s2=0, s3=0;
			String[] strAry = s.split("\\W+");
			int length = Integer.parseInt(strAry[1]);
			for(int i=1,j=2,k=1;i<=length;i++,j+=2,k+=2){
				s1+=i;
				s2+=k;
				s3+=j;
			}			
			System.out.println(strAry[0]+" "+s1+" "+s2+" "+s3);
		}
		scanner.close();
	}
}