package edu.aman.lazy.programmer.abstraction;

public class MainClass {

	public static void main(String[] args) {
		Shape shape1 = new Circle("Blue", 7);
		System.out.println(shape1.toString());
		Shape shape2 = new Rectangle("Yellow", 6, 3);
		System.out.println(shape2.toString());
	}

}
