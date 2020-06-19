/* Write a program to add all the values in a given number and print. Ex: 1234->10 */
package com.java.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddDigitsInGivenNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number: \n");
		Scanner scanner = new Scanner(System.in);
		try {
			int number = scanner.nextInt();
			int digit;
			int sum = 0;
			for (;number > 0;number=number/10) {
				digit = number % 10;
				sum = sum + digit;
			}
			System.out.println(sum);
		} catch (InputMismatchException e) {

			System.out.println("Entered input is not a valid number");
		}
		scanner.close();
	}

}
