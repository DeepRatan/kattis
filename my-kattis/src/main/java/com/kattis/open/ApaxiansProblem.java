package com.kattis.open;
import java.util.Scanner;
public class ApaxiansProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		String inputName = scanner.nextLine();
		int length = inputName.length();
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(inputName.charAt(0));
		for(int i=1;i<length;i++){
			if(!(strBuilder.charAt(strBuilder.length()-1)==inputName.charAt(i))){
				strBuilder.append(inputName.charAt(i));
			}
		}
		System.out.println(strBuilder);
		scanner.close();
	}
}