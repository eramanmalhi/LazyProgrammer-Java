package edu.lazy.programmer.sorting;

public class Student implements Comparable<Student>{

	private Long id;
	private String name;
	private String college;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	public Student(Long id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}
	@Override
	public int compareTo(Student o) {
		return this.college.compareToIgnoreCase(o.college);
	}
	
	
}
