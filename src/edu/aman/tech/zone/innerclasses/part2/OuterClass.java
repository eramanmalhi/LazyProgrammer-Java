package edu.aman.tech.zone.innerclasses.part2;

public class OuterClass {

	void outerMethod() {
		System.out.println("outerMethod from Outer Class");
		class InnerClass{
			void innerMethod() {
				System.out.println("innerMethod from Inner Class");
			}
		}
		InnerClass inner=new InnerClass();
		inner.innerMethod();
	}
}
