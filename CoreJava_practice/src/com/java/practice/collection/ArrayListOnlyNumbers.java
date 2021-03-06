/* Create an ArrayList which will be able to store only numbers like int,float,double,etc, but
not any other data type. */
package com.java.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListOnlyNumbers {

	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
		list.add(1);
		list.add(2.0);
		list.add(0.03);
		list.add(6.997987988877);
		System.out.println("ArrayList contains the following numbers: ");
		Iterator<Number> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
