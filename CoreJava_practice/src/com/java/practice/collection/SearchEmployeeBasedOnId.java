/* Create an ArrayList of Employee( id,name,address,sal) objects and search for particular
Employee object based on id number.*/
package com.java.practice.collection;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee {
	private int id;
	private String name;
	private String address;
	private int salary;

	public Employee(int id, String name, String address, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getSalary() {
		return salary;
	}

}

public class SearchEmployeeBasedOnId {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "ABC", "Apt 12", 50000);
		Employee e2 = new Employee(2, "PQR", "Apt 141", 70000);
		Employee e3 = new Employee(3, "XYZ", "Apt 122", 60000);
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		System.out.println("Please enter an id to search:");
		Scanner scanner = new Scanner(System.in);
		try {
			int empid = scanner.nextInt();
			boolean flag = false;
			Iterator<Employee> it = employees.iterator();
			while (it.hasNext()) {
				if (it.next().getId() == (empid)) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("Employee with id: " + empid + " is found.");
			} else {
				System.out.println("Employee with id: " + empid + " is not found.");
			}

		} catch (InputMismatchException e) {
			System.out.println("Entered input is not a valid number.");
		}

	}

}
