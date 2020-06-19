/* Write a program to check if a given number is prime or not */
package com.java.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number: \n");
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		try {
			int number = scanner.nextInt();
			if (number == 0 || number == 1) {
				System.out.println(number + " is neither prime nor composite.");
			} else {
				for (int i = 2; i < number / 2; i++) {
					if (number % i == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println(number + " is a prime number.");
				} else {
					System.out.println(number + " is a composite number.");
				}
			}
		} catch (InputMismatchException e) {

			System.out.println("Entered input is not a valid number");
		}
		scanner.close();
	}

}
