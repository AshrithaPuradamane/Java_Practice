/* Write a program to print month in words, based on input month in numbers */
package com.java.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthInWordsSwitch {

	public static void main(String[] args) {
		System.out.println("Please enter a input month in number: \n");
		Scanner scanner = new Scanner(System.in);
		String month = null;
		try {
			int input = scanner.nextInt();

			switch (input) {
			case 1:
				month = "January";
				break;
			case 2:
				month = "February";
				break;
			case 3:
				month = "March";
				break;
			case 4:
				month = "April";
				break;
			case 5:
				month = "May";
				break;
			case 6:
				month = "June";
				break;
			case 7:
				month = "July";
				break;
			case 8:
				month = "August";
				break;
			case 9:
				month = "September";
				break;
			case 10:
				month = "October";
				break;
			case 11:
				month = "November";
				break;
			case 12:
				month = "Decemer";
				break;
			default:
				System.out.println("Number should be between 1 to 12 only");
			}
			if (month != null) {
				System.out.println(month);
			}

		} catch (InputMismatchException e) {

			System.out.println("Entered input is not a valid number");
		}
		scanner.close();
	}

}
