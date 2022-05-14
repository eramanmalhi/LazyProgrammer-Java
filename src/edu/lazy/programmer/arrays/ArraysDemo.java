package edu.lazy.programmer.arrays;

import java.util.Iterator;

public class ArraysDemo {

	public static void main(String[] args) {
		String names[]={"Aman","Karan","Amit"};
		//foreach loop
		System.out.println("Using foreach loop");
		for (String name : names) {
			System.out.println(name);
		}
		//for loop
		System.out.println("Using for loop");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}		
	}

}
