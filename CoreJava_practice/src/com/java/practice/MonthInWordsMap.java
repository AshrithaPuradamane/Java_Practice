package com.java.practice;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MonthInWordsMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Janulary");
		map.put(2, "February");
		map.put(3, "March");
		map.put(4, "April");
		map.put(5, "May");
		map.put(6, "June");
		map.put(7, "July");
		map.put(8, "August");
		map.put(9, "Sptember");
		map.put(10, "October");
		map.put(11, "November");
		map.put(12, "December");
		System.out.println("Please enter a input month in number: \n");
		Scanner scanner = new Scanner(System.in);
		try {
			int input = scanner.nextInt();
			if (input > 0 && input <= 12) {
				for (Integer number : map.keySet()) {
					if (number.equals(input)) {
						System.out.println(map.get(input));
					}
				}
			} else {
				System.out.println("Number should be between 1 to 12 only");
			}
		} catch (InputMismatchException e) {

			System.out.println("Entered input is not a valid number");
		}
		scanner.close();
	}

}
