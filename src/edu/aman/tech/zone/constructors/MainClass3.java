package edu.aman.tech.zone.constructors;

import java.util.ArrayList;
import java.util.List;

public class MainClass3 {
	public static void main(String[] args) {
		List<String> courses=new ArrayList<>();
		courses.add("C++");
		courses.add("Java");
		courses.add("Python");
		Student student=new Student(101L, "Amandeep", courses);
		student.displayStudentDetails();
	}
}
