package com.kattis.open;

public class BeenEveryWhereProblem {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		java.util.Set<String> cities = new java.util.HashSet<String>();
		while(testCases > 0){
			int distCities = Integer.parseInt(sc.nextLine());
			for(int i=0; i<distCities;i++){
				cities.add(sc.nextLine());
			}
			System.out.println(cities.size());
			cities.clear(); 
			testCases--;
		}
		cities=null;
		sc.close();
	}
}
