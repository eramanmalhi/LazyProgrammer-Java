package edu.lazy.programmer.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample3 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Mike");
		names.add("John");
		names.add("Steve");
		// Iterating List-Iterator
		ListIterator<String> itr = names.listIterator();
		System.out.println("---------------------------------------");
		System.out.println("Forward");

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("Backward");

		while (itr.hasPrevious()) {
			System.out.print(itr.previous() + " ");
		}
		System.out.println("");
		System.out.println("---------------------------------------");
	}

}
