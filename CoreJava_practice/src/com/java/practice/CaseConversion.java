/* Write a program to convert from upper case to lower case and vice versa of an alphabet
and print the old character and new character as shown in example (Ex: a->A, M->m). */
package com.java.practice;

import java.util.Scanner;

public class CaseConversion {

	public static void main(String[] args) {
		System.out.println("Please enter a charcter:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		if (!(input.length() == 1)) {
			System.out.println("Entered input is not a single character.");
		} else if (Character.isAlphabetic(input.charAt(0))) {
			Character character = input.charAt(0);
			if (Character.isLowerCase(character)) {
				System.out.println(character + "->" + Character.toUpperCase(character));
			} else {
				System.out.println(character + "->" + Character.toLowerCase(character));
			}
		} else {
			System.out.println("Entered character is not an alphabet.");
		}
		scanner.close();
	}
}
