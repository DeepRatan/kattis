package com.kattis.open;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class NoDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		String[] line = sc.nextLine().split("\\W+");		
		int len = line.length;
		boolean flag = true;
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(line[i].equals(line[j])){
					flag=false;
					break;
				}
			}
			if(flag==false) break;
		}
		System.out.println(flag==true?"yes":"no");
		sc.close(); 
	}
}
