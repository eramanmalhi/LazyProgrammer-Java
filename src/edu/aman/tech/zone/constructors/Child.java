package edu.aman.tech.zone.constructors;

public class Child extends Parent {
	public Child() {
		System.out.println("Child Class Constructor");
		super.sayHi();
	}

	public static void main(String args[]) {
		Child obj=new Child();
	}
}
