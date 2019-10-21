package com.kattis.open;

import java.io.BufferedInputStream;
import java.util.Scanner;
/**
 * calculate the area of the circle pi*r*r and 
 * then divide the smaller area by bigger area 
 * will return the  % percentage of cheese on the pizza
 * 
 * @author DRATAN
 *
 */
public class PizzaCrust {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in)) ;
		double r = sc.nextDouble(), c=sc.nextDouble();
		double crustRadius = r-c;
		double res = (crustRadius * crustRadius * Math.PI) / (r*r*Math.PI) ;
		System.out.println(res*100);			
		sc.close();
	}
}
