package com.kattis.open;

import java.io.BufferedInputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SecureDoors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in)) ;
		String entered = "entered", exited ="exited" ,anomaly = "(ANOMALY)";
		Set<String> set = new HashSet<String>();
		String[] line = null ;
		int len = Integer.parseInt(sc.nextLine()) ;
		for(int i=0;i<len;i++){
			line = sc.nextLine().split("\\W+");
			if(line[0].equals("entry")){
				if(!set.contains(line[1])){
					System.out.println(line[1]+" "+entered); 
					set.add(line[1]);
				}else
					System.out.println(line[1]+" "+entered+ " "+anomaly);				
			}else if(line[0].equals("exit")){
				if(set.contains(line[1])){
					System.out.println(line[1]+" "+exited); 
					set.remove(line[1]);
				}else
					System.out.println(line[1]+" "+exited+ " "+anomaly);
			}
		}
		sc.close();
	}
}
