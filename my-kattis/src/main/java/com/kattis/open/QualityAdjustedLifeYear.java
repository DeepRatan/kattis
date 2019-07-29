package com.kattis.open;
import java.util.Scanner;
public class QualityAdjustedLifeYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double qaly = 0;
		int period = sc.nextInt();
		for(int i=0;i<period;i++){
			double q=sc.nextDouble(), p=sc.nextDouble();
			qaly+=(q*p);
		}
		System.out.printf("%.3f",qaly);
		sc.close();			
	}
}