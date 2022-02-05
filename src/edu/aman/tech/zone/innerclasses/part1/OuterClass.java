package edu.aman.tech.zone.innerclasses.part1;

public class OuterClass {

	Integer number = 9;

	public void heyThere() {
		System.out.println("Hey there from Outer Class");
	}

	public static class InnerClass {

		Integer number = 10;

		public void hello() {
			System.out.println("Hello from Inner Class");
		}
	}

}
