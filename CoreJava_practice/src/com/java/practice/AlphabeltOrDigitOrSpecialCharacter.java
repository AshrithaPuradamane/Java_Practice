/* Intialize a character variable in a program and if the value is alphabet then print
"Alphabet" if it’s a number then print "Digit" and for other characters print "Special
Character"*/
package com.java.practice;

import java.util.Scanner;

public class AlphabeltOrDigitOrSpecialCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a charcter:");
		char input = scanner.next().charAt(0);
		if (Character.isAlphabetic(input)) {
			System.out.println("First character is an Alphabet.");
		} else if (Character.isDigit(input)) {
			System.out.println("First character is a digit.");
		} else {
			System.out.println("First character is a special character.");
		}
		scanner.close();
	}
}
