package edu.aman.lazy.programmer.memoryallocation;

import java.util.List;

public class Student {
	private Long id;
	private String name;
	private List<String> cources;
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
	public List<String> getCources() {
		return cources;
	}
	public void setCources(List<String> cources) {
		this.cources = cources;
	}
	public Student(Long id, String name, List<String> cources) {
		super();
		this.id = id;
		this.name = name;
		this.cources = cources;
	}	
}
