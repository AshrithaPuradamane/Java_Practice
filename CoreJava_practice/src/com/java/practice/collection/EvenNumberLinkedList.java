package com.java.practice.collection;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EvenNumberLinkedList {
	private List<Integer> A1;
	private List<Integer> A2;

	public EvenNumberLinkedList() {
		A1 = new LinkedList<>();
		A2 = new LinkedList<>();
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
		EvenNumberLinkedList evenNumerLinkedList = new EvenNumberLinkedList();
		System.out.println("Please enter an integer number ");
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		try {
			input = scanner.nextInt();
			evenNumerLinkedList.saveEvenNumbers(input);
			evenNumerLinkedList.printEvenNumbers();
			System.out.println("Please enter a number to search in the list:");
			int seachNumber = scanner.nextInt();
			int searchedNumber = evenNumerLinkedList.printEvenNumber(seachNumber);
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