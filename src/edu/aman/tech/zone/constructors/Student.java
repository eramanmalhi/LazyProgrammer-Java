package edu.aman.tech.zone.constructors;

import java.util.List;

public class Student {

	private Long studentId;
	private String studentName;
	private List<String> courses;

	public Student(Long studentId, String studentName, List<String> courses) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courses = courses;
	}

	public void displayStudentDetails() {
		System.out.println("Name: " + this.studentName + "\nStudent ID: " + this.studentId + "\nCourses Enrolled: "
				+ this.courses);
	}
}
