/* Write a program to reverse a given number and print Eg1) I/P: 1234 O/P:4321 Eg2)
I/P:1004 O/P:4001*/
package com.java.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number: \n");
		Scanner scanner = new Scanner(System.in);
		try {
			int number = scanner.nextInt();
			boolean isPositive = true;
			if (number < 0) {
				isPositive = false;
				number = number * -1;
			}
			int num = number;
			int reveredNumber = 0;
			int digit = 0;
			while (num > 0) {
				digit = num % 10;
				reveredNumber = digit + reveredNumber * 10;
				num = num / 10;
			}
			if(!isPositive) {
				reveredNumber = reveredNumber * -1;
			}
			System.out.println(reveredNumber);
		} catch (InputMismatchException e) {

			System.out.println("Entered input is not a valid number");
		}
		scanner.close();
	}

}
