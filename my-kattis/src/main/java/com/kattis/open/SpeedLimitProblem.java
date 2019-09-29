package com.kattis.open;
import java.io.BufferedInputStream;
// https://open.kattis.com/problems/speedlimit
import java.util.Scanner;
public class SpeedLimitProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		int iterations = Integer.parseInt(sc.nextLine());
		while(iterations != -1){
			int distance = 0 ;
			int t1 = 0 ;
			for(int i=0;i<iterations;i++){
				 String[] line = sc.nextLine().split("\\W+");
				 int t2 = Integer.parseInt(line[1])-t1;
				 t1=Integer.parseInt(line[1]);		 
				 distance= distance + ((Integer.parseInt(line[0]))*t2);				
			}
			System.out.println(distance +" "+"miles");
			iterations = Integer.parseInt(sc.nextLine());
		}
		sc.close();
	}
}
