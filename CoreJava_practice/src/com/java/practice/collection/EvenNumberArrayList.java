/* Develop a java class with a method saveEvenNumbers(int N) using ArrayList to store
even numbers from 2 to N, where N is a integer which is passed as a parameter to the
method saveEvenNumbers().
The method should return the ArrayList (A1) created. In the same class create a method
printEvenNumbers()which iterates through the arrayList A1 in step 1, and It should
multiply each number with 2 and display it in format 4,8,12….2*N. and add these
numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned.
Create a method printEvenNumber(int N) parameter is a number N. This method should
search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it should
return the Number else return zero.Hint: Use instance variable for storing the ArrayList
A1 and A2. NOTE: You can test the methods using a main method. */
package com.java.practice.collection;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EvenNumberArrayList {
	private List<Integer> A1;
	private List<Integer> A2;

	public EvenNumberArrayList() {
		A1 = new ArrayList<>();
		A2 = new ArrayList<>();
	}

	public List<Integer> saveEvenNumbers(int N) {
		for (int num = 2; num <= N; num++) {
			if ((num % 2) == 0) {
				A1.add(num);
			}
		}
		return A1;
	}

	public List<Integer> printEvenNumbers() {
		Iterator<Integer> iterator = A1.iterator();
		int N2 = 0;
		while (iterator.hasNext()) {
			N2 = iterator.next() * 2;
			System.out.println(N2);
			A2.add(N2);
		}
		return A2;

	}

	public int printEvenNumber(int N) {
		Iterator<Integer> iterator = A1.iterator();
		while (iterator.hasNext()) {
			if (iterator.next() == N) {
				return N;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		EvenNumberArrayList evenNumerArrayList = new EvenNumberArrayList();
		System.out.println("Please enter an integer number ");
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		try {
			input = scanner.nextInt();
			evenNumerArrayList.saveEvenNumbers(input);
			evenNumerArrayList.printEvenNumbers();
			System.out.println("Please enter a number to search in the list:");
			int seachNumber = scanner.nextInt();
			int searchedNumber = evenNumerArrayList.printEvenNumber(seachNumber);
			if (searchedNumber == 0) {
				System.out.println(seachNumber + " is not found in the list.");
			} else {
				System.out.println(searchedNumber + " is found in the list.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Entered input is not a valid integer number");
		}
		scanner.close();
	}

}
