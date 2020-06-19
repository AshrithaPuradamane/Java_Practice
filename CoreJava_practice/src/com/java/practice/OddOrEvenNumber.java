/* Write a program to check if a given number is odd or even. */
package com.java.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEvenNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number: \n");
		Scanner scanner = new Scanner(System.in);
		try {
			int input = scanner.nextInt();
			if ((input % 2) == 0) {
				System.out.println("Even number.");
			} else {
				System.out.println("Odd number.");
			}
		} catch (InputMismatchException e) {

			System.out.println("Entered input is not a valid number.");
		}
		scanner.close();
	}

}