package com.kattis.open;
import java.util.Scanner;
public class HumanCannonBallProblem {
	public final static double g = 9.81;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		for(int i=0;i<cases;i++){
			double velocity=scanner.nextDouble(), angle=scanner.nextDouble(), distX=scanner.nextDouble();
			double holeY1=scanner.nextDouble(), holeY2=scanner.nextDouble();
			
			double t = distX / velocity / Math.cos(Math.toRadians(angle));
			double y = velocity * t * Math.sin(Math.toRadians(angle)) - 4.905 * Math.pow(t, 2);
			if(y-holeY1 >=1 && holeY2-y>=1)
				System.out.println("Safe");
			else
				System.out.println("Not Safe");
		}
		scanner.close();
	}	
}