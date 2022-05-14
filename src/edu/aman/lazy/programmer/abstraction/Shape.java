package edu.aman.lazy.programmer.abstraction;

public abstract class Shape {
	private String color;
	
	abstract double area();

	public abstract String toString();
	
	public String getColor() {
		return this.color;
	}

	public Shape(String color) {
		this.color = color;
	}

}
