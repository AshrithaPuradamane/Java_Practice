/* Create an ArrayList which will be able to store only Strings. Create a printAll method
which will print all the elements using an Iterator. */
package com.java.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListOnlyStrings {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("10");
		list.add("Java");
		list.add("String");
		System.out.println("ArrayList contains the following Strings: ");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
