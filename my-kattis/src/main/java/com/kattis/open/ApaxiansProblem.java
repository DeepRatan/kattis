package com.kattis.open;
import java.util.Scanner;
public class ApaxiansProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		String inputName = scanner.nextLine();
		int length = inputName.length();
		StringBuilder strBuilder = new StringBuilder();
		for(int i=0;i<length;i++){
			if(i==0){
				strBuilder.append(inputName.charAt(i));
			}else if(!(strBuilder.charAt(strBuilder.length()-1)==inputName.charAt(i))){
				strBuilder.append(inputName.charAt(i));
			}
		}
		System.out.println(strBuilder);
		scanner.close();
	}
}