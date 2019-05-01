package com.kattis.open;

/**
 * kattis.com
 * Problem: Sore Throat Problem. Choosing which doctor to visit.
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 01-May-2019
 */
import java.util.Scanner;

public class SoreThroatProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String jonMariusVoice = scanner.nextLine();
		String doctorsWants = scanner.nextLine();
		if(jonMariusVoice.length() >= doctorsWants.length())
			System.out.println("go");
		else 
			System.out.println("no");
		scanner.close();
	}
}