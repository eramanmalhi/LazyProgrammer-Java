package edu.aman.lazy.programmer.abstraction;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return this.length * this.width;
	}

	@Override
	public String toString() {
		return "Rectangle of color: " + super.getColor() + ", Lenght: " + this.length + ", Width: " + this.width
				+ " and Area: " + area();
	}

}
