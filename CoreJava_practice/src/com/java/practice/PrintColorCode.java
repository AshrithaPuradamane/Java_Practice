/* Write a program to print the color name, based on color code. If color code in not valid
then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow,
W->White.*/
package com.java.practice;

import java.util.Scanner;

public class PrintColorCode {

	public static void main(String[] args) {
		System.out.println("Please enter a color code:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		if (input.length() == 1) {

			if (input.equals("R")) {
				System.out.println("Red");
			} else if (input.equals("B")) {
				System.out.println("Blue");
			} else if (input.equals("G")) {
				System.out.println("Green");
			} else if (input.equals("O")) {
				System.out.println("Ornge");
			} else if (input.equals("Y")) {
				System.out.println("Yellow");
			} else if (input.equals("W")) {
				System.out.println("White");
			} else {
				System.out.println("Invalid Code");
			}
		} else {
			System.out.println("Invalid Code");
		}
		scanner.close();
	}
}
