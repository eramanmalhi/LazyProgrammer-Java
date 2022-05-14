package edu.aman.lazy.programmer.abstraction;

public class Circle extends Shape{
	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle of color: " + super.getColor() + ", Radius: " + this.radius + " and Area: " + area();
	}
	
	
}
