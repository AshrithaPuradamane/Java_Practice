/* Write a program to check if a given number is Positive, Negative, or Zero.*/
package com.java.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberIsPositiveNegativeOrZero {

	public static void main(String[] args) {
		System.out.println("Please enter a number: \n");
		Scanner scanner = new Scanner(System.in);
		try {
			double input = scanner.nextDouble();
			if (input < 0) {
				System.out.println("Negative number.");
			} else if (input > 0) {
				System.out.println("Positive number.");
			} else {
				System.out.println("Number is zero.");
			}
		} catch (InputMismatchException e) {

			System.out.println("Entered input is not a valid number");
		}
		scanner.close();
	}
}
