/* Initialize two character variables in a program and display the characters in alphabetical
order. Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and
second is e O/P:a,e*/
package com.java.practice;

import java.util.Scanner;

public class SortedCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char firstChar = '\u0000';
		char secondChar = '\u0000';
		boolean flag = true;
		while (flag) {
			System.out.println("Please enter the first character");
			String input1 = scanner.next();
			if (input1.length() != 1) {
				System.out.println("Please enter 1 character only.");
			} else {
				flag = false;
				firstChar = input1.charAt(0);
			}
		}
		flag = true;
		while (flag) {
			System.out.println("Please enter the second character");
			String input2 = scanner.next();
			if (input2.length() != 1) {
				System.out.println("Please enter 1 character only.");
			} else {
				flag = false;
				secondChar = input2.charAt(0);
			}
		}
		if (firstChar < secondChar) {
			System.out.println(firstChar + ", " + secondChar);
		} else {
			System.out.println(secondChar + ", " + firstChar);
		}
		scanner.close();
	}

}
