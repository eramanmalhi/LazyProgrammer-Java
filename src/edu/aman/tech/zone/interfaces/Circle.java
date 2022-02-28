package edu.aman.tech.zone.interfaces;

public class Circle implements Shape{

	private double radius;
	
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}

	@Override
	public String toString() {
		return Shape.COLOR+":"+this.radius+":"+area();
	}
	
	public Circle(double radius) {
		this.radius=radius;
	}
}
