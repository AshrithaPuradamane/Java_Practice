/* Write a program that will have a Vector which is capable of storing emp objects. Use an
Iterator and enumeration to list all the elements of the Vector. */
package com.java.practice.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

class Emp {
	private int id;
	private String name;
	private String address;
	private int salary;

	public Emp(int id, String name, String address, int salary) {
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

public class PrintEmployeeUsingVector {

	public static void main(String[] args) {
		Emp e1 = new Emp(1, "ABC", "Apt 12", 50000);
		Emp e2 = new Emp(2, "PQR", "Apt 141", 70000);
		Emp e3 = new Emp(3, "XYZ", "Apt 122", 60000);
		List<Emp> employees = new Vector<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		System.out.println("Employee details present in vector:");
		Iterator<Emp> it = employees.iterator();
		while (it.hasNext()) {
			Emp e = it.next();
			System.out.println(e.getId() + " " + e.getName() + " " + e.getAddress() + " " + e.getSalary());
		}
	}

}
