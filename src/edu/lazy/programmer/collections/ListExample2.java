package edu.lazy.programmer.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Mike");
		names.add("John");
		names.add("Steve");
		//Iterating List-Foreach loop
		System.out.println("---------------------------------------");
		System.out.println("Iterating List using foreach loop");
		for (String name : names) {
			System.out.print(name+" ");
		}
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("Iterating List using for loop");
		//Iterating List-For loop
		for (int i=0;i<names.size();i++) {
			System.out.print(names.get(i)+" ");
		}
		System.out.println("");
		System.out.println("---------------------------------------");

	}

}
