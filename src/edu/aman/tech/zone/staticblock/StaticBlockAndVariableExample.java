package edu.aman.tech.zone.staticblock;

public class StaticBlockAndVariableExample {

	static int staticVariable;
	int nonStaticVariable;
	
	static {
		System.out.println("Static Block Called");
		staticVariable = 10;
	}
}
