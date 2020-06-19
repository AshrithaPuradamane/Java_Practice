/* Write a program that displays a menu with options 1. Add 2. Sub Based on the options
chosen, read 2 numbers and perform the relevant operation. After performing the
operation, the program should ask the user if he wants to continue. If the user presses y
or Y, then the program should continue displaying the menu else the program should
terminate */
package com.java.practice;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AddSubUsingDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		boolean flag = true;
		String yes = null;
		int option = 0;
		int firstNumber = 0;
		int secondNumber = 0;
		do {
			System.out.println("Please enter an option: 1:Add, 2:Sub");
			try {
				option = scanner.nextInt();
			} catch (NumberFormatException e) {
				flag = false;
				System.out.println("Please enter the input in correct format");
			} catch (InputMismatchException e) {
				System.out.println("Please enter the input in correct format");
			}
			System.out.println("Please enter 2 numbers in the format (a,b)");
			try {
				String input = scanner2.nextLine();
				StringTokenizer tokenizer = new StringTokenizer(input, ",");
				firstNumber = Integer.parseInt(tokenizer.nextToken());
				secondNumber = Integer.parseInt(tokenizer.nextToken());
			} catch (NoSuchElementException e) {
				System.out.println("Please enter the input in correct format");
			} catch (NumberFormatException e) {
				System.out.println("Please enter the input in correct format");
			}
			if (option == 1) {
				System.out.println("Add result is " + (firstNumber + secondNumber));
			} else if (option == 2) {
				System.out.println("Sub result is " + (firstNumber - secondNumber));
			} else {
				System.out.println("Please enter the option as 1 or 2 only.");
			}
			System.out.println("Do you want to continue? If yes please press Y or y");
			try {
				yes = scanner.next();
			} catch (NoSuchElementException e) {
				System.out.println("Please enter the input in correct format");
			} catch (NumberFormatException e) {
				System.out.println("Please enter the input in correct format");
			}
			if (!(yes.equalsIgnoreCase("y"))) {
				System.out.println("Program terminated.");
				flag = false;
				break;
			}

		} while (flag);
		scanner.close();
	}

}
