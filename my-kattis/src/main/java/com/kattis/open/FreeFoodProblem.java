package com.kattis.open;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class FreeFoodProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		int events = sc.nextInt();
		for(int i=0;i<events;i++){
			int start = sc.nextInt();
			int end = sc.nextInt();
			for(int j=start; j<=end;j++)
				set.add(j);
		}
		System.out.println(set.size());
		sc.close();
	}
}
