package edu.lazy.programmer.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("John");
		names.add("Mike");
		names.add("Andy");
		names.add("Bob");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(1L, "John", "ABC"));
		students.add(new Student(2L, "Mike", "OKL"));
		students.add(new Student(3L, "Andy", "NBG"));
		students.add(new Student(4L, "Bob", "PLO"));
		System.out.println(students);
		Collections.sort(students);
		System.out.println(students);
		
	}

}
