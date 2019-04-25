package com.kattis.open;

public class SumKindOfProblem {

	public static void main(String[] args) {
		int iterations = Integer.parseInt(args[0]);
		for(int i=1;i<=iterations;i++){
			int odd = 1;
			int even = 2;
			int s1=0;
			int s2=0;
			int s3=0;
			String[] stringArray = args[i].split(" ");
			int numberOfLoops = Integer.parseInt(stringArray[1]);
			for(int j=1; j<=numberOfLoops;j++){
				s1+=j;
				s2+=odd;
				s3+=even;
				odd+=2; even+=2;
			}//end of first internal for loop
			System.out.println(stringArray[0]+" "+ s1 + " " + s2 + " " + s3 );
		}//end of outer for loop
	}
}