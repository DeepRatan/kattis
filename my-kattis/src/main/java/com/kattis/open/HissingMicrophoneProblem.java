package com.kattis.open;
/**
 * kattis.com
 * Problem: Microphone Problem.
 * Solution attempt by Deep Ratan (deepratans@gmail.com)
 * Date: 31-May-2019
 */
import java.util.Scanner;
public class HissingMicrophoneProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputLine = scanner.nextLine();
		if(inputLine.contains("ss"))
			System.out.println("hiss");
		else
			System.out.println("no hiss");
		scanner.close();
	}
}
