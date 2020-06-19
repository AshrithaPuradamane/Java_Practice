/* Write a program to print prime numbers between 10 and 99. */

package com.java.practice;

public class PrimeNumbers9To99 {

	public static void main(String[] args) {
		boolean flag = true;
		System.out.println("Prime numbers between 10 to 99:");
		for (int number = 10; number < 99; number++) {
			flag = true;
			for (int i = 2; i < number / 2; i++) {
				if (number % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(number);
			}
		}

	}

}
